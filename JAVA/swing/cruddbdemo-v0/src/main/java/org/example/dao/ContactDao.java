package org.example.dao;

import org.example.connexion.ConnectionUtil;
import org.example.model.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDao {


    Connection con;

    private PreparedStatement ps;

    public int addContact(Contact contact) {
        con = ConnectionUtil.getConnection();
        try {
            ps = con.prepareStatement("INSERT INTO `contact`(`name`,`number`)values(?,?)");
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getNumber());

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public List<Contact> getAllContacts() {
        con = ConnectionUtil.getConnection();
        List<Contact> contactList = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT id, name, number FROM contact");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                Contact contact = new Contact(id, name, number);
                contactList.add(contact);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        return contactList;
    }
}
