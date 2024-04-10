package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Data
public class Calculette {

    private JPanel container = new JPanel();


    String[] tab_string = {"C","+/-","%","÷", "7", "8", "9", "x", "4", "5", "6" , "-","1", "2", "3","+", "0","",".", "=" };
    private JLabel ecran = new JLabel();
    private double chiffre1;
    JButton[] tab_button = new JButton[tab_string.length];
    private String operateur = "";

    private boolean clicOperateur = false, update = false;

    private JPanel jPanel;

    GridBagLayout gridBagLayout = new GridBagLayout();

    public TestBoutons() {
        jPanel = new JPanel();
        jPanel.setLayout(gridBagLayout);
        JPanel operateur = new JPanel();
        JPanel chiffre = new JPanel();

        // Nombre de colonnes désirées
        int nombreColonnes = 4;
        int colonneActuelle = 0;

        for (int i = 1; i < tab_button.length; i++) {
            tab_button[i] = new JButton(tab_string[i]);

            GridBagConstraints constraints = new GridBagConstraints();

            constraints.weightx = 1;
            constraints.weighty = 1;
            constraints.fill = GridBagConstraints.BOTH;


            if (colonneActuelle == nombreColonnes) {
                constraints.gridx = 0; // Commence une nouvelle ligne
                constraints.gridy++; // Passage à la ligne suivante
                colonneActuelle = 0; // Réinitialise le compteur de colonnes
            } else {
                constraints.gridx = colonneActuelle; // Utilise la colonne actuelle
            }

            // Incrémente le compteur de colonnes
            colonneActuelle++;


            switch (i) {

                case 4, 5, 6, 8, 9, 10, 12, 13, 14, 17, 18:
                    tab_button[i].setBackground(Color.GRAY);
                    //  chiffre.add(tab_button[i]);
                    break;
                case 0:
                    tab_button[i].setBackground(Color.GRAY);
                    //tab_button[i].addActionListener(new ResetListener());
                    //  chiffre.add(tab_button[i]);
                    break;
                case 1:
                    tab_button[i].setBackground(Color.GRAY);
                    //tab_button[i].addActionListener(new PlusMinusListener());
                    //  chiffre.add(tab_button[i]);
                    break;
                case 2:
                    tab_button[i].setBackground(Color.GRAY);
                    //tab_button[i].addActionListener(new PercentListener());
                    //  chiffre.add(tab_button[i]);
                    break;
                case 3:
                    tab_button[i].setBackground(Color.ORANGE);
                    //tab_button[i].addActionListener(new DivListener());
                    //  chiffre.add(tab_button[i]);
                    break;
                case 7:
                    tab_button[i].setBackground(Color.ORANGE);
                    //tab_button[i].addActionListener(new MultiListener());
                    break;
                case 11:
                    tab_button[i].setBackground(Color.ORANGE);
                    //tab_button[i].addActionListener(new MoinsListener());
                    break;
                case 15:
                    tab_button[i].setBackground(Color.ORANGE);
                    //tab_button[i].addActionListener(new PlusListener());
                    break;
                case 16:
                    tab_button[i].setBackground(Color.GRAY);
                    //  chiffre.add(tab_button[i]);
                    break;

                case 19:
                    tab_button[i].setBackground(Color.ORANGE);
                    //tab_button[i].addActionListener(new EgalListener());
                    break;
                default:
                    tab_button[i].addActionListener(new ChiffreListener());
                    chiffre.add(tab_button[i]); // chiffre
                    break;

            }

            tab_button[i].setFont(tab_button[i].getFont().deriveFont(24f));

            jPanel.add(tab_button[i], constraints);
        }

    }
        private void calcul() {
            if (operateur.equals("+")) {
                chiffre1 = chiffre1 + Double.valueOf(ecran.getText()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }

            if (operateur.equals("-")) {
                chiffre1 = chiffre1 - Double.valueOf(ecran.getText()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }

            if (operateur.equals("*")) {
                chiffre1 = chiffre1 * Double.valueOf(ecran.getText()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }

            if (operateur.equals("/")) {
                try {
                    chiffre1 = chiffre1 / Double.valueOf(ecran.getText()).doubleValue();
                    ecran.setText(String.valueOf(chiffre1));
                } catch (ArithmeticException e) {
                    ecran.setText("0");
                }
            }
        }
    }

        class ChiffreListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                //On affiche le chiffre en plus dans le label
                String str = ((JButton) e.getSource()).getText();

                if (update) {
                    update = false;
                } else {
                    if (!ecran.getText().equals("0"))
                        str = ecran.getText() + str;
                }

                ecran.setText(str);
            }


            class EgalListener implements ActionListener {
                public void actionPerformed(ActionEvent arg0) {
                    calcul();
                    update = true;
                    clicOperateur = false;
                }
            }


        }


        class PlusListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {

                if (clicOperateur) {
                    calcul();
                    ecran.setText(String.valueOf(chiffre1));
                } else {
                    chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                    clicOperateur = true;
                }
                operateur = "+";
                update = true;
            }
        }

        class MoinsListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {
                if (clicOperateur) {
                    calcul();
                    ecran.setText(String.valueOf(chiffre1));
                } else {
                    chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                    clicOperateur = true;
                }
                operateur = "-";
                update = true;
            }
        }

        class MultiListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {
                if (clicOperateur) {
                    calcul();
                    ecran.setText(String.valueOf(chiffre1));
                } else {
                    chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                    clicOperateur = true;
                }
                operateur = "*";
                update = true;
            }
        }

        class DivListener implements ActionListener {
            public void actionPerformed(ActionEvent arg0) {
                if (clicOperateur) {
                    calcul();
                    ecran.setText(String.valueOf(chiffre1));
                } else {
                    chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
                    clicOperateur = true;
                }
                operateur = "/";
                update = true;
            }
        }

        class ResetListener implements ActionListener { // boutton reset
            public void actionPerformed(ActionEvent arg0) {
                clicOperateur = false;
                update = true;
                chiffre1 = 0;
                operateur = "";
                ecran.setText(""); // vide quand clic sur reset
            }
        }
    }
}
