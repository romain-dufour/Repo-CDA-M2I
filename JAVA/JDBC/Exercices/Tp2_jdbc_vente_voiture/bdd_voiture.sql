CREATE DATABASE IF NOT EXISTS bdd_voiture;
USE bdd_voiture;


CREATE TABLE IF NOT EXISTS voiture(
id_voiture INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
year YEAR,
horse_power INT,
price DOUBLE
);
DROP TABLE person;
CREATE TABLE IF NOT EXISTS person(
id_person INT PRIMARY KEY AUTO_INCREMENT,
last_name VARCHAR(50),
first_name VARCHAR(50),
age INT,
price DOUBLE
);

CREATE TABLE IF NOT EXISTS vente(
    id_vente INT PRIMARY KEY AUTO_INCREMENT,
    id_voiture INT,
    id_person INT,
    vente_date DATE,
    FOREIGN KEY (id_voiture) REFERENCES voiture(id_voiture),
    FOREIGN KEY (id_person) REFERENCES person(id_person)
);

INSERT INTO voiture (name, year, horse_power, price) VALUES
('Toyota Camry', 2023, 200, 35000),
('Honda Accord', 2022, 190, 32000),
('Ford Mustang', 2022, 450, 50000),
('Chevrolet Malibu', 2023, 180, 30000),
('Nissan Altima', 2021, 188, 33000),
('BMW 3 Series', 2022, 255, 45000),
('Mercedes-Benz C-Class', 2023, 241, 48000),
('Audi A4', 2022, 201, 42000),
('Hyundai Sonata', 2023, 191, 31000),
('Volkswagen Passat', 2022, 174, 34000);



INSERT INTO person (last_name, first_name, age, price) VALUES
('Martin', 'Sophie', 35, 60000),
('Dubois', 'Pierre', 28, 50000),
('Lefevre', 'Isabelle', 40, 70000),
('Thomas', 'Nicolas', 32, 55000),
('Leclerc', 'Céline', 45, 75000),
('Leroux', 'David', 29, 52000),
('Fournier', 'Marie', 37, 62000),
('Girard', 'Luc', 42, 68000),
('Fontaine', 'Caroline', 31, 53000),
('Roux', 'Alexandre', 39, 64000);


INSERT INTO vente (id_voiture, id_person, vente_date) VALUES
(1, 2, '2023-01-01'),
(3, 4, '2023-01-02'),
(5, 6, '2023-01-03'),
(7, 8, '2023-01-04'),
(9, 10, '2023-01-05'),
(2, 1, '2023-01-06'),
(4, 3, '2023-01-07'),
(6, 5, '2023-01-08'),
(8, 7, '2023-01-09'),
(10, 9, '2023-01-10');


INSERT INTO vente (id_voiture, id_person, vente_date) VALUES
(1, 3, '2023-02-01'),
(2, 4, '2023-02-02'),
(3, 5, '2023-02-03'),
(4, 6, '2023-02-04'),
(5, 7, '2023-02-05'),
(6, 8, '2023-02-06'),
(7, 9, '2023-02-07'),
(8, 10, '2023-02-08'),
(9, 1, '2023-02-09'),
(10, 2, '2023-02-10'),
(1, 4, '2023-02-11'),
(2, 5, '2023-02-12'),
(3, 6, '2023-02-13'),
(4, 7, '2023-02-14'),
(5, 8, '2023-02-15'),
(6, 9, '2023-02-16'),
(7, 10, '2023-02-17'),
(8, 1, '2023-02-18'),
(9, 2, '2023-02-19'),
(10, 3, '2023-02-20'),
(1, 5, '2023-02-21'),
(2, 6, '2023-02-22'),
(3, 7, '2023-02-23'),
(4, 8, '2023-02-24'),
(5, 9, '2023-02-25'),
(6, 10, '2023-02-26'),
(7, 1, '2023-02-27'),
(8, 2, '2023-02-28'),
(9, 3, '2023-02-28'),
(10, 4, '2023-03-01');


-- 1. Enregistrerlavoiture
INSERT INTO voiture (name, year, horse_power, price) VALUES (?, ?, ?, ?);

-- 2. Listertouteslesvoitures
SELECT * FROM voiture;

-- 3. Supprimerlavoiture
DELETE FROM voiture WHERE id_voiture = ?;

-- 4. Changerdevoiture
UPDATE voiture
SET
    name = ?,
    year = ?,
    horse_power = ?,
    price = ?
WHERE
    id_voiture = ?;

-- 5. Inscrireunepersonne
INSERT INTO person (last_name, first_name, age, price) VALUES (?,?,?,?);

-- 6. Listertouteslespersonnes
SELECT * FROM person;

-- 7. Supprimerlapersonne
DELETE FROM person WHERE id_personne = ?;

-- 8. Changerdepersonne
UPDATE person
SET
    last_name = ?,
    first_name = ?,
    age = ?,
    price = ?
WHERE
    id_person = ?;

-- 9. Fairelavente
INSERT INTO vente (id_voiture, id_person, vente_date) VALUES (?, ?, ?);

-- 10. Afficher les ventes de voiture
SELECT * FROM vente;

-- 11. Afficher la liste des ventes d’un véhicule pour une personne 
SELECT * FROM vente WHERE id_voiture = ? AND id_person = ?;

