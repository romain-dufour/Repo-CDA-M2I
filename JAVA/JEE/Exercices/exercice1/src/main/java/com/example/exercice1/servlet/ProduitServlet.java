package com.example.exercice1.servlet;

import com.example.exercice1.impl.ProduitDAOImpl;
import com.example.exercice1.model.Produit;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "produit", value = "/produit")
public class ProduitServlet extends HttpServlet {

    private static SessionFactory sessionFactory;
    private static ProduitDAOImpl produitDAO;

    private List<Produit>produitList;

    @Override
    public void init(ServletConfig config) throws ServletException {
        produitList = new ArrayList<>();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        produitDAO = new ProduitDAOImpl();

        produitList = produitDAO.getProductList();

        req.setAttribute("produits", produitList);
        req.getRequestDispatcher("Produit-list.jsp").forward(req,resp);
    }

    protected void dogetDetails(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        produitDAO = new ProduitDAOImpl();

        Produit produit = new Produit();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        produitDAO = new ProduitDAOImpl();

        String marque = req.getParameter("marque");
        String reference = req.getParameter("reference");
        String dateAchatString = req.getParameter("dateAchat");
        String prixString = req.getParameter("prix");
        String stockString = req.getParameter("stock");

        // Parsing date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as per your requirement
        Date dateAchat = null;

        if (dateAchatString != null && !dateAchatString.isEmpty()) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as per your requirement
            try {
                dateAchat = dateFormat.parse(dateAchatString);
            } catch (ParseException e) {
                e.printStackTrace(); // Handle the exception according to your needs
            }
        } else {
            try {
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                dateAchat = dateFormat.parse("2000-01-01");
            } catch (ParseException e) {
                e.printStackTrace(); // Handle the exception according to your needs
            }
        }

        // Parsing price
        Double prix = null;
        try {
            prix = Double.parseDouble(prixString);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        // Parsing stock
        int stock = 0; // Default value, you can change this as per your requirements
        try {
            stock = Integer.parseInt(stockString);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
        Produit produit = new Produit(marque,reference,dateAchat,prix,stock);
        produitDAO.add(produit);

        req.setAttribute("produits", produitList);
        req.getRequestDispatcher("Produit-list.jsp").forward(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        produitDAO = new ProduitDAOImpl();

        String idString = req.getParameter("id");

        Long id = Long.parseLong(idString);

        produitDAO.deleteProduct(id);

        req.setAttribute("produits", produitList);
        req.getRequestDispatcher("Produit-list.jsp").forward(req,resp);
    }
}
