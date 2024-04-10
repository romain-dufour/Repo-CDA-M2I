package org.example;

import org.example.layout.Boutons;
import org.example.layout.Calculette;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("exo calculatrice");
        jFrame.setSize(400,600);
        jFrame.setLocationRelativeTo(null);

        jFrame.add(new Calculette().getJPanel());

        jFrame.setVisible(true);


    }
}