package com.example.correctionproduit.services;

import com.example.correctionproduit.entities.Produit;
import com.example.correctionproduit.entities.Utilisateur;
import com.example.correctionproduit.interfaces.Repository;
import org.hibernate.query.Query;

import java.util.List;

public class UtilisateurService extends BaseService implements Repository<Utilisateur> {
    @Override
    public boolean create(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Utilisateur o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Utilisateur findById(int id) {
        Utilisateur utilisateur = null;
        session = sessionFactory.openSession();
        utilisateur = (Utilisateur) session.get(Utilisateur.class, id);
        session.close();
        return utilisateur;
    }

    @Override
    public List<Utilisateur> findAll() {
        List<Utilisateur> utilisateurList = null;
        session = sessionFactory.openSession();
        Query<Utilisateur> utilisateurQuery = session.createQuery("from Utilisateur");
        utilisateurList = utilisateurQuery.list();
        session.close();
        return utilisateurList;    }
}
