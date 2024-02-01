package com.example.tp_hopital.controller;

import com.example.tp_hopital.repository.ConsultationRepository;
import com.example.tp_hopital.repository.FicheSoinRepository;
import com.example.tp_hopital.repository.PrescriptionRepository;
import com.example.tp_hopital.service.ConsultationService;
import com.example.tp_hopital.service.FicheSoinService;
import com.example.tp_hopital.service.PrescriptionService;
import com.example.tp_hopital.util.HibernateSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "consultation", value = "/consultation")
public class ConsultationServlet  extends HttpServlet {
    private ConsultationService consultationService;
    private PrescriptionService prescriptionService;
    private FicheSoinService ficheSoinService;
    public void init() {
        consultationService = new ConsultationService(HibernateSession.getSessionFactory(), new ConsultationRepository());
        prescriptionService = new PrescriptionService(HibernateSession.getSessionFactory(),new PrescriptionRepository());
        ficheSoinService = new FicheSoinService(HibernateSession.getSessionFactory(),new FicheSoinRepository());
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
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/newPatient":
                    showNewFormPatient(request, response);
                    break;
                case "/newConsultation":
                    showNewFormConsultation(request, response);
                    break;
                case "/newFicheDeSoin":
                    showNewFormFiche(request, response);
                    break;
                case "/newPrescription":
                    showNewFormPrescription(request, response);
                    break;
                case "/insert_patient":
                    insertPatient(request, response);
                    break;
                case "/insert_consultation":
                    insertConsultation(request, response);
                    break;
                case "/insert_fiche_de_soin":
                    insertfiche(request, response);
                    break;
                case "/insert_prescription":
                    insertprescription(request, response);
                    break;
                case "/patientList":
                    patientList(request, response);
                    break;
                case "/detailsPatient":
                    patientDetails(request, response);
                    break;
                case "/detailsConsultation":
                    consultationDetails(request, response);
                    break;




            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}
