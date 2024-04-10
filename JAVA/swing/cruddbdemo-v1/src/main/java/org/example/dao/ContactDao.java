package org.example.dao;

import com.mysql.cj.x.protobuf.MysqlxCrud;
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

        public Contact FindContactById(int contactId) {
        con = ConnectionUtil.getConnection();
        try {
            ps = con.prepareStatement("SELECT `id`,`name`, `number` FROM `contact` WHERE `id` = ?" );
            ps.setInt(1, contactId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("coucou");
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                Contact c =new Contact(id, name, number);
                System.out.println("c" + c);
                return c;
            } else {
                return null; // Aucun contact trouvé pour cet ID
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int UpdateContact(Contact contact) {
        con = ConnectionUtil.getConnection();
        try {
            ps = con.prepareStatement("Update `contact` SET  `name` =? , `number` =? WHERE `id` =?" );
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getNumber());
            ps.setInt(3, contact.getId());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("probleme");
            throw new RuntimeException(e);
        }
    }

    public int deleteContact(int contactId) {
        con = ConnectionUtil.getConnection();
        try {
            ps = con.prepareStatement("DELETE FROM `contact` WHERE `id` = ?");
            ps.setInt(1, contactId);

            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public List<Contact> getAllContacts() {
        con = ConnectionUtil.getConnection();
        List<Contact> contacts = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM `contact`");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                Contact contact = new Contact(id, name, number);
                contacts.add(contact);
            }

            return contacts;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
