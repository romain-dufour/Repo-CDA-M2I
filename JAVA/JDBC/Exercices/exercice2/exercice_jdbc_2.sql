CREATE DATABASE exercice_jdbc_2;
USE exercice_jdbc_2;

CREATE TABLE client(
client_id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50),
prenom VARCHAR(50),
numero_telephone VARCHAR(50)
);

CREATE TABLE compte_bancaire(
compte_bancaire_id INT AUTO_INCREMENT PRIMARY KEY ,
solde DOUBLE,
client_id INT,
FOREIGN KEY (client_id)REFERENCES client(client_id)
);

CREATE TABLE operation(
operation_id INT AUTO_INCREMENT PRIMARY KEY,
montant DOUBLE,
statut VARCHAR(50),
compte_bancaire_id INT,
FOREIGN KEY (compte_bancaire_id)REFERENCES compte_bancaire(compte_bancaire_id)
);


SELECT * FROM client;
SELECT * FROM compte_bancaire;
SELECT * FROM operation;
