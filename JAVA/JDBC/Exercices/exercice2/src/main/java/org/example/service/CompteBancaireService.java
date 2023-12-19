package org.example.service;

import org.example.dao.ClientDAO;
import org.example.dao.CompteBancaireDAO;
import org.example.models.CompteBancaire;
import org.example.utils.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class CompteBancaireService {
    private CompteBancaireDAO compteBancaireDAO;
    private Connection connection;

    public CompteBancaireService(){
        try {
            connection = new DataBaseManager().getConnection();
            compteBancaireDAO = new CompteBancaireDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createCompteBancaire(int clientID){
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.setSolde(0);
        compteBancaire.setClientId(clientID);
        try {
            return compteBancaireDAO.save(compteBancaire);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateCompteBancaire(CompteBancaire compteBancaire){
        try {
            return compteBancaireDAO.update(compteBancaire);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
