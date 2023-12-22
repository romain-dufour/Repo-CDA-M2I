package org.example.dao;

import org.example.model.Car;
import org.example.model.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO extends BaseDAO<Person> {
    public PersonDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Person element) throws SQLException {
        request = "INSERT INTO person (last_name, first_name, age, price) VALUES (?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getLastName());
        statement.setString(2, element.getFirstName());
        statement.setInt(3, element.getAge());
        statement.setDouble(4, element.getPrice());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Person element) throws SQLException {
        request = "UPDATE person" +
                "SET" +
                "    last_name = ?," +
                "    first_name = ?," +
                "    age = ?," +
                "    price = ?" +
                "WHERE" +
                "    id_person = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getLastName());
        statement.setString(2, element.getFirstName());
        statement.setInt(3, element.getAge());
        statement.setDouble(4, element.getPrice());
        statement.setInt(5,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Person element) throws SQLException {
        request = "DELETE FROM person WHERE id_personne = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }


    @Override
    public List<Person> get() throws SQLException {
        List<Person> result = new ArrayList<>();
        request = "SELECT * FROM Person";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            Person person = new Person(resultSet.getInt("id_person"),
                    resultSet.getString("last_name"),
                    resultSet.getString("first_name"),
                    resultSet.getInt("age"),
                    resultSet.getDouble("price"));
            result.add(person);
        }
        return result;
    }
}
