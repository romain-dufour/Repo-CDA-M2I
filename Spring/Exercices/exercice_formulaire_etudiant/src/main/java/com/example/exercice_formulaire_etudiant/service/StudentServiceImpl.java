package com.example.exercice_formulaire_etudiant.service;

import com.example.exercice_formulaire_etudiant.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final Map<UUID, Student> students;

    public StudentServiceImpl() {
        students = new HashMap<>();
        Student studentA = Student.builder()
                .id(UUID.randomUUID())
                .lastName("Dufour")
                .firstName("Romain")
                .age(34)
                .email("dufour.romain@gmail.com")
                .build();
        Student studentB = Student.builder()
                .id(UUID.randomUUID())
                .lastName("Dubois")
                .firstName("Paul")
                .age(24)
                .email("dubois-paul@gmail.com")
                .build();
        Student studentC = Student.builder()
                .id(UUID.randomUUID())
                .lastName("Dumont")
                .firstName("Pierre")
                .age(35)
                .email("pierre.dumont@gmail.com")
                .build();
        Student studientD = Student.builder()
                .id(UUID.randomUUID())
                .lastName("Malaval")
                .firstName("Louis")
                .age(84)
                .email("M.Loulou@yahoo.com")
                .build();

        students.put(studentA.getId(),studentA);
        students.put(studentB.getId(),studentB);
        students.put(studentC.getId(),studentC);
        students.put(studientD.getId(),studientD);
    }

    @Override
    public Student addStudent(Student student) {
        if (student.getId() == null){
            student.setId(UUID.randomUUID());
            students.put(student.getId(),student);
            return student;
        }else {
        return null;}
    }

    @Override
    public Student searchStudentById(UUID id) {
        return students.values().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAllStudent() {
        return students.values().stream().toList();
    }

    @Override
    public List<Student> getStudentByLastName(String search) {
        return students.values().stream()
                .filter(student -> student.getLastName().toLowerCase().startsWith(search.toLowerCase()) || student.getFirstName().toLowerCase().startsWith(search.toLowerCase()))
                .toList();    }


    @Override
    public boolean deleteStudent(UUID id) {
        if (searchStudentById(id) != null){
            students.remove(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Student updateStudent(UUID id, Student updateStudent) {
        Student studentExist = searchStudentById(id);
        if (studentExist != null){
            studentExist.setLastName(updateStudent.getLastName());
            studentExist.setFirstName(updateStudent.getFirstName());
            studentExist.setAge(updateStudent.getAge());
            studentExist.setEmail(updateStudent.getEmail());
        }
        return studentExist;
    }


}
