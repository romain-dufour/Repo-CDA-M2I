package org.example.dao;

import org.example.model.Departement;
import org.example.model.Salarie;
import org.example.utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartementDao {
    Connection con;
    private PreparedStatement ps;

    public int addDepartement(Departement departement) {
        con = ConnectionDB.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO `departement`(`name`) VALUES (?)");
            ps.setString(1, departement.getName());
            int n = ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }


    public int deleteDepartement(int id) {

        con= ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("Delete From `departement` where id=?");
            ps.setInt(1, id);
            int n=ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }


    public Departement searchDepartement(int id) {
        con=ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("SELECT * FROM `departement` WHERE id=?", ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1, id);

            ResultSet result=ps.executeQuery();
            //result.getInt("id");
            Departement departement=null;
            if(result.first()){
                departement=new Departement();
                departement.setId(result.getInt("id"));
                departement.setName(result.getString("name"));

            }
            con.close();
            return departement;
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }
    public int updateDepartement(Departement departement) {
        con=ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("UPDATE `departement` SET `name`=? WHERE id=?");
            ps.setString(1, departement.getName());
            ps.setInt(2, departement.getId());

            int n=ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }

}
