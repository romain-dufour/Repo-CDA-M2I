package impl;

import dao.ProduitDAO;
import model.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
    public void updateProduct(Long productId, String newMarque, String newReference, LocalDate newDate, Double newPrice, int newStock) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Produit productUpdate= session.get(Produit.class,productId);
        productUpdate.setMarque(newMarque);
        productUpdate.setReference(newReference);
        productUpdate.setDateAchat(newDate);
        productUpdate.setPrix(newPrice);
        productUpdate.setStock(newStock);

        session.update(productUpdate);

        session.getTransaction().commit();
        session.close();

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
    public List<Produit> getProductByDate(LocalDate A, LocalDate B) {
        Session session = sessionFactory.openSession();
        Query<Produit>produitQuery = session.createQuery("from Produit where dateAchat > :dateA and  dateAchat< :dateB");
        produitQuery.setParameter("dateA", A);
        produitQuery.setParameter("dateB", B);
        List<Produit>produitList = produitQuery.list();
        return produitList;
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
}
