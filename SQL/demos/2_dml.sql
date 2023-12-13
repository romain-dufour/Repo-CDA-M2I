-- INSERT INTO

USE entreprise_demo;


-- Methode 1
-- Sans preciser les colonnes

INSERT INTO service
VALUES (NULL,'RH','2023-12-12');

-- Methode 2
-- En précisant les colonnes

INSERT INTO service (libelle, date_modification)
VALUES 
('compta','2023-12-11'),
('tech','2023-12-10');


-- Méthode 3
-- via requete imbriquee
INSERT INTO service (libelle, date_modification)
SELECT
'R&D' as libelle,
'2023-12-09' as date_modification;

SELECT * FROM service;

-- DELETE FROM

-- Supprime tous les enregistrement de la table
DELETE FROM service;

-- Suppression avec condition sur l'id
DELETE FROM service WHERE service_id = 6;

-- Suppression avec condition sur le libelle
DELETE FROM service WHERE libelle = 'tech';


-- UPDATE

-- Mise a jour de l'enregistrement
UPDATE 
	service 
SET 
	libelle = 'technologie',
    date_modification = NOW()
WHERE
	libelle = 'tech';


-- SELECT

-- Selectionner toutes les colonnes d'une table
SELECT * FROM service;

-- Selectionner une colonne d'une table
SELECT libelle FROM service;

-- Selectionner plusieurs collones d'une tables
SELECT service_id,libelle FROM service;

-- Prefixer les colonnes du nom de la table
SELECT service.service_id,service.libelle FROM service;

-- 

INSERT INTO salarie(prenom,nom, age, salaire, service_id)
VALUES 
('jeanne',"dupond",35,4500,11),
('jacques',"chirac",62,3500,12),
('Michelle',"obama",59,1500,13),
('roberta',"patinson",20,4000,14),
('michael',"patate",20,2500,15),
('robert',"patinson",30,2500,16),
('jeanne',"patinson",35,4500,17);




-- Selection sur plusieurs tables
SELECT * FROM service, salarie;

-- instruction WHERE
SELECT nom, prenom FROM salarie WHERE salaire > 1500;

SELECT nom, prenom FROM salarie WHERE salaire > 2000 AND age > 33;

SELECT nom, prenom FROM salarie WHERE age < 33 OR salaire > 3600 ;

SELECT salarie_id, nom, prenom, age FROM salarie WHERE age BETWEEN 27 AND 36;

-- DISTINCT elimine les doublons

SELECT DISTINCT salaire FROM salarie;

-- LIMIT : specifie le nombre de ligne a retourner
SELECT * FROM service LIMIT 3;


-- ORDER BY : retourne le résultat dans un ordre défini
SELECT * FROM service ORDER BY libelle DESC; -- ASC implicite


-- Requettes imbriquées
SELECT nom, prenom 
FROM (SELECT * FROM salarie WHERE prenom LIKE 'r%') AS prenom_en_r
WHERE age> 25;

SELECT service_id, COUNT(service_id) AS nombre_service FROM salarie GROUP BY service_id;

SELECT * FROM salarie;

SELECT * FROM salarie WHERE nom = 'chirac';
SELECT * FROM salarie WHERE salarie_id = '16'; -- recherche par colonne indexe plus efficace

SELECT service_id, AVG(salaire) FROM salarie GROUP BY service_id HAVING AVG(salaire) > 3000 ;


