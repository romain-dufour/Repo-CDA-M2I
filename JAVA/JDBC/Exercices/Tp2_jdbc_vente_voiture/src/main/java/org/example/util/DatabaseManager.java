package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// TODO: 23/12/2023 faire transaction 
public class DatabaseManager {
    private static final String URI = "jdbc:mysql://localhost:3306/bdd_voiture";
    private static final String USER = "root";
    private static final String PASSWORD = "mot.de.Passe1234";
    private static Connection connection;

    private DatabaseManager(){

    }

    public static  Connection getConnection() {
        if(connection == null){
            System.out.println("creation d'une connection");
            try{
                connection = DriverManager.getConnection(URI,USER,PASSWORD);
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection(){
        if (connection != null){
            System.out.println("Fermeture de la connection");
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            finally {
                connection = null;
            }
        }
    }

}
