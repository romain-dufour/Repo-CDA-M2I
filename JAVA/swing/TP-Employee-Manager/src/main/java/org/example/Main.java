package org.example;

import lombok.Data;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

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
        frame.setBounds(800,100,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        buttonPanel = createButtonPanel();
        tablePanel = createTablePanel();


        separator = new JSeparator(JSeparator.HORIZONTAL);

        mainPanel.add(tablePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }
    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel(new BorderLayout()); // Crée un panneau avec un layout BorderLayout

        String[] columnNames = {"Nom", "Email", "Genre"}; // Noms des colonnes du tableau
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // Crée un modèle de tableau par défaut avec les noms de colonnes
        table = new JTable(tableModel); // Crée une JTable avec le modèle de tableau
        JScrollPane scrollPane = new JScrollPane(table); // Ajoute une barre de défilement à la JTable

        JButton detailsButton = new JButton("Détails"); // Crée un bouton "Détails"
        detailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // Récupère la ligne sélectionnée dans le tableau
                if (selectedRow >= 0) { // Si une ligne est sélectionnée
                    showDetailsDialog(selectedRow); // Affiche une boîte de dialogue avec les détails de la ligne
                } else {
                    // Affiche un avertissement si aucune ligne n'est sélectionnée
                    JOptionPane.showMessageDialog(tablePanel, "Sélectionnez une ligne pour voir les détails.", "Avertissement", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        tablePanel.add(scrollPane, BorderLayout.CENTER); // Ajoute la JTable avec barre de défilement au centre
        tablePanel.add(detailsButton, BorderLayout.SOUTH); // Ajoute le bouton "Détails" en bas

        TitledBorder tableBorder = BorderFactory.createTitledBorder("Tableau des données"); // Crée une bordure avec un titre
        tablePanel.setBorder(tableBorder); // Ajoute la bordure au panneau

        return tablePanel; // Retourne le panneau de tableau configuré
    }




    private void createButtonPanel(){

        JPanel jBoutonPanel = new JPanel(new FlowLayout( FlowLayout.CENTER, 10, 20));
        jBoutonPanel.setBorder(new EmptyBorder(5,5,5,5));
        frame.setContentPane(jBoutonPanel);
//        jBoutonPanel.setLayout(null);


        JButton btnInsert = new JButton("Ajouter");
//        btnInsert.addActionListener(e -> addAction);
        jBoutonPanel.add(btnInsert);

        JButton btnUpdate = new JButton("Modifier");
        jBoutonPanel.add(btnUpdate);


        JButton btnDelete = new JButton("Supprimer");
        jBoutonPanel.add(btnDelete);


        JButton btnDpt = new JButton("Departement");
        jBoutonPanel.add(btnDpt);




    }






}