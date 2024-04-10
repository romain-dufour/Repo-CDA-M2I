package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection getConnection(){


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String database = "TP_employee_manager";
            String url = "jdbc:mysql://localhost:3306/";
            Connection con = DriverManager.getConnection(url + database, "root","test");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }




}
