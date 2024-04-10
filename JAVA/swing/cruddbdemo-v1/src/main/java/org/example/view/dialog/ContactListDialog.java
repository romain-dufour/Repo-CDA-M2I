package org.example.view.dialog;

import org.example.dao.ContactDao;
import org.example.model.Contact;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ContactListDialog extends JDialog {

    JScrollPane scrollPane;
    private JTable table;
    private JPanel contentPanel;

    private JButton buttonSearch;

    public ContactListDialog(){
        contentPanel = new JPanel();
        setTitle("Liste de contacts");
        setBounds(10,10, 700,300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        ContactDao contactDao = new ContactDao();

        List<Contact> contactList = new ArrayList<>();
        contactList = contactDao.getAllContacts();
        String rows[][] = new String[0][];
        String colum[] = {"ID","NAME","NUMBER"};
        table = new JTable(rows,colum);

        table.setBounds(10,250,400,250);

        scrollPane = new JScrollPane(table);

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = table.getSelectedRow();

                    if (row < 0) {
                        System.out.println("Il n'y a rien");
                    } else {

                        int modelRow = table.convertRowIndexToModel(row);

                        System.out.println(String.format("Info selected in: %d. Dans model : %d. Autre info %s, %s, %s", row,
                                modelRow, table.getModel().getValueAt(modelRow, 0),
                                table.getModel().getValueAt(modelRow, 1),
                                table.getModel().getValueAt(modelRow, 2)));

                    }

                }}

        });


        JButton jButton = new JButton("OK");


    }

}
