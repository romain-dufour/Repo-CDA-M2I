CREATE DATABASE IF NOT EXISTS SQL_Appel_Offre;
USE SQL_Appel_Offre;

CREATE TABLE Produit(
   Numero_produit INT,
   Nom_produit VARCHAR(50),
   Prix_produit DECIMAL(15,2),
   PRIMARY KEY(Numero_produit)
);

CREATE TABLE Fournisseur(
   Numero_fournisseur INT,
   Nom_fournisseur VARCHAR(50),
   adresse_fournisseur VARCHAR(250),
   Code_Postal_fournisseur INT,
   Ville_fournisseur VARCHAR(50),
   PRIMARY KEY(Numero_fournisseur)
);

CREATE TABLE Contrat(
   Numero_contrat INT,
   Date_contrat DATE,
   Quantité_négociée DECIMAL(15,2),
   acceptation_refus BOOLEAN,
   Numero_produit INT NOT NULL,
   Numero_fournisseur INT NOT NULL,
   PRIMARY KEY(Numero_contrat),
   UNIQUE(Numero_produit),
   FOREIGN KEY(Numero_produit) REFERENCES Produit(Numero_produit),
   FOREIGN KEY(Numero_fournisseur) REFERENCES Fournisseur(Numero_fournisseur)
);

CREATE TABLE Appel_d_offre(
   numero_offre INT,
   date_offre DATE,
   date_cloture_offre DATE,
   Quantité INT,
   Numero_produit INT NOT NULL,
   PRIMARY KEY(numero_offre),
   FOREIGN KEY(Numero_produit) REFERENCES Produit(Numero_produit)
);

CREATE TABLE Reponds(
   numero_offre INT,
   Numero_fournisseur INT,
   PRIMARY KEY(numero_offre, Numero_fournisseur),
   FOREIGN KEY(numero_offre) REFERENCES Appel_d_offre(numero_offre),
   FOREIGN KEY(Numero_fournisseur) REFERENCES Fournisseur(Numero_fournisseur)
);


-- Ajout d'exemples dans la table Produit
INSERT INTO Produit (Numero_produit, Nom_produit, Prix_produit)
VALUES
   (1, 'Ordinateur portable', 999.99),
   (2, 'Imprimante laser', 299.50),
   (3, 'Smartphone', 699.00),
   (4, 'Tablette tactile', 349.99),
   (5, 'Casque audio sans fil', 129.95),
   (6, 'Enceinte Bluetooth', 79.99),
   (7, 'Appareil photo numérique', 549.50),
   (8, 'Téléviseur LED 55 pouces', 899.99),
   (9, 'Console de jeux vidéo', 399.00),
   (10, 'Aspirateur robot', 249.95),
   (11, 'Machine à café automatique', 179.50),
   (12, 'Grille-pain', 29.99),
   (13, 'Fer à repasser', 49.95),
   (14, 'Mixeur plongeant', 39.50),
   (15, 'Balance de cuisine', 19.99),
   (16, 'Lampe de bureau LED', 59.95),
   (17, 'Scanner de documents', 129.50),
   (18, 'Routeur Wi-Fi', 89.99),
   (19, 'Disque dur externe', 129.95),
   (20, 'Écran LCD 27 pouces', 349.95);

 INSERT INTO Produit (Numero_produit, Nom_produit, Prix_produit)
VALUES
   (21, 'Gobelet', 0.99),
   (22, 'souris', 15.99);
