package com.example.correctionproduit.servlet;

import com.example.correctionproduit.entities.Produit;
import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.services.ProduitService;
import com.example.correctionproduit.services.UtilisateurService;
import com.example.correctionproduit.utils.Definition;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@WebServlet("/")
@MultipartConfig(maxFileSize = 1024*1024*10)
public class ProduitServlet extends HttpServlet {

    private ProduitService service;
    private UtilisateurService service2;



    public void init() {

        service = new ProduitService();
        service2 = new UtilisateurService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/register":
                    insertUser(request, response);
                    break;
                case "/login":
                    connectUser(request, response);
                    break;
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertProduct(request, response);
                    break;
                case "/delete":
                    deleteProduct(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/details":
                    showProduct(request, response);
                    break;
                case "/update":
                    updateProduct(request, response);
                    break;
                case "/list":
                    listProduct(request, response);
                    break;
                default:
                    listProduct(request, response);
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
        request.getRequestDispatcher(Definition.VIEW_PATH+"form-connexion.jsp").forward(request,response);

        if(service2.create(utilisateur)) {
            response.sendRedirect("list");
        }else{
            response.sendRedirect(Definition.VIEW_PATH+"form-connexion.jsp");
        }
    }

    private void connectUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {


    }


//    private void connectionForm(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
////        HttpSession session = request.getSession();
////
////
////        request.setAttribute("produits", service.findAll());
////        request.getRequestDispatcher(Definition.VIEW_PATH+"produits.jsp").forward(request,response);
//
//        HttpSession session = request.getSession();
//        session.setAttribute("isLogged", true);
//    }
    private void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        HttpSession session = request.getSession();


        boolean logged = (session.getAttribute("isLogged")!=null) ? (boolean) session.getAttribute("isLogged") :false;


        if (logged) {
           // request.getRequestDispatcher(Definition.VIEW_PATH+"form-connexion.jsp").forward(request,response);
            response.sendRedirect("register");
        }else {
            request.setAttribute("produits", service.findAll());
            request.getRequestDispatcher(Definition.VIEW_PATH+"produits.jsp").forward(request,response);
        }

    }



    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(Definition.VIEW_PATH+"form-produit.jsp");
        dispatcher.forward(request, response);
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        if(request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Produit produit = service.findById(id);
            request.setAttribute("produit", produit);
            request.getRequestDispatcher(Definition.VIEW_PATH+"produit.jsp").forward(request,response);
        }
        else {
            request.setAttribute("produits", service.findAll());
            request.getRequestDispatcher(Definition.VIEW_PATH+"produits.jsp").forward(request,response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {

        if(request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Produit produit = service.findById(id);
            request.setAttribute("produit", produit);
            request.getRequestDispatcher(Definition.VIEW_PATH+"produit.jsp").forward(request,response);
        }
        else {
            request.setAttribute("produits", service.findAll());
            request.getRequestDispatcher(Definition.VIEW_PATH+"produits.jsp").forward(request,response);
        }

    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        String uploadPath = getServletContext().getRealPath("/") + "images";


        File file = new File(uploadPath);

        if(!file.exists()){
            file.mkdir();
        }

        Part image = request.getPart("image");

        String fileName = image.getSubmittedFileName();
        image.write(uploadPath + File.separator + fileName);


        String marque = request.getParameter("marque");
        String reference = request.getParameter("reference");
        int stock = Integer.parseInt(request.getParameter("stock"));
        double prix = Double.parseDouble(request.getParameter("prix"));
        LocalDate dateAchat = LocalDate.parse(request.getParameter("dateAchat"));
        String url = "images/"+fileName;
        Produit produit = new Produit(marque, reference, Date.from(dateAchat.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), prix, stock,url);


        if(service.create(produit)) {
            response.sendRedirect("list");
        }else{
            response.sendRedirect(Definition.VIEW_PATH+"form-produit.jsp");
        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Produit produit = service.findById(id);
        if(produit != null){
            service.delete(produit);
        }
        response.sendRedirect("list");
    }



}
