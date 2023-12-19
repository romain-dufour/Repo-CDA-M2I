package org.example.service;

import org.example.dao.ClientDAO;
import org.example.models.Client;
import org.example.utils.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class ClientService {
    private ClientDAO clientDAO;
    private Connection connection;

    public ClientService(){
        try {
            connection = new DataBaseManager().getConnection();
            clientDAO = new ClientDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }    }

    public boolean createClient(String nom, String prenom, String numeroTelephone){
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setNumeroTelephone(numeroTelephone);
        try {
            return clientDAO.save(client);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
