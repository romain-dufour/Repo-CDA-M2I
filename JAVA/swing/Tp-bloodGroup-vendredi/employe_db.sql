-- Création de la base de données TP_employee_manager
CREATE DATABASE IF NOT EXISTS employe_db;

-- Utilisation de la base de données créée
USE employe_db;


-- Création de la table employee
CREATE TABLE IF NOT EXISTS employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    gender ENUM('MALE', 'FEMALE') NOT NULL,
    age INT NOT NULL,
    bloodGroup VARCHAR(10) NOT NULL,
    contactNumber INT NOT NULL,
    qualification ENUM('DOCT', 'DESS', 'MAST', 'LICE', 'BTS', 'DEUG', 'DUT', 'BAC') NOT NULL,
    startDate DATE NOT NULL,
    imageUrl VARCHAR(255),
    address VARCHAR(255) NOT NULL
);