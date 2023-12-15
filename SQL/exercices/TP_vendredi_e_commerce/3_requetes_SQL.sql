USE tabletoptreasures_database;

-- table catégories

-- 1. Sélectionnez tous les noms de catégories distinctes.
SELECT nom FROM Categories;

-- 2. Montrez les catégories avec des noms commençant par "A" ou "S". 
 SELECT * FROM Categories
 WHERE nom LIKE 'a%' OR nom LIKE 's%';

-- 3. Quelles catégories ont un ID entre 2 et 5 inclus ?
 SELECT * FROM Categories 
WHERE Categories_id > 2 AND Categories_id <= 5;


-- 4. Combien de catégories différentes existent ?
 SELECT COUNT(Categories_id)AS nombre_Categories 
 FROM Categories ;

-- 5. Quelle est la catégorie ayant le nom le plus long ?
 SELECT MAX(nom) FROM Categories AS nom_lepluslong;


-- 6. Montrez le nombre de jeux dans chaque catégorie.

SELECT C.nom,COUNT(ID_Categorie) AS Nbr_jeux
FROM Jeux J
INNER JOIN Categories C ON  C.Categories_id = J.ID_Categorie
GROUP BY C.nom
;

-- 7. Affichez les catégories triées par ordre alphabétique inversé.
SELECT * FROM Categories
ORDER BY nom DESC;


-- table Jeux

-- 1. Sélectionnez tous les noms de jeux distincts.
SELECT DISTINCT nom FROM Jeux;


-- 2. Montrez les jeux avec un prix entre 25 et 40.
SELECT * FROM Jeux
WHERE prix > 25 AND prix < 40;

-- 3. Quels jeux appartiennent à la catégorie avec l'ID 3 ?
SELECT * FROM Jeux
WHERE ID_Categorie = 3;

-- 4. Combien de jeux ont une description contenant le mot "aventure" ?

SELECT * FROM Jeux
WHERE Description LIKE '%aventure%';


-- 5. Quel est le jeu le moins cher ?
SELECT nom , Prix,MIN(Prix) as PrixMini FROM Jeux
GROUP BY nom
HAVING Prix = PrixMini
;


-- 6. Montrez la somme totale des prix de tous les jeux.
SELECT SUM(Prix) AS PrixTotal FROM Jeux;

-- 7. Affichez les jeux triés par ordre alphabétique des noms en limitant les résultats à 5.

SELECT * FROM Jeux
ORDER BY nom 
LIMIT 5;


-- Table "Clients" :
-- 1. Sélectionnez tous les prénoms des clients distincts.
SELECT DISTINCT prenom FROM CLIENTS;

-- 2. Montrez les clients dont l'adresse contient "Rue" et dont le numéro de téléphone commence par "+1".
SELECT * FROM Clients
WHERE Adresse_de_livraison LIKE '%Rue%' and Telephone LIKE '+1%';


-- 3. Quels clients ont un nom commençant par "M" ou "R" ?
SELECT * FROM Clients
WHERE nom LIKE 'M%' OR 'R%';

-- 4. Combien de clients ont une adresse e-mail valide (contenant "@") ?
SELECT COUNT(Clients_id)AS Nombre_clients FROM Clients
WHERE Adresse_mail LIKE '%@%';

-- 5. Quel est le prénom le plus court parmi les clients ?
SELECT MIN(prenom)
FROM Clients;


-- 6. Montrez le nombre total de clients enregistrés.
SELECT COUNT(Clients_id) FROM Clients;

-- 7. Affichez les clients triés par ordre alphabétique des noms de famille, mais en excluant les premiers 3.
SELECT * FROM Clients 
ORDER BY nom
Limit 3,15;

