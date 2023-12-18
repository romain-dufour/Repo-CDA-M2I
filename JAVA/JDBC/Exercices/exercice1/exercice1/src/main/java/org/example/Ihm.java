package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ihm {


    private static Scanner scanner = new Scanner(System.in);

    public static void menu() throws SQLException {

        String propositions[] = {
                "1- Ajouter un etudiant",
                "2- Afficher la totalité des etudiants",
                "3- Afficher les etudiants d'une classes",
                "4- Supprimer un etudiant",
                "5- Chercher par nom ou prenom"
        };

        for (String p: propositions){
            System.out.println(p);
        }

        int choice = parseInt(scanner.next());
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                addStudent();
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }
            case 2 -> {
                showStudentsList();
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }
            case 3 -> {
                showStudentFromClass();
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }
            case 4 -> {
                deleteStudent();
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }
            case 5 -> {
                searchByName();
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }

            default -> {
                System.out.println("Choix invalide");
                System.out.println("    *************    ");
                menu();
                System.out.println("    *************    ");
            }
        }
    }


    public static void addStudent() {
        System.out.println("Saisissez le nom :");
        String lastName = scanner.nextLine();
        System.out.println("Saisissez le prenom :");
        String firstName = scanner.nextLine();
        System.out.println("Saisissez le numero de classe :");
        int classNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Saisissez la date de diplome :");
        String diplomeDate = scanner.nextLine();
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            String request = "INSERT INTO student (first_name,last_name,class_number,diplome_date) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, classNumber);
            preparedStatement.setString(4, diplomeDate);
            int nbRows = preparedStatement.executeUpdate();
            System.out.println("Nombre de ligne : " + nbRows);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //Fermer la connexion a la bdd
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void showStudentsList() {
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            String requestDisplay = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(requestDisplay);
            while (resultSet.next()) {
                System.out.println( "Etudiant n° "+
                        resultSet.getInt(
                        "id") + " "
                        + resultSet.getString("first_name") + " "
                        + resultSet.getString("last_name")+ " N° de classe : "
                        + resultSet.getInt("class_number")+ " et diplome obtenu en "
                        + resultSet.getString("diplome_date")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void showStudentFromClass() {
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Saisissez le numéro de la classe :");
            int number = scanner.nextInt();
            String requestClassNumber = "SELECT * FROM student WHERE class_number = " + number;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(requestClassNumber);
            System.out.println("Les etudiants de la classe " + number + " sont :");
            while (resultSet.next()) {
                System.out.println(
                        "Etudiant n° "+
                        resultSet.getInt(
                                "id") + " "
                        + resultSet.getString("first_name") + " "
                        + resultSet.getString("last_name")+ " N° de classe : "
                        + resultSet.getInt("class_number")+ " et diplome obtenu en "
                        + resultSet.getString("diplome_date")
                );
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteStudent() {
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Saisissez l'id de l'étudiant à supprimer :");
            int id = scanner.nextInt();

            String requestStudentToDelete = "DELETE FROM student WHERE id = ?" ;
            PreparedStatement preparedStatement = connection.prepareStatement(requestStudentToDelete);
                preparedStatement.setInt(1, id);
                int nbRows = preparedStatement.executeUpdate();
                System.out.println("Nombre de ligne supprimées : " + nbRows);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public static void searchByName() throws SQLException {
        Connection connection = null;
        System.out.println("Saississez le prenom ou le nom de la personne que vous cherchez :");
        String result = scanner.nextLine();
        String requestSearchedStudent = "SELECT * FROM student WHERE lastname = "+ result;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(requestSearchedStudent);

        while (resultSet.next()){
            System.out.println(
            "Etudiant n° "+
                    resultSet.getInt(
                            "id") + " "
                    + resultSet.getString("first_name") + " "
                    + resultSet.getString("last_name")+ " N° de classe : "
                    + resultSet.getInt("class_number")+ " et diplome obtenu en "
                    + resultSet.getString("diplome_date"));
        }
    };
}

