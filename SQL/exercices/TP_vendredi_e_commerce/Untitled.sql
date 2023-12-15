CREATE DATABASE  IF NOT EXISTS tabletoptreasures_database ;

USE tabletoptreasures_database;

CREATE TABLE IF NOT EXISTS Clients(
Clients_id INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(50) NOT NULL,
prenom VARCHAR(50) NOT NULL,
Adresse_mail VARCHAR(150) NOT NULL,
Adresse_de_livraison VARCHAR(150),
Telephone VARCHAR(50)
);

DROP TABLE Clients;
CREATE TABLE IF NOT EXISTS Jeux(
Jeux_id INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(50) NOT NULL,
Description VARCHAR(150),
Prix DOUBLE NOT NULL,
ID_Categorie INT NOT NULL,
FOREIGN KEY (ID_Categorie) REFERENCES Categories(Categories_id)
);


CREATE TABLE IF NOT EXISTS Categories(
Categories_id INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Commandes(
Commandes_id INT PRIMARY KEY AUTO_INCREMENT,
ID_Client INT NOT NULL, 
Date_de_commande DATE NOT NULL,
Adresse_de_livraison VARCHAR(150) NOT NULL,
Statut VARCHAR(50),
FOREIGN KEY (ID_Client) REFERENCES Clients(Clients_id)
);