-- Ajout d'exemples dans la table Fournisseur
INSERT INTO Fournisseur (Numero_fournisseur, Nom_fournisseur, adresse_fournisseur, Code_Postal_fournisseur, Ville_fournisseur)
VALUES
   (1, 'ElectroniCorp', '123 Main Street', 12345, 'Paris'),
   (2, 'TechZone Solutions', '456 Oak Avenue', 67890, 'Digital City'),
   (3, 'InnovateTech Ltd.', '789 Maple Street', 54321, 'Innovation Center'),
   (4, 'Global Electronics Hub', '101 Pine Road', 98765, 'Techtopia'),
   (5, 'FutureTech Supplies', '234 Tech Boulevard', 34567, 'TechTown'),
   (6, 'Quantum Innovations', '567 Circuit Lane', 87654, 'Innovate City'),
   (7, 'TechPro Solutions', '890 Binary Street', 23456, 'Digital Hub'),
   (8, 'NexGen Technologies', '1235 Silicon Avenue', 67890, 'TechVista'),
   (9, 'SmartTech Providers', '432 Gadget Square', 87654, 'InnovateVille'),
   (10, 'EcoTech Innovations', '987 Green Tech Road', 12345, 'EcoCity'),
   (11, 'MicroTech Dynamics', '654 Nano Lane', 54321, 'MicroVille'),
   (12, 'Alpha Solutions', '876 Tech Tower', 34567, 'Alpha City'),
   (13, 'Omega Electronics', '321 Circuit Street', 23456, 'OmegaVille'),
   (14, 'InnoSphere Tech', '5677 Innovation Avenue', 87654, 'InnoCity'),
   (15, 'FutureWave Systems', '432 Quantum Road', 34567, 'Quantum City'),
   (16, 'TechHub Enterprises', '765 Future Lane', 12345, 'Paris'),
   (17, 'InnoVision Dynamics', '987 Vision Street', 54321, 'VisionVille'),
   (18, 'XtremeTech Solutions', '543 Xtreme Road', 23456, 'Xtreme City'),
   (19, 'CyberTech Innovations', '876 Cyber Lane', 87654, 'CyberVille'),
   (20, 'Global Suppliers Ltd.', '789 Elm Street', 98765, 'City Center');

-- Ajout d'exemples dans la table Contrat
INSERT INTO Contrat (Numero_contrat, Date_contrat, Quantité_négociée, acceptation_refus, Numero_produit, Numero_fournisseur)
VALUES
   (1, '2024-01-01', 100, true, 1, 1),
   (2, '2024-01-02', 150, false, 2, 2),
   (3, '2024-01-03', 120, true, 3, 3),
   (4, '2024-01-04', 180, false, 4, 4),
   (5, '2024-01-05', 90, true, 5, 5),
   (6, '2024-01-06', 200, true, 6, 6),
   (7, '2024-01-07', 160, false, 7, 7),
   (8, '2024-01-08', 130, true, 8, 8),
   (9, '2024-01-09', 170, false, 9, 9),
   (10, '2024-01-10', 110, true, 10, 10),
   (11, '2024-01-11', 140, true, 11, 11),
   (12, '2024-01-12', 190, false, 12, 12),
   (13, '2024-01-13', 80, true, 13, 13),
   (14, '2024-01-14', 220, true, 14, 14),
   (15, '2024-01-15', 150, false, 15, 15),
   (16, '2024-01-16', 120, true, 16, 16),
   (17, '2024-01-17', 170, false, 17, 17),
   (18, '2024-01-18', 130, true, 18, 18),
   (19, '2024-01-19', 110, false, 19, 19),
   (20, '2024-01-20', 200, true, 20, 20);



