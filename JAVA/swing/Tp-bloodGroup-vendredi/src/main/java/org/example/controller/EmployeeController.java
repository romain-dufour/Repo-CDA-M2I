package org.example.controller;

import org.example.dao.EmployeeDAO;
import org.example.model.Employee;

import java.util.List;

public class EmployeeController {

    private EmployeeDAO employeeDao;

    public EmployeeController() {this.employeeDao = new EmployeeDAO();}

    public List<Employee> getAllEmployees(){return employeeDao.ListEmployees();}
    public Employee getEmployeeById(int id) {return employeeDao.getEmployeeById(id);}
    public void addEmployee(Employee employee) {employeeDao.addEmployee(employee);}
    public void updateEmployee(Employee employee) {employeeDao.updateEmployee(employee);}
    public void deleteEmployee(int id) {employeeDao.deleteEmployee(id);}
}
