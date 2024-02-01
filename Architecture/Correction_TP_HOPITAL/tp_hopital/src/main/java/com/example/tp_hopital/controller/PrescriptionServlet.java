package com.example.tp_hopital.controller;

import com.example.tp_hopital.repository.PrescriptionRepository;
import com.example.tp_hopital.service.PrescriptionService;
import com.example.tp_hopital.util.HibernateSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "prescription", value = "/prescription")
public class PrescriptionServlet extends HttpServlet {

    private PrescriptionService prescriptionService;

    public void init(){
        prescriptionService = new PrescriptionService(HibernateSession.getSessionFactory(),new PrescriptionRepository());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

    }


}
