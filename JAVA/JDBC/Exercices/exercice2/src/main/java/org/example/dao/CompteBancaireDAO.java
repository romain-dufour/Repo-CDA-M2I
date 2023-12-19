package org.example.dao;

import org.example.models.CompteBancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompteBancaireDAO extends BaseDAO<CompteBancaire>{

    public CompteBancaireDAO(Connection connection) {super(connection);}

    @Override
    public boolean save(CompteBancaire element) throws SQLException {
        request = "INSERT INTO compte_bancaire (solde, client_id) VALUES (?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSolde());
        statement.setInt(2, element.getClient().getIdentifiant());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setNumeroCompte(resultSet.getInt(1));
        }
        return nbRows == 1;
    }


    @Override
    public boolean update(CompteBancaire element) throws SQLException {
        request = "UPDATE compte_bancaire SET solde = ? WHERE client_id = ?";
        statement = _connection.prepareStatement(request);
        statement.setDouble(1, element.getSolde());
        statement.setInt(2, element.getClient().getIdentifiant());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public CompteBancaire get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<CompteBancaire> get() throws SQLException {
        List<CompteBancaire> result = new ArrayList<>();
        request = "SELECT * FROM compte_bancaire ";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            CompteBancaire compteBancaire = new CompteBancaire(
                    resultSet.getInt("compte_bancaire_id"),
                    resultSet.getDouble("solde"),
                    resultSet.getInt("client_id")

                    );
            result.add(compteBancaire);
        }
        return result;
    }
}
