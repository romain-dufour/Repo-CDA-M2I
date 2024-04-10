package org.example.view;

import org.example.view.dialog.InsertDialog;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JPanel jPanel;
    private JTextField txtName;
    private JTextField txtNumber;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainFrame.setSize(425, 200);
                    mainFrame.setTitle("Main Frame");
                    mainFrame.setLocationRelativeTo(null);
                    mainFrame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


   public MainFrame() {

        jPanel = new JPanel();

        jPanel.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(jPanel);
        jPanel.setLayout(null);


       JLabel lblName = new JLabel("Name:");
       lblName.setBounds(36, 10, 50, 20);
       jPanel.add(lblName);

       txtName = new JTextField();
       txtName.setBounds(90, 10, 150, 20);
       jPanel.add(txtName);

       JLabel lblNumber = new JLabel("Number:");
       lblNumber.setBounds(250, 10, 50, 20);
       jPanel.add(lblNumber);

       txtNumber = new JTextField();
       txtNumber.setBounds(310, 10, 150, 20);
       jPanel.add(txtNumber);


        JButton btnInsert = new JButton("Insert");
        btnInsert.setBounds(36,50, 100, 25);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String number = txtNumber.getText();

                InsertDialog dialog = new InsertDialog();
//                dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
                dialog.setLocationRelativeTo(jPanel);
                dialog.setVisible(true);
            }



        });



        JButton btnUpdate = new JButton("Update");

       btnUpdate.setBounds(156,50, 100, 25);

        JButton btnDelete = new JButton("Delete");

       btnDelete.setBounds(276,50, 100, 25);

       JButton btnDisplay = new JButton("Display");

       btnDisplay.setBounds(156,100, 100, 25);

        jPanel.add(btnInsert);
        jPanel.add(btnDisplay);
        jPanel.add(btnDelete);
        jPanel.add(btnUpdate);


    }


}
