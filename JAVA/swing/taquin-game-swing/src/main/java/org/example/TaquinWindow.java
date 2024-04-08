package org.example;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

@Data
public class TaquinWindow {

    private JPanel taquinPanel;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints bagConstraints;

    private boolean isNextToHole = true;
//    private String[] pieces = new String[]{"1","2","3","4","5","6","7","8"};

    private ArrayList<String> piecesList;

    private int prevX = 3; // Initialisation à 3 pour le premier bouton
    private int prevY = 3;
    public TaquinWindow(){
        taquinPanel = new JPanel();
        taquinPanel.setSize(100,100);
        gridBagLayout = new GridBagLayout();

        taquinPanel.setLayout(gridBagLayout);
        bagConstraints = new GridBagConstraints();
        bagConstraints.fill = GridBagConstraints.BOTH;

        piecesList = new ArrayList<>();
        piecesList.addAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8","9","10","11","12","13","14","15"));

        createPieces();
    }


    private void createPieces(){
        int x =0;
        int y = 0;
        Random random = new Random();


        for (int i = 0; i < 15; i++) {

            int randomIndex = random.nextInt(piecesList.size());
            String s = piecesList.get(randomIndex);

            JButton piece = new JButton(s);
            piece.addActionListener(this::actionPiece);
            bagConstraints.gridx = x;
            bagConstraints.gridy = y;
            bagConstraints.weighty = 1;

            taquinPanel.add(piece, bagConstraints);


            x++;
            if (x == 4) {
                x = 0;
                y++;
            }

            piecesList.remove(randomIndex);

        }

    }


    private void actionPiece(ActionEvent e) {

        JButton oldButton = (JButton) e.getSource();
        taquinPanel.remove(oldButton);
        GridBagConstraints oldConstraints = gridBagLayout.getConstraints(oldButton);
        int newX = oldConstraints.gridx;
        int newY = oldConstraints.gridy;
        System.out.println(newX);
        System.out.println(newY);
        JButton newButton = new JButton(oldButton.getText());

        GridBagConstraints newConstraints = new GridBagConstraints();
        newConstraints.gridx = prevX;
        newConstraints.gridy = prevY;
        gridBagLayout.setConstraints(newButton,newConstraints);

        taquinPanel.add(newButton); // Ajouter le nouveau bouton avec les nouvelles contraintes

        taquinPanel.revalidate(); // Mettre à jour le panneau
        taquinPanel.repaint(); // Redessiner le panneau


        prevX = newX;
        prevY = newY;
        System.out.println("Position du bouton : (" + prevX + ", " + prevY + ")");










    }
}
