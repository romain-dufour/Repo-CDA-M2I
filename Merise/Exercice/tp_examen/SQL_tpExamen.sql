CREATE DATABASE IF NOT EXISTS TP_Merise_examen;
USE TP_Merise_examen;

CREATE TABLE Etablissement(
   code_etablissement INT,
   nom_etablissement VARCHAR(50),
   adresse VARCHAR(250),
   ville VARCHAR(50),
   PRIMARY KEY(code_etablissement)
);

CREATE TABLE Examens(
   id_examen INT,
   nom_examen VARCHAR(50),
   PRIMARY KEY(id_examen)
);

CREATE TABLE Professeurs(
   matricule INT,
   telephone INT,
   adresse VARCHAR(250),
   etablissement VARCHAR(50),
   nom VARCHAR(50),
   code_etablissement INT NOT NULL,
   PRIMARY KEY(matricule),
   FOREIGN KEY(code_etablissement) REFERENCES Etablissement(code_etablissement)
);

CREATE TABLE Epreuve(
   id_epreuve INT,
   nom_epreuve VARCHAR(50) NOT NULL,
   coefficient INT,
   id_examen INT NOT NULL,
   PRIMARY KEY(id_epreuve),
   FOREIGN KEY(id_examen) REFERENCES Examens(id_examen)
);

CREATE TABLE Etudiant(
   id_etudiant INT,
   nom_etudiant VARCHAR(50),
   adresse VARCHAR(250),
   ville VARCHAR(50),
   id_examen INT NOT NULL,
   code_etablissement INT NOT NULL,
   PRIMARY KEY(id_etudiant),
   FOREIGN KEY(id_examen) REFERENCES Examens(id_examen),
   FOREIGN KEY(code_etablissement) REFERENCES Etablissement(code_etablissement)
);

CREATE TABLE Dossier_inscription(
   id_dossier INT,
   id_etudiant INT NOT NULL,
   PRIMARY KEY(id_dossier),
   FOREIGN KEY(id_etudiant) REFERENCES Etudiant(id_etudiant)
);

CREATE TABLE corrige(
   id_epreuve INT,
   matricule INT,
   PRIMARY KEY(id_epreuve, matricule),
   FOREIGN KEY(id_epreuve) REFERENCES Epreuve(id_epreuve),
   FOREIGN KEY(matricule) REFERENCES Professeurs(matricule)
);

CREATE TABLE Redige(
   id_epreuve INT,
   matricule INT,
   PRIMARY KEY(id_epreuve, matricule),
   FOREIGN KEY(id_epreuve) REFERENCES Epreuve(id_epreuve),
   FOREIGN KEY(matricule) REFERENCES Professeurs(matricule)
);

CREATE TABLE notation(
   id_epreuve INT,
   id_etudiant INT,
   note_epreuve DECIMAL(15,2),
   PRIMARY KEY(id_epreuve, id_etudiant),
   FOREIGN KEY(id_epreuve) REFERENCES Epreuve(id_epreuve),
   FOREIGN KEY(id_etudiant) REFERENCES Etudiant(id_etudiant)
);


-- Insertion dans la table Examens
INSERT INTO Examens (id_examen, nom_examen) VALUES
(1, 'Baccalauréat'),
(2, 'brevet des colleges'),
(3, 'ECF BACK'),
(4, 'ECF FRONT'),
(5, 'CAP');

-- Insertion dans la table Epreuve
INSERT INTO Epreuve (id_epreuve, nom_epreuve, coefficient, id_examen) VALUES
(1, 'Maths', 2, 1),
(2, 'SQL', 3, 1),
(3, 'Java', 1, 2),
(4, 'UML', 2, 2),
(5, 'Merise', 3, 3),
(6, 'TypeScript', 2, 2),
(7, 'React', 3, 3),
(8, 'Angular', 2, 2),
(9, 'HTML', 3, 1),
(10, 'CSS', 3, 2),
(11, 'Javascript', 3, 3);

-- Insertion dans la table Etablissement


INSERT INTO Etablissement (code_etablissement, nom_etablissement, adresse, ville) VALUES
(1, 'La sorbonne', '10 Rue de la République', 'Paris'),
(2, 'Chez marcel', '25 Avenue du Vieux-Port', 'Marseille'),
(3, 'Les beaux arts', '5 Place Bellecour', 'Lyon'),
(4, 'Lycée', '8 Quai de la Douane', 'Bordeaux'),
(5, 'College', '15 Promenade des Anglais', 'Nice'),
(6, 'Le Louvre', '2 Rue de Rivoli', 'Paris'),
(7, 'La Canebière', '40 Quai des Belges', 'Marseille'),
(8, 'Musée des Confluences', '86 Quai Perrache', 'Lyon'),
(9, 'Lycée Montaigne', '15 Rue du Hâ', 'Bordeaux'),
(10, 'Collège Saint-Jean', '28 Avenue Jean Médecin', 'Nice');

-- Insertion dans la table Professeurs

