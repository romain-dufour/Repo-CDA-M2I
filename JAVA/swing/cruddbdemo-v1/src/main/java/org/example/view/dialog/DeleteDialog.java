package org.example.view.dialog;

import org.example.dao.ContactDao;
import org.example.model.Contact;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteDialog extends JDialog {

    private JPanel contentPanel;

    private JTextField txtId;

    public DeleteDialog(){
        contentPanel = new JPanel();
        setTitle("Delete Contact");
        setBounds(100,100, 350,200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);


        txtId = new JTextField();
        txtId.setBounds(80, 20,80, 20);
        contentPanel.add(txtId);
        txtId.setColumns(10);



        JLabel labelId = new JLabel("Id");
        labelId.setBounds(10,20,50,15);
        contentPanel.add(labelId);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(jPanelButton, BorderLayout.SOUTH);

        JButton jButton = new JButton("OK");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(txtId.getText());
                ContactDao contactDao = new ContactDao();
                int count = contactDao.deleteContact(id);
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
