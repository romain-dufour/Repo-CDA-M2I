package org.example.dao;

import org.example.model.Employee;
import org.example.model.Gender;
import org.example.model.Qualification;
import org.example.utils.ConnexionDB;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private Connection connection;

    public EmployeeDAO() {
        try {
            connection = ConnexionDB.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Employee getEmployeeById (int id) {
        String query = "SELECT * FROM employee WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");
                String bloodGroup = resultSet.getString("bloodGroup");
                int contactNumber = resultSet.getInt("contactNumber");
                String qualification = resultSet.getString("qualification");
                LocalDate startDate = resultSet.getDate("startDate").toLocalDate();
                String imageUrl = resultSet.getString("ImageUrl");
                String adress = resultSet.getString("adress");

                Qualification qualification1 = Qualification.valueOf(qualification);
                Gender gender1 = Gender.valueOf(gender);
                Employee employee = new Employee(id,name,gender1,age,bloodGroup,contactNumber,qualification1, startDate,imageUrl,adress);
                return employee;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        String query = "INSERT INTO employee (name, gender, age, bloodGroup,contactNumber,qualification,startDate,ImageUrl,adress) VALUES (?, ?, ?, ?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, String.valueOf(employee.getGender()));
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setString(4, employee.getBloodGroup());
            preparedStatement.setInt(5, employee.getContactNumber());
            preparedStatement.setString(6, String.valueOf(employee.getQualification()));
            preparedStatement.setDate(7, Date.valueOf(employee.getStartDate()));
            preparedStatement.setString(8, employee.getImageUrl());
            preparedStatement.setString(9, employee.getAdress());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee) {
        String query = "UPDATE employee SET name = ?, gender = ?, age = ? ,bloodGroup = ?,contactNumber = ?,qualification = ?,startDate = ?,ImageUrl = ?,adress = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, String.valueOf(employee.getGender()));
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setString(4, employee.getBloodGroup());
            preparedStatement.setInt(5, employee.getContactNumber());
            preparedStatement.setString(6, String.valueOf(employee.getQualification()));
            preparedStatement.setDate(7, Date.valueOf(employee.getStartDate()));
            preparedStatement.setString(8, employee.getImageUrl());
            preparedStatement.setString(9, employee.getAdress());
            preparedStatement.setInt(10, employee.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> ListEmployees() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employee";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setGender(Gender.valueOf(resultSet.getString("gender")));
                employee.setAge(resultSet.getInt("age"));
                employee.setBloodGroup(resultSet.getString("bloodGroup"));
                employee.setContactNumber(resultSet.getInt("contactNumber"));
                employee.setQualification(Qualification.valueOf(resultSet.getString("qualification")));
                employee.setStartDate(resultSet.getDate("startDate").toLocalDate());
                employee.setImageUrl(resultSet.getString("imageUrl"));
                employee.setAdress(resultSet.getString("adress"));
               employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