-- Ajout d'exemples dans la table Appel_d_offre
INSERT INTO Appel_d_offre (numero_offre, date_offre, date_cloture_offre, Quantité, Numero_produit)
VALUES
   (1, '2024-02-01', '2024-02-10', 500, 1),
   (2, '2024-02-02', '2024-02-12', 700, 2),
   (3, '2024-02-03', '2024-02-15', 600, 3),
   (4, '2024-02-04', '2024-02-18', 800, 4),
   (5, '2024-02-05', '2024-02-20', 550, 5),
   (6, '2024-02-06', '2024-02-22', 750, 6),
   (7, '2024-02-07', '2024-02-25', 650, 7),
   (8, '2024-02-08', '2024-02-28', 700, 8),
   (9, '2024-02-09', '2024-03-01', 900, 9),
   (10, '2024-02-10', '2024-03-05', 800, 10),
   (11, '2024-02-11', '2024-03-10', 600, 11),
   (12, '2024-02-12', '2024-03-12', 950, 12),
   (13, '2024-02-13', '2024-03-15', 700, 13),
   (14, '2024-02-14', '2024-03-18', 850, 14),
   (15, '2024-02-15', '2024-03-20', 750, 15),
   (16, '2024-02-16', '2024-03-22', 800, 16),
   (17, '2024-02-17', '2024-03-25', 900, 17),
   (18, '2024-02-18', '2024-03-28', 700, 18),
   (19, '2024-02-19', '2024-03-30', 600, 19),
   (20, '2024-02-20', '2024-03-31', 850, 20);

-- Ajout d'exemples dans la table Reponds
INSERT INTO Reponds (numero_offre, Numero_fournisseur)
VALUES
   (1, 15),
   (2, 9),
   (3, 8),
   (4, 14),
   (5, 9),
   (6, 16),
   (7, 17),
   (8, 2),
   (9, 9),
   (10, 10),
   (11, 13),
   (12, 19),
   (13, 3),
   (14, 14),
   (15, 5),
   (16, 6),
   (17, 7),
   (18, 18),
   (19, 19),
   (20, 20);



### Si votre modélisation est correcte, vous devriez être capable d'extraire des données des demandes ci-dessous (votre jeu de données devra prendre en compte les informations demandées): 

 -- 1 - Sélectionner tous les produits avec leur prix.
 SELECT * FROM Produit;

 -- 2 - Trouver le nombre total d'offres disponibles.
SELECT COUNT(*) AS Nombre_offre_disponible FROM Appel_d_offre 
WHERE 2024-01-12 < date_cloture_offre;


 -- 3 - Lister tous les fournisseurs situés à Paris.

SELECT * from Fournisseur WHERE Ville_fournisseur LIKE "Paris";

 -- 4 - Afficher les offres et la quantité totale de produits demandés pour chaque offre.

SELECT numero_offre,Numero_produit,Quantité FROM Appel_d_offre;

 -- 5 - Trouver les produits qui n'ont pas encore été inclus dans un contrat.

SELECT P.Numero_produit, P.Nom_produit
FROM Produit P
LEFT JOIN Contrat C ON P.Numero_produit = C.Numero_produit
WHERE C.Numero_contrat IS NULL;

 -- 6 - Afficher les contrats signés par chaque fournisseur avec la date de signature.

SELECT 
    F.Numero_fournisseur,
    F.Nom_fournisseur,
    C.Numero_contrat,
    C.Date_contrat
FROM 
    Fournisseur F
JOIN 
    Contrat C ON F.Numero_fournisseur = C.Numero_fournisseur;
    
 -- 7 - Lister les offres avec les noms des produits correspondants.

SELECT 
	A.Numero_offre,
	A.Date_offre,
    P.Numero_produit,
    P.Nom_produit
FROM
	Appel_d_offre A
JOIN
	Produit P ON A.Numero_produit = P.Numero_produit;
 
 -- 8 - Trouver le fournisseur qui a effectué le plus d'offres.
SELECT
    F.Numero_fournisseur,
    F.Nom_fournisseur,
    COUNT(A.numero_offre) AS Nombre_offres
FROM
    Fournisseur F
JOIN
    Reponds R ON F.Numero_fournisseur = R.Numero_fournisseur
JOIN
    Appel_d_offre A ON R.numero_offre = A.numero_offre
GROUP BY
    F.Numero_fournisseur, F.Nom_fournisseur
ORDER BY
    Nombre_offres DESC
LIMIT 1;

 -- 9 - Calculer le montant total des contrats par produit.


 -- 10 - Trouver les offres qui n'ont pas été signées avant leur date de clôture et les fournisseurs responsables.
 
 
 
 
