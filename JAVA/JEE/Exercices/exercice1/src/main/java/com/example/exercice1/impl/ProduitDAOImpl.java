package com.example.exercice1.impl;

import com.example.exercice1.dao.ProduitDAO;
import com.example.exercice1.model.Produit;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;

public class ProduitDAOImpl extends BaseService implements ProduitDAO {


    public ProduitDAOImpl() {
        super();
    }

    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }

    public Produit getProductById(Long Id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Produit produit = session.get(Produit.class,Id);
        return produit;
    }

    @Override
    public void add(Produit produit) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(produit);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void deleteProduct(Long productId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Produit produit = session.get(Produit.class,productId);
        session.delete(produit);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void updateProduct(Produit produit) {

    }

    @Override
    public List<Produit> getProductList() {
        Session session = sessionFactory.openSession();
        Query<Produit>produitQuery = session.createQuery("from Produit ");
        List<Produit>produitList = produitQuery.list();
        return produitList;



    }

    @Override
    public List<Produit> getProductByPrice(Double price) {
        Session session = sessionFactory.openSession();
        Query<Produit>produitQuery = session.createQuery("from Produit where prix >:price");
        produitQuery.setParameter("price", price);
        List<Produit>produitList = produitQuery.list();
        return produitList;
    }

    @Override
    public List<Produit> getProductByDate(LocalDate A, LocalDate B) throws Exception {
        if (A.isBefore(B)){
            Session session = sessionFactory.openSession();
            Query<Produit>produitQuery = session.createQuery("from Produit where dateAchat > :dateA and  dateAchat< :dateB");
            produitQuery.setParameter("dateA", A);
            produitQuery.setParameter("dateB", B);
            return produitQuery.list();
        }
        throw new Exception("erreur date");
    }

    public List<Produit> getProductByStockValue(int stockValue){
        Session session = sessionFactory.openSession();

        Query<Produit> query = session.createQuery("from Produit where stock < :stockValue");
        query.setParameter("stockValue",stockValue);

        List<Produit>produitList = query.list();
        return produitList;
    }
    public double DisplayStockValueByMark(String marque){
        Session session = sessionFactory.openSession();

        double valeurStock =0.0;

        Query<Produit> query = session.createQuery("from Produit where marque LIKE :marque");
        query.setParameter("marque",marque);

        List<Produit>produitList = query.list();

        for (Produit p : produitList
        ) {
            int stock = p.getStock();
            double prix = p.getPrix();
            double v = stock * prix;
            valeurStock += v;
        }
        return valeurStock;
    }


    public double averagePrice(){
        Session session = sessionFactory.openSession();
        double moyennePrix = (double) session.createQuery("select avg(prix) from Produit").uniqueResult();
        return moyennePrix;
    }

    public List<Produit> listProductByMark(String marque){
        Session session = sessionFactory.openSession();

        Query<Produit> query = session.createQuery("from Produit where marque LIKE :marque");
        query.setParameter("marque",marque);

        List<Produit>produitList = query.list();

        return produitList;
    }


    public void deleteByMark (String marque){
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Query<Produit> query = session.createQuery("from Produit where marque LIKE :marque");
        query.setParameter("marque",marque);

        List<Produit>produitList = query.list();

        for (Produit p : produitList
             ) {
            session.delete(p);
        }
        session.getTransaction().commit();
        session.close();

    }


    public List<Produit> getProductByNote() {
        Session session = sessionFactory.openSession();
        Query<Long>subquery = session.createQuery("select distinct p.id from Produit p join p.commentaireList c group by p.id having avg(c.note) > :averageNote", Long.class);
        subquery.setParameter("averageNote", 4.0);

        Query<Produit> produitQuery  = session.createQuery("from Produit p where p.id in :productIds", Produit.class);
        produitQuery.setParameter("productIds", subquery.list());

        List<Produit>produitList = produitQuery.list();
        session.close();
        return produitList;
    }
}
