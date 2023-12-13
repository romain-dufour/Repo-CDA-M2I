CREATE DATABASE exercice_5;

USE exercice_5;

SELECT * FROM villes_france_free;
SELECT * FROM departement;

-- question 1
SELECT * FROM villes_france_free ORDER BY ville_population_2012 DESC LIMIT 10;

-- question 2
SELECT * FROM villes_france_free ORDER BY ville_surface LIMIT 50;

-- question 3
SELECT * FROM departement
	WHERE departement_code LIKE '97%';

-- question 4
SELECT ville_nom,ville_population_2012,departement_nom
FROM villes_france_free
INNER JOIN departement ON villes_france_free.ville_departement = departement.departement_code
ORDER BY ville_population_2012 DESC LIMIT 10;

-- question 5

SELECT departement_nom, departement_code, COUNT(ville_commune) AS 'liste departement ayant le plus de communes'
FROM departement
INNER JOIN villes_france_free ON villes_france_free.ville_departement = departement.departement_code
GROUP BY departement_nom, departement_code
ORDER BY COUNT(ville_commune) DESC;


-- question 6

SELECT ville_departement, SUM(ville_surface) AS departement_avec_la_plus_grance_superficie
FROM
villes_france_free
GROUP BY ville_departement
ORDER BY SUM(ville_surface) DESC
LIMIT 10;


-- question 7

SELECT COUNT(*) AS nombre_ville FROM villes_france_free
WHERE ville_nom LIKE 'saint%';


-- question 8

SELECT 
	ville_nom, 
	COUNT(ville_nom) as nbr_ville
FROM 
	villes_france_free
GROUP BY 
	ville_nom
HAVING  nbr_ville> 1

;


-- question 9
SELECT ville_nom, ville_surface
FROM villes_france_free
WHERE ville_surface > (
	SELECT AVG(ville_surface)AS superficieMoyenne FROM villes_france_free AS superficieMoyenne
)
;


-- question 10

SELECT departement_code, departement_nom,SUM(ville_population_2012) AS po
FROM departement
INNER JOIN villes_france_free ON villes_france_free.ville_departement = departement.departement_code
GROUP BY departement_code, departement_nom
HAVING SUM(ville_population_2012)  > 2000000
;

 -- question 11
 
 UPDATE villes_france_free
SET ville_nom = REPLACE(ville_nom, '-', ' ')
WHERE ville_nom LIKE "SAINT-%"
;