CREATE DATABASE IF NOT EXISTS exercice_3
	CHARACTER SET = 'utf8mb4'
    COLLATE = 'utf8mb4_general_ci';

USE exercice_3;

-- question 1

CREATE TABLE IF NOT EXISTS professeur(
professeur_id INT NOT NULL,
prenom VARCHAR(50),
nom VARCHAR(50),
numero_classe INT,
numero_departement INT,
email VARCHAR(255),
telephone VARCHAR(50)
);

-- question 2
CREATE TABLE IF NOT EXISTS etudiant(
etudiant_id INT,
prenom VARCHAR(50),
nom VARCHAR(50),
telephone VARCHAR(50),
numero_classe INT,
date_obtention_diplome DATE
);

-- question 3

CREATE TABLE IF NOT EXISTS professeur_etudiant (
professeur_etudiant_id INT NOT NULL AUTO_INCREMENT,
etudiant_id INT NOT NULL,
professeur_id INT NOT NULL,
PRIMARY KEY (professeur_etudiant_id),
FOREIGN KEY (etudiant_id) REFERENCES etudiant(etudiant_id),
FOREIGN KEY (professeur_id) REFERENCES professeur(professeur_id)
);

-- question 4

ALTER TABLE etudiant
        MODIFY telephone VARCHAR(50) NOT NULL;
        
ALTER TABLE etudiant
        ADD PRIMARY KEY(etudiant_id);

ALTER TABLE professeur
		MODIFY professeur_id INT NOT NULL AUTO_INCREMENT;
			
ALTER TABLE etudiant
        ADD PRIMARY KEY(etudiant_id);
        
ALTER TABLE etudiant
		MODIFY etudiant_id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE etudiant
		MODIFY COLUMN telephone VARCHAR(50) UNIQUE;

ALTER TABLE professeur
		MODIFY COLUMN telephone VARCHAR(50) UNIQUE;
        
ALTER TABLE professeur
		MODIFY COLUMN email VARCHAR(255) UNIQUE;
        

-- question 5
INSERT INTO etudiant (prenom, nom, telephone)
VALUES ('toto','tata',"0102030405");

-- Teste valeur unique telephone
INSERT INTO etudiant (prenom, nom, telephone)
VALUES ('toto','tata',"0102030405");

-- Teste valeur not null
INSERT INTO etudiant (prenom, nom)
VALUES ('toto','tata');

INSERT INTO etudiant (prenom, nom)
VALUES ('roro','rara');



-- insert prof
INSERT INTO professeur (prenom, nom, numero_classe,numero_departement,email,telephone)
VALUES ('prof1','PROF11',"25","01","prof1.PROF11@ecole.fr","0102030405");


INSERT INTO professeur (prenom, nom,email,telephone)
VALUES 
('prof2','PROF22',"prof2.PROF22@ecole.fr","0504030201");

INSERT INTO professeur (prenom, nom,email,telephone)
VALUES 
('prof23','PROF23',"prof2.PROF23@ecole.fr","050403021"),
('prof24','PROF24',"prof2.PROF24@ecole.fr","05040301"),
('prof25','PROF25',"prof2.PROF25@ecole.fr","0500201");

INSERT INTO professeur_etudiant (etudiant_id, professeur_id)
VALUES(1,1);
INSERT INTO professeur_etudiant (etudiant_id, professeur_id)
VALUES(1,2);
INSERT INTO professeur_etudiant (etudiant_id, professeur_id)
VALUES(2,2);

INSERT INTO professeur_etudiant (etudiant_id, professeur_id)
VALUES
(3,2),
(3,1);


SELECT * FROM etudiant;
SELECT * FROM professeur;
SELECT * FROM professeur_etudiant;
