package org.example.view;
import lombok.Data;
import org.example.controller.EmployeeController;
import org.example.model.Employee;
import org.example.model.Gender;
import org.example.model.Qualification;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeUI {
    private EmployeeController employeeController;

    private JFrame frame;
    private JTable employeeTable;
    private JButton newButton;
    private JButton saveButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton printButton;
    private JButton uploadButton;
    private JComboBox<String> qualifComboBox;
    private JPanel buttonPanel;

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
//        JPanel buttonPanel = new JPanel();
        JPanel tablePanel = new JPanel();
        JPanel employeeIdPanel = new JPanel();
        JPanel contactPanel = new JPanel();
        JPanel startDatePanel = new JPanel();
        JPanel adressPanel = new JPanel();
        JPanel photoPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        //formPanel.setLayout(new GridBagLayout());
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); 

//        buttonPanel.setLayout(new FlowLayout());
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
        JTextField ageField = new JTextField();

        JLabel bloodLabel = new JLabel("BloodGroup");
        JTextField bloodField = new JTextField();

        employeeIdPanel.add(idLabel);
        employeeIdPanel.add(idFiel);
        employeeIdPanel.add(nameLabel);
        employeeIdPanel.add(nameField);
        employeeIdPanel.add(roleLabel);
        employeeIdPanel.add(radioPanel);
        employeeIdPanel.add(ageLabel);
        employeeIdPanel.add(ageField);
        employeeIdPanel.add(bloodLabel);
        employeeIdPanel.add(bloodField);


        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(employeeIdPanel);

        frame.setLayout(new BorderLayout());
        mainPanel.add(formPanel,BorderLayout.NORTH);
//        mainPanel.add(buttonPanel);
        mainPanel.add(tablePanel,BorderLayout.SOUTH);
        frame.add(mainPanel);
        frame.setVisible(true);


        JLabel contactLabel = new JLabel("ContactNo");
        JTextField contactFiel = new JTextField();

        JLabel qualifLabel = new JLabel("Qualification");
        qualifComboBox = new JComboBox<>();
        qualifComboBox.addItem("");
        qualifComboBox.addItem("DOCT");
        qualifComboBox.addItem("DESS");
        qualifComboBox.addItem("MAST");
        qualifComboBox.addItem("LICE");
        qualifComboBox.addItem("BTS");
        qualifComboBox.addItem("DEUG");
        qualifComboBox.addItem("DUT");
        qualifComboBox.addItem("BAC");

        contactPanel.add(contactLabel);
        contactPanel.add(contactFiel);
        contactPanel.add(qualifLabel);
        contactPanel.add(qualifComboBox);
        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(contactPanel,BorderLayout.NORTH);


        JLabel dateLabel = new JLabel("StartDate");
        JTextField dateField = new JTextField();
        JLabel pathLabel = new JLabel("Image Path");
        JTextField pathField = new JTextField();


        startDatePanel.add(dateLabel);
        startDatePanel.add(dateField);
        startDatePanel.add(pathLabel);
        startDatePanel.add(pathField);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(startDatePanel);


        JLabel addressLabel = new JLabel("Address");
        JTextField addressField = new JTextField();
        uploadButton = new JButton("Upload Image");

        adressPanel.add(addressLabel);
        adressPanel.add(addressField);
        adressPanel.add(new JLabel());
        adressPanel.add(uploadButton);
        constraints.gridx = 1;
        constraints.gridy = 0;
        formPanel.add(adressPanel);

        constraints.gridx = 2;
        constraints.gridy = 0;
        formPanel.add(photoPanel);
        formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        formPanel.setBorder(border);


        JLabel searchLabel = new JLabel("SEARCH");
        JTextField searchField = new JTextField();
        buttonPanel.add(searchLabel);
        buttonPanel.add(searchField);

        newButton = new JButton("New");
        buttonPanel.add(newButton);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        final Gender[] genderEnum = new Gender[2];


        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton.isSelected()) {
                    genderEnum[0] = Gender.valueOf(jRadioButton.getText());

                }
            }
        });

        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton1.isSelected()) {
                    genderEnum[0] = Gender.valueOf(jRadioButton1.getText());

                }
            }
        });

        saveButton = new JButton("Save");
        buttonPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String bloodGroup = bloodField.getText();
                int contactNumber = Integer.parseInt(contactFiel.getText());
                Qualification selectedQualification = (Qualification) qualifComboBox.getSelectedItem();
                LocalDate startDate = LocalDate.parse(dateField.getText());
                String imageUrl = pathField.getText();
                String address = addressField.getText();

                Employee newEmployee = new Employee(name,genderEnum[0],age,bloodGroup,contactNumber,selectedQualification,startDate,imageUrl,address);

                refreshTable();
            }
        });


        updateButton = new JButton("Update");
        buttonPanel.add(updateButton);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = employeeTable.getSelectedRow();
                int employeeId = (int) employeeTable.getValueAt(selectedRow, 0);
                Employee selectedEmployee = employeeController.getEmployeeById(employeeId);

                String newName = nameField.getText();
                int newAge = Integer.parseInt(ageField.getText());
                String newBloodGroup = bloodField.getText();
                int newContactNumber = Integer.parseInt(contactFiel.getText());
                Qualification newSelectedQualification = (Qualification) qualifComboBox.getSelectedItem();
                LocalDate newStartDate = LocalDate.parse(dateField.getText());
                String newImageUrl = pathField.getText();
                String newAddress = addressField.getText();

                selectedEmployee.setName(newName);
                selectedEmployee.setAge(newAge);
                selectedEmployee.setBloodGroup(newBloodGroup);
                selectedEmployee.setContactNumber(newContactNumber);
                selectedEmployee.setQualification(newSelectedQualification);
                selectedEmployee.setStartDate(newStartDate);
                selectedEmployee.setImageUrl(newImageUrl);
                selectedEmployee.setAdress(newAddress);

                refreshTable();
            }
        });


        deleteButton = new JButton("Delete");
        buttonPanel.add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedEmployee();
            }
        });


        clearButton = new JButton("Clear");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        printButton = new JButton("Print");
        buttonPanel.add(printButton);
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });





