package org.example.view.dialog;

import org.example.dao.ContactDao;
import org.example.model.Contact;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateDialog extends JDialog {

    private JPanel contentPanel;
    private JTextField txtName;
    private JTextField txtNumber;
    private JTextField txtId;

    private JButton buttonSearch;

    public UpdateDialog(){
        contentPanel = new JPanel();
        setTitle("Update Contact Details");
        setBounds(100,100, 350,200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);


        txtId = new JTextField();
        txtId.setBounds(80, 20,80, 20);
        contentPanel.add(txtId);
        txtId.setColumns(10);


        buttonSearch = new JButton("Search");
        buttonSearch.setBounds(200,20,80,20);
        contentPanel.add(buttonSearch);


        txtNumber = new JTextField();
        txtNumber.setBounds(80, 80,80, 20);
        contentPanel.add(txtNumber);
        txtNumber.setColumns(10);

        txtName = new JTextField();
        txtName.setBounds(80, 50,80, 20);
        contentPanel.add(txtName);
        txtName.setColumns(20);

        JLabel labelId = new JLabel("Id");
        labelId.setBounds(10,20,50,15);
        contentPanel.add(labelId);

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(10,50,50,15);
        contentPanel.add(labelName);

        JLabel labelNumber = new JLabel("Number");
        labelNumber.setBounds(10,80,50,15);
        contentPanel.add(labelNumber);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(jPanelButton, BorderLayout.SOUTH);

        JButton jButton = new JButton("OK");


        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contactId = Integer.parseInt(txtId.getText());
                ContactDao contactDao = new ContactDao();
                Contact contact = contactDao.FindContactById(contactId);

//                txtId.setText(String.valueOf(contact.getId()));
//                txtName.setText(contact.getName());
//                txtNumber.setText(contact.getNumber());
                System.out.println(contactId);
                System.out.println(contact);
                if (contact != null) {
                    txtName.setText(contact.getName());
                    txtNumber.setText(contact.getNumber());
                } else {
                    JOptionPane.showMessageDialog(null, "Contact not found");
                }
            }
        });

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contact newContact = new Contact();

                newContact.setId(Integer.parseInt(txtId.getText()));
                newContact.setName(txtName.getText());
                newContact.setNumber(txtNumber.getText());
                ContactDao contactDao = new ContactDao();
                int count = contactDao.UpdateContact(newContact);
//                contactDao.UpdateContact(contact);
                if(count>0){
                    JOptionPane.showConfirmDialog(null, "Operation succeed");
                }else{
                    JOptionPane.showConfirmDialog(null, "Operation Failed");
                }
                dispose();
            }
        });
        jPanelButton.add(jButton);

        JButton jButtonCancel = new JButton("Cancel");
        // contentPanel.add(jButtonCancel);
        jPanelButton.add(jButtonCancel);
        jButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }




}
