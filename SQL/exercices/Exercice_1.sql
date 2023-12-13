CREATE DATABASE IF NOT EXISTS exercice_1
	CHARACTER SET = 'utf8mb4'
    COLLATE = 'utf8mb4_general_ci';

USE exercice_1;


CREATE TABLE IF NOT EXISTS personne(
personne_id INT NOT NULL AUTO_INCREMENT,
titre CHAR(3) NOT NULL ,
prenom VARCHAR(50) NOT NULL,
nom VARCHAR(50) NOT NULL,
telephone VARCHAR(10),
email VARCHAR(50),
PRIMARY KEY(personne_id)
);


CREATE TABLE IF NOT EXISTS adresse(
adresse_id INT NOT NULL AUTO_INCREMENT,
rue VARCHAR(50) NOT NULL,
ville VARCHAR(50) NOT NULL,
code_postal INT NOT NULL,
personne_id INT,
PRIMARY KEY(adresse_id),
FOREIGN KEY (personne_id) REFERENCES personne(personne_id)
);


INSERT INTO personne (titre,prenom,nom,telephone,email)
VALUES
('Mme','tata', 'Test','0604050606','tata.test@test.com'),
('Mr','toto', 'Test','0604050601','toto.test@test.com'),
('Mr','titi', 'Test','0604050604','titi.test@test.com'),
('Mme','tutu', 'Test','0604050603','tutu.test@test.com');

INSERT INTO personne (titre,prenom,nom,telephone,email)
VALUES
('Mle','truc', 'muche','0604050601','toto.test@test.com'),
('Mle','machin', 'chose','0604050604','titi.test@test.com');


INSERT INTO adresse (rue,ville,code_postal,personne_id)
VALUES
("17 rue dupont",'lille',59000,1),
("18 rue dupont",'lille',59000,3),
("19 rue dupont",'lille',59000,4),
("19 rue dupont",'lille',59000,6);

DROP TABLE adresse;

DROP TABLE personne;

SELECT * FROM personne;
SELECT * FROM adresse;

-- exercie 3/5

DELETE FROM adresse WHERE personne_id = '3';

DELETE FROM personne WHERE prenom = 'tata';
-- ça marche pas car la FK est dans adresse

DELETE FROM adresse WHERE personne_id = (SELECT personne_id FROM personne WHERE prenom = 'toto');
 
DELETE FROM personne WHERE prenom = 'toto';


-- exercice 4/5


INSERT INTO personne (titre,prenom,nom,telephone,email)
VALUES
('Mme','dupont', 'Testdupond','0604050612','dupond.test@test.com'),
('Mr','dupont', 'Testdupont','070050601','dupont.test@test.com');


SELECT * FROM personne;

UPDATE 
	personne 
SET 
	telephone = '061715'
WHERE
	prenom = 'dupont';
    
    
-- exercice 5
-- question 7
SELECT * FROM personne ORDER BY nom DESC;

-- question 8
SELECT * FROM personne ORDER BY titre ASC;

-- question 9
SELECT * FROM personne WHERE email = 'dupond.test@test.com';

-- SELECT * FROM personne WHERE email LIKE'dupon%';