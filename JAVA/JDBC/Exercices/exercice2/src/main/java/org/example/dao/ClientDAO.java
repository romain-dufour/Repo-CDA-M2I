package org.example.dao;

import org.example.models.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientDAO extends BaseDAO<Client> {
    public ClientDAO(Connection connection) {super(connection);}

    @Override
    public boolean save(Client element) throws SQLException {
        request = "INSERT INTO client (nom, prenom,numero_telephone) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getNom());
        statement.setString(2, element.getPrenom());
        statement.setString(3, element.getNumeroTelephone());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setIdentifiant(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Client element) throws SQLException {
        request = "UPDATE client SET nom = ?, prenom = ?, numero_telephone = ? WHERE client_id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getNom());
        statement.setString(2, element.getPrenom());
        statement.setString(3,element.getNumeroTelephone());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Client get(int id) throws SQLException {
        Client client = null;
        request = "SELECT * FROM Client WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            client = new Client(
                    resultSet.getInt("client_id"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getString("numero_telephone"))
            ;
        }
        return client;
    }

    @Override
    public List<Client> get() throws SQLException {
        return null;
    }

}
