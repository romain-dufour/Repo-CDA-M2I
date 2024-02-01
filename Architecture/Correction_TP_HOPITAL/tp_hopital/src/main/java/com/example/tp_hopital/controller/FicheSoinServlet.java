package com.example.tp_hopital.controller;

import com.example.tp_hopital.repository.FicheSoinRepository;
import com.example.tp_hopital.repository.PrescriptionRepository;
import com.example.tp_hopital.service.FicheSoinService;
import com.example.tp_hopital.service.PrescriptionService;
import com.example.tp_hopital.util.HibernateSession;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "ficheSoin", value = "/ficheSoin")
public class FicheSoinServlet {
    private FicheSoinService ficheSoinService;

    public void init(){
        ficheSoinService = new FicheSoinService(HibernateSession.getSessionFactory(),new FicheSoinRepository());

    }

}