INSERT INTO Professeurs (matricule, telephone, adresse, etablissement, nom, code_etablissement) VALUES
(1, 123456789, '12 Rue de la Liberté', 'Université Paris-Sud', 'Jean Dupont', 1),
(2, 987654321, '25 Avenue des Palmiers', 'Université de Marseille', 'Marie Martin', 2),
(3, 456789123, '5 Place Saint-Jean', 'Université Lumière Lyon 2', 'Pierre Leclerc', 3),
(4, 321654987, '8 Quai de la Douane', 'Université de Bordeaux', 'Isabelle Dubois', 6),
(5, 789123456, '15 Promenade des Anglais', 'Université Nice Sophia Antipolis', 'Michel Robert', 7),
(6, 654321987, '2 Rue de la République', 'La Sorbonne', 'Sophie Lefevre', 3),
(7, 987123654, '40 Quai des Belges', 'Aix-Marseille Université', 'Paul Durand', 6),
(8, 456321789, '15 Rue du Palais', 'Université Claude Bernard Lyon 1', 'Lucie Lambert', 6),
(9, 321789654, '28 Cours de lIntendance', 'Université de Bordeaux Montaigne', 'Louis Rousseau', 9),
(10, 654789321, '20 Avenue Jean Médecin', 'Université Nice Côte dAzur', 'Colette Moreau', 10),
(11, 123654789, '7 Rue du Faubourg Saint-Antoine', 'Université Paris-Sud', 'Caroline Deschamps', 1),
(12, 987321654, '30 Avenue des Goudes', 'Université de Marseille', 'Alexandre Leroux', 2),
(13, 456123789, '3 Rue Bellecour', 'Université Lumière Lyon 2', 'Catherine Morel', 3),
(14, 321987654, '10 Quai de la Marne', 'Université de Bordeaux', 'François Lefevre', 4),
(15, 789654321, '25 Promenade des Anglais', 'Université Nice Sophia Antipolis', 'Nathalie Dubois', 5),
(16, 654789123, '4 Rue de la République', 'La Sorbonne', 'Philippe Durand', 1),
(17, 987456321, '35 Quai des Belges', 'Aix-Marseille Université', 'Christine Lambert', 2),
(18, 456987321, '12 Rue du Palais', 'Université Claude Bernard Lyon 1', 'David Rousseau', 3),
(19, 321654789, '22 Cours de lIntendance', 'Université de Bordeaux Montaigne', 'Valérie Moreau', 4),
(20, 654321987, '18 Avenue Jean Médecin', 'Université Nice Côte dAzur', 'Pierre Lemoine', 5);



-- Insertion dans la table Etudiant
INSERT INTO Etudiant (id_etudiant, nom_etudiant, adresse, ville, id_examen, code_etablissement) VALUES
(1, 'Michelle', 'rue des postes', 'paris', 1, 1),
(2, 'Robert', 'rue des stations', 'lyon', 1, 2),
(3, 'Toto', 'rue de la soif', 'lille', 2, 3),
(4, 'Titi', 'dans la rue', 'au chaud jespere', 2, 4),
(5, 'Tutu', 'chez papa et maman', 'marseille', 3, 5),
(6, 'Sophie', 'Avenue des Champs-Élysées', 'paris', 1, 1),
(7, 'Paul', 'Place des Terreaux', 'lyon', 1, 2),
(8, 'Lulu', 'Rue de la Treille', 'lille', 2, 3),
(9, 'Lolo', 'Rue Sainte-Catherine', 'bordeaux', 2, 4),
(10, 'Coco', 'Promenade des Anglais', 'nice', 3, 5),
(11, 'Victor', 'Avenue Victor Hugo', 'paris', 1, 1),
(12, 'Sophie', 'Rue Saint-Michel', 'lyon', 2, 2),
(13, 'Alexandre', 'Boulevard des Lumières', 'lille', 3, 3),
(14, 'Céline', 'Place de la Bourse', 'bordeaux', 4, 4),
(15, 'Gabriel', 'Quai des Arts', 'marseille', 5, 5),
(16, 'Camille', 'Avenue des Fleurs', 'nice', 1, 6),
(17, 'Lucas', 'Rue de la Liberté', 'paris', 2, 7),
(18, 'Emma', 'Place des Cordeliers', 'lyon', 3, 8),
(19, 'Louis', 'Boulevard Haussmann', 'lille', 4, 9),
(20, 'Anna', 'Quai des Chartrons', 'bordeaux', 5, 10),
(21, 'Thomas', 'Avenue des Tilleuls', 'marseille', 1, 1),
(22, 'Chloé', 'Rue de la Paix', 'nice', 2, 2),
(23, 'Nathan', 'Boulevard du Palais', 'paris', 3, 3),
(24, 'Léa', 'Place de la Comédie', 'lyon', 4, 4),
(25, 'Hugo', 'Quai de la Daurade', 'lille', 5, 5),
(26, 'Inès', 'Avenue Foch', 'bordeaux', 1, 6),
(27, 'Enzo', 'Rue Royale', 'marseille', 2, 7),
(28, 'Zoé', 'Place de lHôtel de Ville', 'nice', 3, 8),
(29, 'Maxime', 'Boulevard Carnot', 'paris', 4, 9),
(30, 'Manon', 'Quai Saint-Pierre', 'lyon', 5, 10);


