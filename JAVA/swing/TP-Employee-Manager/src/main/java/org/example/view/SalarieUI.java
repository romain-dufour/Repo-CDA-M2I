package org.example.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SalarieUI extends JDialog {

    private JPanel contentPanel;
    private JTextField name;
    private JTextField firstName;
    private JTextField role;
    private JTextField departement;

    public SalarieUI() {
        contentPanel = new JPanel();
        setTitle("Ajouter un salarié");
        setBounds(100,150,500,200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel labelName = new JLabel("Nom :");
        labelName.setBounds(10,20,200,25);
        contentPanel.add(labelName);

        name = new JTextField();
        name.setBounds(80,20,200,25);
        contentPanel.add(name);
        name.setColumns(20);





    }



}
