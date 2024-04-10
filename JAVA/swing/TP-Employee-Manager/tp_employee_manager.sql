
-- Création de la base de données TP_employee_manager
CREATE DATABASE IF NOT EXISTS TP_employee_manager;

-- Utilisation de la base de données créée
USE TP_employee_manager;

-- Création de la table Departement
CREATE TABLE IF NOT EXISTS Departement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Création de la table Role
CREATE TABLE IF NOT EXISTS Role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insertion des rôles
INSERT INTO Role (name) VALUES ('MANAGER'), ('EMPLOYEE'), ('RH');

-- Création de la table Salarie
CREATE TABLE IF NOT EXISTS Salarie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    firstName VARCHAR(255) NOT NULL,
    role_id INT,
    departement_id INT,
    FOREIGN KEY (role_id) REFERENCES Role(id),
    FOREIGN KEY (departement_id) REFERENCES Departement(id)
);
