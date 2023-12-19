package org.example.dao;

import org.example.models.Operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OperationDAO extends BaseDAO<Operation>{

    public OperationDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Operation element) throws SQLException {
        request = "INSERT INTO operation (montant, statut,compte_bancaire_id) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getMontant());
        statement.setString(2, element.getStatut().name());
        statement.setInt(3, element.getNumero());

        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setNumero(resultSet.getInt(1));
        }
        return nbRows == 1;    }

    @Override
    public boolean update(Operation element) throws SQLException {
        return false;
    }

    @Override
    public Operation get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operation> get() throws SQLException {

        List<Operation> result = new ArrayList<>();
        request = "SELECT * FROM operation";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Operation operation = new Operation(
                    resultSet.getInt("operation_id"),
                    resultSet.getInt("montant"),
                    resultSet.getString("statut"));
            result.add(operation);
        }
        return result;
    }
}
