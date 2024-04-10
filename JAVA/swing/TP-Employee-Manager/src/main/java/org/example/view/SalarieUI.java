package org.example.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SalarieUI extends JDialog {

    private JPanel contentPanel;
    private JTextField name;
    private JTextField firstName;
    private ButtonGroup roleGroup;
    private JRadioButton managerRadioButton, employeeRadioButton, rhRadioButton;
    private JComboBox<String> departmentComboBox;

    public SalarieUI() {
        contentPanel = new JPanel();
        setTitle("Ajouter un salarié");
        setBounds(100, 150, 500, 200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        // Use GroupLayout for better layout management
        GroupLayout layout = new GroupLayout(contentPanel);
        contentPanel.setLayout(layout);

        // Create horizontal group
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(new JLabel("Nom :"))
                                        .addComponent(new JLabel("Prénom :"))
                                        .addComponent(new JLabel("Rôle :"))
                                        .addComponent(new JLabel("Département :")))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(name, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstName, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(managerRadioButton)
                                                .addGap(10, 10, 10)
                                                .addComponent(employeeRadioButton)
                                                .addGap(10, 10, 10)
                                                .addComponent(rhRadioButton))
                                        .addComponent(departmentComboBox, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        // Create vertical group
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup((GroupLayout.Alignment.BASELINE))
                                .addComponent(new JLabel("Nom :"))
                                .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup((GroupLayout.Alignment.BASELINE))
                                .addComponent(new JLabel("Prénom :"))
                                .addComponent(firstName, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup((GroupLayout.Alignment.BASELINE))
                                .addComponent(new JLabel("Rôle :"))
                                .addComponent(managerRadioButton)
                                .addGap(5, 5, 5)
                                .addComponent(employeeRadioButton)
                                .addGap(5, 5, 5)
                                .addComponent(rhRadioButton))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup((GroupLayout.Alignment.BASELINE))
                                .addComponent(new JLabel("Département :"))
                                .addComponent(departmentComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))

        );

        // Initialize radio buttons and combo box
        name = new JTextField();
        name.setColumns(20);
        firstName = new JTextField();
        firstName.setColumns(20);

        managerRadioButton = new JRadioButton("Manager");
        employeeRadioButton = new JRadioButton("Employé");
        rhRadioButton = new JRadioButton("RH");
        roleGroup = new ButtonGroup();
        roleGroup.add(managerRadioButton);
        roleGroup.add(employeeRadioButton);
        roleGroup.add(rhRadioButton);

        departmentComboBox = new JComboBox<>(new String[]{"Comptabilité", "RH"});
    }}