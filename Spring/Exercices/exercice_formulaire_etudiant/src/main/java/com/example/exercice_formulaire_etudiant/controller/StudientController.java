package com.example.exercice_formulaire_etudiant.controller;

import com.example.exercice_formulaire_etudiant.model.Studient;
import com.example.exercice_formulaire_etudiant.service.StudientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudientController {
    private final StudientServiceImpl studientService;


    @Autowired
    public StudientController(StudientServiceImpl studientService) {
        this.studientService = studientService;
    }

    @GetMapping
    public String homePage(){
        return "home";
    }


    @GetMapping("/add")
    public String addStudient(Model model){
        model.addAttribute("Studient", new Studient());
        return "form/formInscription";
    }

    @GetMapping("/list")
    public String listingStudient(Model model){
        List<Studient> studients = studientService.findAllStudient();
        Studient studient = studients.get(0);
        model.addAttribute("idStudient",studient.getId());

        model.addAttribute("studients",studients);
        return "listingStudients";
    }






}
