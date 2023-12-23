package org.example.dao;

import org.example.model.Car;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAO extends BaseDAO<Car> {
    public CarDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Car element) throws SQLException {
        request = "INSERT INTO voiture (name, year, horse_power, price) VALUES (?, ?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getName());
        statement.setInt(2, element.getYear());
        statement.setInt(3, element.getHorsePower());
        statement.setDouble(4, element.getPrice());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Car element) throws SQLException {
        request = "UPDATE voiture" +
                "SET" +
                "    name = ?," +
                "    year = ?," +
                "    horse_power = ?," +
                "    price = ?" +
                "WHERE" +
                "    id_voiture = ?;";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getName());
        statement.setInt(2, element.getYear());
        statement.setInt(3, element.getHorsePower());
        statement.setDouble(4, element.getPrice());
        statement.setInt(5,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Car element) throws SQLException {
        request = "DELETE FROM voiture WHERE id_voiture = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Car get(int id) throws SQLException {
        Car car = null;
        request = "SELECT * FROM voiture WHERE id_voiture = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            car = new Car(resultSet.getInt("id_voiture"),
                    resultSet.getString("name" ),
                    resultSet.getInt( "year"),
                    resultSet.getInt("horse_power"),
                    resultSet.getDouble("price" ));
        }
        return car;
    }


    @Override
    public List<Car> get() throws SQLException {
        List<Car> result = new ArrayList<>();
        request = "SELECT * FROM voiture";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Car car = new Car(resultSet.getInt("id_voiture"),
                    resultSet.getString("name"),
                    resultSet.getInt("year"),
                    resultSet.getInt("horse_power"),
                    resultSet.getDouble("price"));
            result.add(car);
        }
        return result;
    }
}
