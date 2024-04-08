package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame jFrame = new JFrame("Taquin Layout");
        jFrame.setSize(1000,1000);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(new TaquinWindow().getTaquinPanel());
//        jFrame.pack();
        jFrame.setVisible(true);

    }
}