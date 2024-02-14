package com.example.exercice_formulaire_etudiant.controller;

import com.example.exercice_formulaire_etudiant.model.Student;
import com.example.exercice_formulaire_etudiant.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {
    private final StudentServiceImpl studentService;


    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String homePage(){
        return "home";
    }


    @GetMapping("/add")
    public String addStudent(Model model){
        model.addAttribute("Student", new Student());
        return "form/formInscription";
    }

    @GetMapping("/list")
    public String listingStudent(Model model){
        List<Student> students = studentService.findAllStudent();
        System.out.println(students);
//
//        Student student = students.get(0);
//        model.addAttribute("idStudent",student.getId());
//
        model.addAttribute("students",students);
        return "listingStudents";
    }

    @PostMapping("/add")
    public String submitRabbit(@ModelAttribute("student") Student student){
        System.out.println(student.getLastName());
        studentService.addStudent(student);
        return "redirect:/list";
    }

    @GetMapping("/details/{studentId}")
    public String detailStudent(@PathVariable("studentId") UUID id, Model model){
        Student student = studentService.searchStudentById(id);
        model.addAttribute("myStudent",student);
        return "detailsStudent";
    }

    @GetMapping("/searchByName")
    public String searchByName(@RequestParam("search") String search, Model model){
        System.out.println(search);

        List<Student> students = studentService.getStudentByLastName(search);
        model.addAttribute("students", students);
        return "listingStudents";
    }


}
