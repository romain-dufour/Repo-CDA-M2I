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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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

        if(req.getParameter("action").equals("delete")){
            try {
                deleteUser(req, resp);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

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
        LocalDate dateAchat = LocalDate.parse((req.getParameter("dateAchat")));
        Double prix = Double.parseDouble(req.getParameter("prix"));
        int stock = Integer.parseInt(req.getParameter("stock"));


        Produit produit = new Produit(marque,reference,Date.from(dateAchat.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()),prix,stock);
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

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Produit produit = produitDAO.getProductById(id);
        if(produit != null){
            produitDAO.deleteProduct(id);
        }
        response.sendRedirect("list");
    }
}
