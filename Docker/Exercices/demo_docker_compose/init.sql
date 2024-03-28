-- Création de la base de données
CREATE DATABASE IF NOT EXISTS toto;

-- Sélection de la base de données
USE toto;

-- Création de la table des professeurs
CREATE TABLE IF NOT EXISTS professeur (
    professeur_id INT NOT NULL AUTO_INCREMENT,
    prenom VARCHAR(50),
    nom VARCHAR(50),
    numero_classe INT,
    numero_departement INT,
    email VARCHAR(255),
    telephone VARCHAR(50),
    PRIMARY KEY (professeur_id)
);
