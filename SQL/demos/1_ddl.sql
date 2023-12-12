/*****************
Manipulation des bases de donnees
*********************/

-- Creation de base de données 

CREATE DATABASE IF NOT EXISTS entreprise_demo 
	CHARACTER SET  = 'utf8mb4' 
	COLLATE = 'utf8mb4_general_ci';

-- Permet d'afficher toutes les bases de données
SHOW DATABASES;

-- Suppression de la base de données si elle existe
DROP DATABASE IF EXISTS entreprise_demo;

-- Modification de base de données
ALTER DATABASE entreprise_demo CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
ALTER DATABASE entreprise_demo DEFAULT CHARACTER SET utf8mb4;
ALTER DATABASE entreprise_demo ENCRYPTION='Y';

-- Afficher les schémas des bases de données
SELECT * FROM information_schema.SCHEMATA;

-- Utiliser la base de données
USE entreprise_demo;

/*****************
Manipulation des tables
*********************/

-- Creation d'une seconde table
CREATE TABLE IF NOT EXISTS service(
service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
libelle VARCHAR(150) NOT NULL
);

-- Creation d'une table si elle n'existe pas 

CREATE TABLE IF NOT EXISTS salarie(
salarie_id INT NOT NULL AUTO_INCREMENT, -- Clé primaire qui s'auto-incrémente
prenom VARCHAR(50) NOT NULL, -- Obligation de fournir une valeur
nom VARCHAR(50) NOT NULL,
age INT NOT NULL CHECK(age > 18 AND age < 65), -- contrainte pour vérifier l'age
salaire FLOAT NOT NULL DEFAULT 1500, -- Valeur par défaut
service_id INT NOT NULL, -- Ajout de la colonne pour la clé etrangere
PRIMARY KEY(salarie_id),
CONSTRAINT fk_service_id FOREIGN KEY (service_id)REFERENCES service(service_id)
); 


-- Suppression de la table
DROP TABLE IF EXISTS salarie;

-- Affiche les tables
SHOW TABLES;

-- affiche le détail des colonnes
SHOW COLUMNS FROM salarie;
SHOW COLUMNS FROM service;

-- Ajout de la contrainte apres creation de la table
ALTER TABLE salarie
		ADD CONSTRAINT fk_service_id FOREIGN KEY(service_id) REFERENCES service(service_id);
        
-- Ajouter une colonne date-heure
ALTER TABLE service
		ADD COLUMN date_modification DATETIME;
        
-- Modifier la colonne en type DATE
ALTER TABLE service
		MODIFY COLUMN date_modification DATE;
