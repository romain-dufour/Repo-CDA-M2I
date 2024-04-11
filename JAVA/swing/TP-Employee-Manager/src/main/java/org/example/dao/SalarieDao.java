package org.example.dao;

import org.example.model.Salarie;
import org.example.utils.ConnectionDB;


import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SalarieDao {
    Connection con;
    private PreparedStatement ps;

    public int addSalarie(Salarie salarie) {
        con = ConnectionDB.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO `salarie`(`name`,`firstname`,`role`,`departement_id`)values(?,?,?,?)");
            ps.setString(1, salarie.getName());
            ps.setString(2, salarie.getFirstName());
            ps.setString(3, String.valueOf(salarie.getRole()));
            ps.setInt(4, salarie.getDepartementId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteSalarie(int id) {

        con= ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("Delete From `salarie` where id=?");
            ps.setInt(1, id);
            int n=ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }

    public Salarie searchSalarie(int id)
    {
        con=ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("SELECT * FROM `salarie` WHERE id=?", ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1, id);

            ResultSet result=ps.executeQuery();
            //result.getInt("id");
            Salarie salarie=null;
            if(result.first()){
                salarie=new Salarie();
                salarie.setId(result.getInt("id"));
                salarie.setName(result.getString("name"));
                salarie.setFirstName(result.getString("firstname"));
             //   salarie.setRole(result.getString("role"));
              //  salarie.setDepartement(result.getInt("departement"));
                System.out.println(salarie);
            }
            con.close();
            return salarie;
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }

    public int updateSalarie(Salarie salarie)
    {
        con=ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("UPDATE `salarie` SET `name`=?,`firstname` =?, `role`=?, `departement`=? WHERE id=?");
            ps.setString(1, salarie.getName());
            ps.setString(2,salarie.getFirstName());
            ps.setInt(3, salarie.getRole().ordinal());
            ps.setInt(4, salarie.getDepartementId());
            ps.setInt(5, salarie.getId());
            int n=ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }
//
//
//    public List<Salarie> getAllSalaries() {
//        List<Salarie> salaries = new ArrayList<>();
//        String query = "SELECT * FROM salarie";
//
//        try (PreparedStatement statement = con.prepareStatement(query);
//             ResultSet resultSet = statement.executeQuery()) {
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String nom = resultSet.getString("nom");
//                String prenom = resultSet.getString("prenom");
//                String role = resultSet.getString("role");
//
//                // Création d'un objet Salarie avec les données récupérées
//                Salarie salarie = new Salarie();
//                salaries.add(salarie);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace(); // Gérer l'erreur de connexion à la base de données
//        }
//
//        return salaries;
//    }



    public void loadData(DefaultTableModel tableModel) {

        try (Connection conn = ps.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from Contact");
            ResultSetMetaData metaData = rs.getMetaData();

            // Names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

            // Data of the table
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int i = 1; i <= columnCount; i++) {
                    vector.add(rs.getObject(i));
                }
                data.add(vector);
            }

            tableModel.setDataVector(data, columnNames);
        } catch (Exception e) {

        }

    }
}
