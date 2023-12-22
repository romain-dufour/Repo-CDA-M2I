package org.example.service;

import org.example.dao.CarDAO;
import org.example.dao.PersonDAO;
import org.example.dao.SalesDAO;
import org.example.model.Car;
import org.example.model.Person;
import org.example.util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class VenteVoitureService {

    private CarDAO carDAO;
    private PersonDAO personDAO;
    private SalesDAO salesDAO;
    private Connection connection;


    public  VenteVoitureService(){
            connection = DatabaseManager.getConnection();
            carDAO = new CarDAO(connection);
            personDAO = new PersonDAO(connection);
            salesDAO = new SalesDAO(connection);
    }

    public boolean createCar(String name, int year, int horsePower, Double price){
        Car car = new Car();
        car.setName(name);
        car.setYear(year);
        car.setHorsePower(horsePower);
        car.setPrice(price);
        try {
            return carDAO.save(car);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean createPerson(String firstName,String lastName,int age,double price){
        Person person = new Person();
        person.setLastName(lastName);
        person.setFirstName(firstName);
        person.setAge(age);
        person.setPrice(price);
        try {
            return personDAO.save(person);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
