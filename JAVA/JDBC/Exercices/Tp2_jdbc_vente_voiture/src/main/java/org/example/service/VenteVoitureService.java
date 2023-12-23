package org.example.service;

import org.example.dao.CarDAO;
import org.example.dao.PersonDAO;
import org.example.dao.SalesDAO;
import org.example.model.Car;
import org.example.model.Person;
import org.example.model.Sales;
import org.example.util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

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

    public boolean registerCar(String name, int year, int horsePower, Double price){
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

    public List<Car> listAllCar(){
        try {
            return carDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean deleteCar(int id){
        Car car = null;
        try {
            car = carDAO.get(id);
            if (car != null){
                return carDAO.delete(car);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean updateCar(Car car){
        try {
            return carDAO.update(car);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Car getCar(int id){
        try {
            return carDAO.get(id);
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
    public Person getPerson(int id){
        try {
            return personDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Person> listAllPersons(){
        try {
            return personDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean deletePerson(int id){
        Person person= null;
        try {
            person = personDAO.get(id);
            if (person != null){
                return personDAO.delete(person);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean updatePerson(Person person){
        try {
            return personDAO.update(person);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean makeASale(int carId, int personId, Date date){
        Sales sales = new Sales();
        sales.setCarId(carId);
        sales.setPersonId(personId);
        sales.setDate((java.sql.Date) date);
        try {
            return salesDAO.save(sales);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Sales getSale(int id){
        try {
            return salesDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Sales> listAllSales(){
        try {
            return salesDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Sales> listSalesFromAPerson(int carId, int personId){
        try {
            return salesDAO.getListSalesForOnePerson(carId, personId);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
