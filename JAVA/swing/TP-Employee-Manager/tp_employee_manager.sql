-- Création de la base de données TP_employee_manager
CREATE DATABASE IF NOT EXISTS TP_employee_manager;

-- Utilisation de la base de données créée
USE TP_employee_manager;

-- Création de la table Departement
CREATE TABLE IF NOT EXISTS Departement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insertion des départements
INSERT INTO Departement (name) VALUES ('Comptabilité'), ('RH');

-- Création de la table Salarie
CREATE TABLE IF NOT EXISTS Salarie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    firstName VARCHAR(255) NOT NULL,
    role ENUM('MANAGER', 'EMPLOYEE', 'RH') NOT NULL,
    departement_id INT
 --   FOREIGN KEY (departement_id) REFERENCES Departement(id)
);
