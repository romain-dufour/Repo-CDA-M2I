package impl;

import dao.CommandeDAO;
import model.Commande;
import model.Produit;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class CommandeDAOImpl extends BaseService implements CommandeDAO {

    public CommandeDAOImpl(){super();}
    public void begin(){
        session = sessionFactory.openSession();
    }

    public void end(){
        session.close();
    }

    @Override
    public void add(Commande commande) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(commande);
        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void deleteCommande(Long commandeId) {

    }

    @Override
    public void updateCommande(Long commandeId) {

    }

    @Override
    public List<Commande> getCommandeList() {
        Session session = sessionFactory.openSession();
        Query<Commande> commandeQuery = session.createQuery("from Commande ");
        List<Commande>commandeList = commandeQuery.list();
        return commandeList;
    }

    public List<Commande> getCommandeListByDailyDate() {
        LocalDate daylyDate = LocalDate.now();

        Session session = sessionFactory.openSession();
        Query<Commande> commandeQuery = session.createQuery("from Commande where dateCommande = :dateNow ");
        commandeQuery.setParameter("dateNow", daylyDate);
        List<Commande>commandeList = commandeQuery.list();
        return commandeList;
    }
}
