package org.example.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class SalarieUI extends JDialog {
    private JLabel nomLabel, prenomLabel, typeLabel, departementLabel;
    private JTextField nomField, prenomField;
    private JRadioButton managerRadio, employeRadio, rhRadio;
    private JComboBox<String> departementComboBox;
    private JButton ajouterButton;

//    public SalarieUI() {
//        setTitle("Ajouter un salarié");
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        setSize(500, 250);
//
//        nomLabel = new JLabel("Nom:");
//        nomField = new JTextField(20);
//
//        prenomLabel = new JLabel("Prénom:");
//        prenomField = new JTextField(20);
//
//        typeLabel = new JLabel("Type:");
//        managerRadio = new JRadioButton("Manager");
//        employeRadio = new JRadioButton("Employé");
//        rhRadio = new JRadioButton("RH");
//        ButtonGroup typeGroup = new ButtonGroup();
//        typeGroup.add(managerRadio);
//        typeGroup.add(employeRadio);
//        typeGroup.add(rhRadio);
//
//        departementLabel = new JLabel("Département:");
//        String[] departements = {"Comptabilité", "RH"};
//        departementComboBox = new JComboBox<>(departements);
//
//        ajouterButton = new JButton("Ajouter");
//        ajouterButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                // Ajouter le code pour traiter l'action du bouton ici
//                System.out.println("Bouton Ajouter cliqué");
//            }
//        });
//
//        JPanel panel = new JPanel(new GridLayout(6, 2));
//        panel.add(nomLabel);
//        panel.add(nomField);
//        panel.add(prenomLabel);
//        panel.add(prenomField);
//        panel.add(typeLabel);
//        panel.add(managerRadio);
//        panel.add(new JLabel());
//        panel.add(employeRadio);
//        panel.add(new JLabel());
//        panel.add(rhRadio);
//        panel.add(departementLabel);
//        panel.add(departementComboBox);
//        panel.add(new JLabel());
//        panel.add(ajouterButton);
//
//        add(panel);
//        setVisible(true);
//    }



    public SalarieUI() {
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        setTitle("Ajouter un salarié");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 250);

        nomLabel = new JLabel("Nom:");
        nomField = new JTextField(20);

        prenomLabel = new JLabel("Prénom:");
        prenomField = new JTextField(20);

        typeLabel = new JLabel("Type:");
        managerRadio = new JRadioButton("Manager");
        employeRadio = new JRadioButton("Employé");
        rhRadio = new JRadioButton("RH");
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(managerRadio);
        typeGroup.add(employeRadio);
        typeGroup.add(rhRadio);

        departementLabel = new JLabel("Département:");
        String[] departements = {"Comptabilité", "RH"};
        departementComboBox = new JComboBox<>(departements);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ajouter le code pour traiter l'action du bouton ici
                System.out.println("Bouton Ajouter cliqué");
            }
        });


        //
        // Configuration des contraintes pour chaque composant
        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(nomLabel, constraints);

        constraints.gridx = 1;
        formPanel.add(nomField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(prenomLabel, constraints);

        constraints.gridx = 1;
        formPanel.add(prenomField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(new JLabel("Rôle:"), constraints);

        constraints.gridx = 1;
        formPanel.add(managerRadio, constraints);

        constraints.gridx = 2;
        formPanel.add(employeRadio, constraints);

        constraints.gridx = 3;
        formPanel.add(rhRadio, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 3; // Le bouton doit occuper toute la largeur
        //constraints.weightx = 3;
        formPanel.add(ajouterButton, constraints);

        TitledBorder formBorder = BorderFactory.createTitledBorder("Formulaire d'ajout"); // Crée une bordure avec un titre
        formPanel.setBorder(formBorder); // Ajoute la bordure au panneau



        //
//        JPanel panel = new JPanel(new GridLayout(6, 2));
//        panel.add(nomLabel);
//        panel.add(nomField);
//        panel.add(prenomLabel);
//        panel.add(prenomField);
//        panel.add(typeLabel);
//        panel.add(managerRadio);
//        panel.add(new JLabel());
//        panel.add(employeRadio);
//        panel.add(new JLabel());
//        panel.add(rhRadio);
//        panel.add(departementLabel);
//        panel.add(departementComboBox);
//        panel.add(new JLabel());
//        panel.add(ajouterButton);

        add(formPanel);
        setVisible(true);
    }
}
