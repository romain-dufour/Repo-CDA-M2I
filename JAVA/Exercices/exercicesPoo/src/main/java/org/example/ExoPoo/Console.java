package org.example.ExoPoo;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MessageType messageType = null;

        // Demande à l'utilisateur d'entrer le type de message
        System.out.println("Entrez le type de message (A, B, C ou D) : ");
        String userInput = scanner.next().toUpperCase();

        // Vérifie si le type de message est valide
        if (userInput.equals("A") || userInput.equals("B") || userInput.equals("C") || userInput.equals("D")) {
            messageType = MessageType.valueOf(userInput);
        } else {
            System.out.println("Type de message invalide. Veuillez réessayer.");
        }

        // Une fois que le type de message valide est entré, imprime la priorité
        if (messageType != null) {
            System.out.println(messageType + " " + messageType.getPriority());
        }
    }

}
