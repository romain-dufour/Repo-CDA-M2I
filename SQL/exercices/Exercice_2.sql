CREATE DATABASE IF NOT EXISTS exercice_2
	CHARACTER SET = 'utf8mb4'
    COLLATE = 'utf8mb4_general_ci';

USE exercice_2;

CREATE TABLE IF NOT EXISTS leRole(
role_id INT AUTO_INCREMENT NOT NULL,
libelle VARCHAR(50) NOT NULL,
PRIMARY KEY(role_id)
);

CREATE TABLE IF NOT EXISTS compte_role(
compte_id INT AUTO_INCREMENT NOT NULL,
role_id INT NOT NULL,
date_ajout DATETIME DEFAULT NOW(),
PRIMARY KEY(compte_id, role_id),
CONSTRAINT fk_role_id FOREIGN KEY (role_id)REFERENCES leRole(role_id),
FOREIGN KEY (compte_role)REFERENCES compte_role(compte_id),
FOREIGN KEY (leRole) REFERENCES leRole(role_id)
);

CREATE TABLE IF NOT EXISTS compte(
compte_id INT NOT NULL AUTO_INCREMENT,
pseudo VARCHAR(50) NOT NULL,
mot_de_passe VARCHAR(50) NOT NULL,
email VARCHAR(255) NOT NULL,
date_creation DATETIME NOT NULL,
derniere_connexion VARCHAR(50) NOT NULL,
compte_role INT NOT NULL,
PRIMARY KEY(compte_id)
);


