package exo_1.model;

import model.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();


        //Créer cinq produits,
/*
        Produit produit1 = new Produit();
        produit1.setMarque("peugeot");
        produit1.setReference("208");
        Date dateAchat = new Date();
        produit1.setDateAchat(dateAchat);
        produit1.setPrix(10000.0);
        produit1.setStock(10);

        session.save(produit1);


        Produit produit2 = new Produit();
        produit2.setMarque("renault");
        produit2.setReference("4l");
        Date dateAchat2 = new Date();
        produit2.setDateAchat(dateAchat2);
        produit2.setPrix(300.0);
        produit2.setStock(15);

        session.save(produit2);


        Produit produit3 = new Produit();
        produit3.setMarque("land rover");
        produit3.setReference("defender");
        Date dateAchat3 = new Date();
        produit3.setDateAchat(dateAchat3);
        produit3.setPrix(35000.0);
        produit3.setStock(3);

        session.save(produit3);


        Produit produit4 = new Produit();
        produit4.setMarque("mercedes");
        produit4.setReference("s600");
        Date dateAchat4 = new Date();
        produit4.setDateAchat(dateAchat4);
        produit4.setPrix(250000.0);
        produit4.setStock(1);

        session.save(produit4);

        Produit produit5 = new Produit();
        produit5.setMarque("bmw");
        produit5.setReference("x4");
        Date dateAchat5 = new Date();
        produit5.setDateAchat(dateAchat5);
        produit5.setPrix(80000.0);
        produit5.setStock(5);


        session.save(produit5);
*/
//        Query<Produit> produitQuery = session.createQuery("from Produit ");
//
//        List<Produit> produitList = produitQuery.list();


       //  Afficher les informations du produit dont id = 2

        Produit produitByid2 = session.load(Produit.class,2L);
        System.out.println("Produit avec id 2 : " + produitByid2);

       //  Supprimer le produit dont id = 3

//        Produit produitById3 = session.load(Produit.class,3L);
//        session.delete(produitById3);

        // Modifier les informations du produit dont id = 1

        Produit produitById1 = session.load(Produit.class,1L);
        produitById1.setStock(25);
        session.update(produitById1);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