//        buttonPanel = createButtonPanel();
        mainPanel.add(buttonPanel);


        tablePanel = createTablePanel();
        mainPanel.add(tablePanel,BorderLayout.SOUTH);

    }


    private void refreshTable() {
//        List<Employee> employees = employeeController.getAllEmployees();
//        TableModel model = new TableModel((java.util.List<Employee>) employees) {
//            @Override
//            public int getRowCount() {
//                return 0;
//            }
//
//            @Override
//            public int getColumnCount() {
//                return 0;
//            }
//
//            @Override
//            public String getColumnName(int columnIndex) {
//                return null;
//            }
//
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return null;
//            }
//
//            @Override
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return false;
//            }
//
//            @Override
//            public Object getValueAt(int rowIndex, int columnIndex) {
//                return null;
//            }
//
//            @Override
//            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//
//            }
//
//            @Override
//            public void addTableModelListener(TableModelListener l) {
//
//            }
//
//            @Override
//            public void removeTableModelListener(TableModelListener l) {
//
//            }
//        };
//        employeeTable.setModel(model);
    }
    private JPanel createFormPanel() {



        return createFormPanel();
    }

    private JPanel createButtonPanel() {

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JLabel searchLabel = new JLabel("SEARCH");
        JTextField searchField = new JTextField();
        newButton = new JButton("New");
        saveButton = new JButton("Save");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        printButton = new JButton("Print");

        buttonPanel.add(searchLabel);
        buttonPanel.add(searchField);
        buttonPanel.add(newButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(printButton);

        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        buttonPanel.setBorder(border);

        return createButtonPanel();
    }

    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel(new BorderLayout());

        String[] columnNames = {"EmployeeID", "Name", "Genre","Age", "BloodGroup", "ContactNo","Qualification", "DOj", "Address","EmplImage"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        employeeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(employeeTable);

        tablePanel.add(scrollPane, BorderLayout.CENTER);

        Border tableBorder = BorderFactory.createEmptyBorder(10,10,10,10);
        tablePanel.setBorder(tableBorder);

        return tablePanel;
    }


    private void deleteSelectedEmployee() {
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow >= 0) {
            int employeeId = (int) employeeTable.getValueAt(selectedRow, 0);
            employeeController.deleteEmployee(employeeId);
            refreshTable();
        }
    }
}
