CREATE DATABASE jointure;

USE jointure;

CREATE TABLE utilisateur(
id INT PRIMARY KEY AUTO_INCREMENT,
prenom VARCHAR(50) NOT NULL,
nom VARCHAR(50),
email VARCHAR(50),
ville VARCHAR(50),
actif INT
);

CREATE TABLE commande(
utilisateur_id INT,
data_achat DATE,
num_facture CHAR(6),
prix_total DOUBLE
);


INSERT INTO utilisateur(prenom, nom, email, ville, actif)
VALUES
("Aimée","Marechal","aimee.marechal@example.com","Paris",1),
("Esmé","Lefort","Esmé.Lefort@example.com","Lyon",0),
("Marine","Prevost","Marine.Prevost@example.com","Lille",1),
("Luc","Rolland","Luc.Rolland@example.com","Marseille",1);


INSERT INTO commande(utilisateur_id,data_achat,num_facture,prix_total)
VALUES
(1,"2013-01-23",'A00103',203.14),
(1,"2013-01-14",'A00104',124.06),
(2,"2013-01-23",'A00105',149.45),
(2,"2013-01-23",'A00106',235.35),
(5,"2013-01-23",'A00107',47.58);

-- Inner join

SELECT id,prenom,nom,data_achat,num_facture,prix_total
FROM utilisateur 
INNER JOIN commande ON utilisateur.id = commande.utilisateur_id;

-- 
SELECT id,prenom,nom,data_achat,num_facture,prix_total
FROM utilisateur 
JOIN commande ON utilisateur.id = commande.utilisateur_id;


-- left join

SELECT * 
FROM utilisateur
LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id;


-- right join

SELECT * 
FROM utilisateur
RIGHT JOIN commande ON utilisateur.id = commande.utilisateur_id;

SELECT * 
FROM commande
RIGHT JOIN utilisateur ON utilisateur.id = commande.utilisateur_id;

-- exemple Left joint en excluant les null

SELECT * 
FROM utilisateur
LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id
WHERE utilisateur_id IS NOT NULL;


-- le full join
/*
SELECT * 
FROM commande
FULL JOIN utilisateur ON utilisateur.id = commande.utilisateur_id;
*/
-- MySQL ne supporte pas le FULL JOIN on doit donc combiner un LEFT JOIN et un RIGHT JOIN
SELECT * 
FROM utilisateur
LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id
UNION
SELECT * 
FROM utilisateur
RIGHT JOIN commande ON utilisateur.id = commande.utilisateur_id

;

