package com.example.tp_hopital.controller;

import com.example.tp_hopital.repository.ConsultationRepository;
import com.example.tp_hopital.repository.PatientRepository;
import com.example.tp_hopital.service.ConsultationService;
import com.example.tp_hopital.service.PatientService;
import com.example.tp_hopital.util.HibernateSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.hibernate.Session;

import java.io.IOException;


@WebServlet(name = "patient", value = "/patient")
public class PatientServlet extends HttpServlet {

    private PatientService patientService;
    private ConsultationService consultationService;


    public void init() {

        consultationService = new ConsultationService(HibernateSession.getSessionFactory(), new ConsultationRepository());
        patientService = new PatientService(HibernateSession.getSessionFactory(), new PatientRepository());
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        boolean logged = (session.getAttribute("isLogged") != null) ? (boolean) session.getAttribute("isLogged") : false;

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/newPatient":
                    showNewFormPatient(request, response);
                    break;



            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }


}
