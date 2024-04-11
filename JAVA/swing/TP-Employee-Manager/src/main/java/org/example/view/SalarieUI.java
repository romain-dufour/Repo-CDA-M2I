package org.example.view;

import org.example.controller.SalarieController;
import org.example.dao.SalarieDao;
import org.example.model.Role;
import org.example.model.Salarie;

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
    private SalarieController salarieController;

    public static void main(String[] args) {
        SalarieUI salarieDialog = new SalarieUI();
        salarieDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        salarieDialog.setVisible(true);
    }

    public SalarieUI() {
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        setTitle("Ajouter un salarié");
        setSize(500, 250);

        nomLabel = new JLabel("Nom:");
        nomField = new JTextField(20);

        prenomLabel = new JLabel("Prénom:");
        prenomField = new JTextField(20);

        typeLabel = new JLabel("Rôle:");
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
                String name = nomField.getText();
                String firstName = prenomField.getText();
                Role role = managerRadio.isSelected() ? Role.MANAGER : (employeRadio.isSelected() ? Role.EMPLOYEE : Role.RH);

//                String departement = (String) departementComboBox.getSelectedItem();
                int departementId = departementComboBox.getSelectedIndex() == 0 ? 0 : 1; // ID 0 pour le département de comptabilité

                Salarie salarie = new Salarie();
                salarie.setName(name);
                salarie.setFirstName(firstName);
                salarie.setRole(role);
                salarie.setDepartementId(departementId);
                System.out.println(salarie);

                SalarieDao salarieDao = new SalarieDao();
                int count = salarieDao.addSalarie(salarie);
                if(count>0){
                    JOptionPane.showConfirmDialog(null, "Add operation success");
                }else{
                    JOptionPane.showConfirmDialog(null, "Error Record");
                }

                dispose();
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(nomLabel, constraints);

        constraints.gridx = 2;
        formPanel.add(nomField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(prenomLabel, constraints);

        constraints.gridx = 2;
        formPanel.add(prenomField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(typeLabel, constraints);

        constraints.gridx = 1;
        formPanel.add(managerRadio, constraints);

        constraints.gridx = 2;
        formPanel.add(employeRadio, constraints);

        constraints.gridx = 3;
        formPanel.add(rhRadio, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        formPanel.add(departementLabel, constraints);

        constraints.gridx = 2;
        formPanel.add(departementComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(ajouterButton, constraints);

        add(formPanel);
        setVisible(true);
    }
}
