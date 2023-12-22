package org.example.dao;

import org.example.model.Person;
import org.example.model.Sales;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalesDAO extends BaseDAO<Sales> {
    public SalesDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Sales element) throws SQLException {
        request = "INSERT INTO vente (id_voiture, id_person, vente_date) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.getCarId());
        statement.setInt(2, element.getPersonId());
        statement.setDate(3, element.getDate());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Sales element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Sales element) throws SQLException {
        return false;
    }


    @Override
    public List<Sales> get() throws SQLException {
        List<Sales> result = new ArrayList<>();
        request = "SELECT * FROM vente";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Sales sales = new Sales(resultSet.getInt("id_vente"),
                    resultSet.getInt("id_voiture"),
                    resultSet.getInt("id_person"),
                    resultSet.getDate("vente_date").toLocalDate());
            result.add(sales);
        }
        return result;
    }


    // 11. Afficher la liste des ventes d’un véhicule pour une personne

    public List<Sales> getListSalesForOnePerson() throws SQLException {
        List<Sales> result = new ArrayList<>();
        request = "SELECT * FROM vente WHERE id_voiture = ? AND id_person = ?;";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Sales sales = new Sales(resultSet.getInt("id_vente"),
                    resultSet.getInt("id_voiture"),
                    resultSet.getInt("id_person"),
                    resultSet.getDate("vente_date").toLocalDate());
            result.add(sales);
        }
        return result;
    }
}
