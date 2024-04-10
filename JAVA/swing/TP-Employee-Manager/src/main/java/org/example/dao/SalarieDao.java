package org.example.dao;

import org.example.model.Salarie;
import org.example.utils.ConnectionDB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalarieDao {
    Connection con;
    private PreparedStatement ps;

    public int addSalarie(Salarie salarie) {
        con = ConnectionDB.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO `salarie`(`name`,`firstname`,`role`,`departement`)values(?,?,?,?)");
            ps.setString(1, salarie.getName());
            ps.setString(2, salarie.getFirstName());
            ps.setString(3, String.valueOf(salarie.getRole()));
            ps.setString(4, String.valueOf(salarie.getDepartement()));
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
                salarie.setRole(result.getString("role"));
                salarie.setDepartement(result.getInt("departement"));
                System.out.println(salarie);
            }
            con.close();
            return salarie;
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }

    public int updateContact(Salarie salarie)
    {
        con=ConnectionDB.getConnection();
        try {
            ps=con.prepareStatement("UPDATE `salarie` SET `name`=?,`firstname` =?, `role`=?, `departement`=? WHERE id=?");
            ps.setString(1, salarie.getName());
            ps.setString(2,salarie.getFirstName());
            ps.setInt(3, salarie.getRole().ordinal());
            ps.setInt(4, salarie.getDepartement().getId());
            ps.setInt(5, salarie.getId());
            int n=ps.executeUpdate();
            con.close();
            return n;
        } catch (SQLException e) {

            e.printStackTrace();
            return 0;
        }
    }

}
