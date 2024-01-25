package com.example.correctionproduit.servlet;

import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.services.ProduitService;
import com.example.correctionproduit.services.UtilisateurService;
import com.example.correctionproduit.utils.Definition;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet()
public class IdentificationServlet extends HttpServlet {

    private UtilisateurService service;

    public void init() {
        service = new UtilisateurService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();


        try {
            switch (action) {

                case "/register":
                    insertUser(req, resp);
                    break;
                case "/login":
                    connectUser(req, resp);
                    break;

            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        String identifiant = request.getParameter("identifiant");
        String password = request.getParameter("password");

        Utilisateur utilisateur = new Utilisateur(identifiant, password);


        if(service.create(utilisateur)) {
            response.sendRedirect("list");
        }else{
            response.sendRedirect(Definition.VIEW_PATH+"form-produit.jsp");
        }
    }

    private void connectUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {


    }
}
