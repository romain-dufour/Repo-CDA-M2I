package org.example.view;

import lombok.Data;
import org.example.controller.EmployeeController;
import org.example.model.Gender;

import javax.swing.*;
import java.awt.*;

@Data
public class EmployeeUI {
    private EmployeeController employeeController;

    private JFrame frame;
    private JTable employeeTable;
    private JButton saveButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton printButton;
    private JButton uploadButton;


    public EmployeeUI() {
        this.employeeController = new EmployeeController();
        initializeUI();
    }


    private void initializeUI() {
        frame = new JFrame("Toi tu bosses, toi tu bosses, toi t'es viré !!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,800);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        JPanel formPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JTable tablePanel = new JTable();
        JPanel employeeIdPanel = new JPanel();
        JPanel contactPanel = new JPanel();
        JPanel startDatePanel = new JPanel();
        JPanel adressPanel = new JPanel();
        JPanel photoPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        formPanel.setLayout(new GridBagLayout());
        buttonPanel.setLayout(new FlowLayout());
        employeeIdPanel.setLayout(new GridLayout(5,3));
        contactPanel.setLayout(new GridLayout(2,2));
        startDatePanel.setLayout(new FlowLayout());
        adressPanel.setLayout(new GridLayout(2,2));

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel idLabel = new JLabel("EmployeeID");
        JTextField idFiel = new JTextField();

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();

        JLabel roleLabel = new JLabel("Gender:");
        JRadioButton jRadioButton = new JRadioButton("Male");
        JRadioButton jRadioButton1 = new JRadioButton("Female");

        JPanel radioPanel = new JPanel(new GridLayout(1, 2));
        radioPanel.add(jRadioButton);
        radioPanel.add(jRadioButton1);

        JLabel ageLabel = new JLabel("Age");
        JTextField ageFiel = new JTextField();

        JLabel bloodLabel = new JLabel("BloodGroup");
        JTextField bloodField = new JTextField();

        employeeIdPanel.add(idLabel);
        employeeIdPanel.add(idFiel);
        employeeIdPanel.add(nameLabel);
        employeeIdPanel.add(nameField);
        employeeIdPanel.add(roleLabel);
        employeeIdPanel.add(radioPanel);
        employeeIdPanel.add(ageLabel);
        employeeIdPanel.add(ageFiel);
        employeeIdPanel.add(bloodLabel);
        employeeIdPanel.add(bloodField);

        frame.add(employeeIdPanel,BorderLayout.CENTER);

        frame.setLayout(new BorderLayout());

        frame.setVisible(true);
    }


}
