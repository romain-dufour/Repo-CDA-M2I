package org.example;

import lombok.Data;
import org.example.controller.SalarieController;
import org.example.dao.SalarieDao;
import org.example.view.SalarieUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame;
    private JTable table;
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JPanel tablePanel;
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

    public Main() {
        Main();
    }

    private void Main() {
        frame = new JFrame("Gestion des salariés");
        frame.setBounds(800, 100, 800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());

        tablePanel = createTablePanel();
        buttonPanel = jBoutonPanel();


        mainPanel.add(tablePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }

    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel(new BorderLayout());

        String[] columnNames = {"ID","Nom", "Prenom", "Role"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.add(scrollPane, BorderLayout.NORTH);

        TitledBorder tableBorder = BorderFactory.createTitledBorder("Tableau des données");
        tablePanel.setBorder(tableBorder);

        return tablePanel;
    }


    private JPanel jBoutonPanel() {
        SalarieController salarieController = new SalarieController();
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        buttonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        JButton btnadd = new JButton("Ajouter");
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalarieUI dialog = new SalarieUI();
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                   }
        });
        buttonPanel.add(btnadd);

        JButton btnUpdate = new JButton("Modifier");
        buttonPanel.add(btnUpdate);


        JButton btnDelete = new JButton("Supprimer");
        buttonPanel.add(btnDelete);


        JButton btnDpt = new JButton("Departement");
        buttonPanel.add(btnDpt);

        return buttonPanel;
    }






}