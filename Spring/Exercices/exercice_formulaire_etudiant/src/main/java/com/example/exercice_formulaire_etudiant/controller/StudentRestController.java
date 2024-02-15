package com.example.exercice_formulaire_etudiant.controller;


import com.example.exercice_formulaire_etudiant.model.Student;
import com.example.exercice_formulaire_etudiant.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/academy")
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping("/student/{id}")
    public Student addStudent(@PathVariable UUID id){

        Student student = studentService.searchStudentById(id);
        return student;
    }


    @GetMapping(value = "/students")
    public List<Student> getAllStudents(){
        return studentService.findAllStudent();
    }


    @PostMapping("/add")  //http://localhost:8080/api/v1/academy/add
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }


    @DeleteMapping("/{id}") //http://localhost:8080/api/v1/academy/student/x
    public boolean deleteStudent(@PathVariable UUID id){
        studentService.deleteStudent(id);
        System.out.println(id);
        return true;
    }

    @PutMapping("/{id}") //http://localhost:8080/api/v1/academy/student/x
    public Student updateStudent(@PathVariable UUID id ,@RequestBody Student updatedStudent){

        return studentService.updateStudent(id,updatedStudent);

    }
//        Student optionalStudent = studentService.findAllStudent().stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
//
//        if(optionalStudent != null){
//            Student existingStudent = new Student();
//            existingStudent.setId(id);
//            existingStudent.setLastName(updatedStudent.getLastName());
//            existingStudent.setFirstName(updatedStudent.getFirstName());
//            existingStudent.setAge(updatedStudent.getAge());
//            existingStudent.setEmail(updatedStudent.getEmail());
//
//            return existingStudent;
//        } else {
//            return null;
//        }
//    }
}
