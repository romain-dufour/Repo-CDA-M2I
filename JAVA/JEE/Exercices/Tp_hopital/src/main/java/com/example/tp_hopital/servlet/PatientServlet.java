package com.example.tp_hopital.servlet;

import com.example.tp_hopital.services.PatientService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

@WebServlet("/")
@MultipartConfig(maxFileSize = 1024*1024*10)
public class PatientServlet extends HttpServlet {

    private PatientService service;

    public void init(){
        service = new PatientService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        boolean logged = (session.getAttribute("isLogged") != null) ? (boolean)session.getAttribute("isLogged") : false;

        String action = req.getServletPath();

        try {
            switch (action){
                case "/insert_patient":
                    insertPatient(req,resp);
                    break;
                case "insert_consultation":
                    insertConsultation(req,resp);
                    break;
                case "insert_fiche_de_soin":
                    insertConsultation(req,resp);
                    break;
                case "insert_prescription":
                    insertConsultation(req,resp);
                    break;



            }
        }catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


    private void insertPatient (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {

        Part photoPart = request.getPart("photo");

        String fileType = photoPart.getContentType();

        if(fileType.equalsIgnoreCase("photo/jpg")){

            byte[] imageBytes = null;
            if (photoPart != null) {
                InputStream inputStream = photoPart.getInputStream();
                imageBytes = inputStream.readAllBytes();
            }





    }




}