-- Insertion dans la table Dossier_inscription
INSERT INTO Dossier_inscription (id_dossier, id_etudiant) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20),
(21, 21),
(22, 22),
(23, 23),
(24, 24),
(25, 25),
(26, 26),
(27, 27),
(28, 28),
(29, 29),
(30, 30);

-- Insertion dans la table corrige
INSERT INTO corrige (id_epreuve, matricule) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 7),
(7, 6),
(8, 9),
(9, 4),
(10, 3);

-- Insertion dans la table Redige
INSERT INTO Redige (id_epreuve, matricule) VALUES
(1, 1),
(2, 6),
(3, 5),
(4, 4),
(5, 9),
(6, 10),
(7, 10),
(8, 9),
(9, 4),
(10, 7);

-- Insertion dans la table notation
INSERT INTO notation (id_epreuve, id_etudiant, note_epreuve) VALUES
(1, 1, 18.5),
(2, 2, 16.8),
(3, 3, 14.2),
(4, 4, 19.7),
(5, 5, 17.3),
(6, 3, 10),
(7, 9, 12,7),
(8, 4, 8,4),
(9, 9, 10,3),
(10, 1, 19);



 -- 1 - Sélectionner tous les élèves et leurs dates de naissance.
SELECT id_etudiant, nom_etudiant
FROM Etudiant;
-- Ne fonctionne pas car la date de naissance n'est pas renseignée

-- 2 - Trouver la note moyenne pour l'examen 'Baccalauréat'.
SELECT AVG(note_epreuve) AS moyenne_bac
FROM notation
JOIN Epreuve ON notation.id_epreuve = Epreuve.id_epreuve
JOIN Examens ON Epreuve.id_examen = Examens.id_examen
WHERE Examens.nom_examen = 'Baccalauréat';


-- 3 - Lister tous les enseignants travaillant à 'Paris'.
SELECT *
FROM Professeurs
JOIN Etablissement ON Professeurs.code_etablissement = Etablissement.code_etablissement
WHERE Etablissement.ville = 'Paris';


-- 4 - Compter le nombre d'élèves inscrits dans chaque établissement.
SELECT Etablissement.nom_etablissement, COUNT(Etudiant.id_etudiant) AS nombre_eleves
FROM Etablissement
LEFT JOIN Etudiant ON Etablissement.code_etablissement = Etudiant.code_etablissement
GROUP BY Etablissement.nom_etablissement;


-- 5 - Obtenir les noms de tous les élèves ayant passé un examen avec une note supérieure à 15.
SELECT Etudiant.nom_etudiant
FROM Etudiant
JOIN notation ON Etudiant.id_etudiant = notation.id_etudiant
WHERE notation.note_epreuve > 15;

-- 6 - Afficher les examens et les noms des épreuves correspondantes avec leurs coefficients.
SELECT Examens.nom_examen, Epreuve.nom_epreuve, Epreuve.coefficient
FROM Examens
JOIN Epreuve ON Examens.id_examen = Epreuve.id_examen;


-- 7 - Lister les établissements avec le nombre d'examens différents pris, triés par le nombre d'examens.
SELECT Etablissement.nom_etablissement, COUNT(DISTINCT Etudiant.id_examen) AS nombre_examens
FROM Etablissement
LEFT JOIN Etudiant ON Etablissement.code_etablissement = Etudiant.code_etablissement
GROUP BY Etablissement.nom_etablissement
ORDER BY nombre_examens DESC;


-- 8 - Trouver tous les élèves qui n'ont passé aucun examen :
SELECT Etudiant.nom_etudiant
FROM Etudiant
LEFT JOIN notation ON Etudiant.id_etudiant = notation.id_etudiant
WHERE notation.id_etudiant IS NULL;


-- 9 - Identifier les enseignants qui ont à la fois rédigé et corrigé la même épreuve :
SELECT Professeurs.nom
FROM Professeurs
JOIN corrige ON Professeurs.matricule = corrige.matricule
JOIN Redige ON Professeurs.matricule = Redige.matricule
WHERE corrige.id_epreuve = Redige.id_epreuve;


-- 10 - Montrer le dernier examen que chaque élève a passé, avec la date et la note :
SELECT Etudiant.nom_etudiant, Examens.nom_examen, notation.note_epreuve
FROM Etudiant
JOIN notation ON Etudiant.id_etudiant = notation.id_etudiant
JOIN Examens ON Etudiant.id_examen = Examens.id_examen
WHERE notation.note_epreuve IS NOT NULL
ORDER BY Etudiant.id_etudiant, Examens.id_examen DESC
LIMIT 1;




