-- Créer un utilisateur

CREATE USER 'toto'@'localhost' IDENTIFIED BY 'test';
CREATE USER 'titi'@'localhost' IDENTIFIED BY '1234';

-- donner tous les droits
GRANT ALL PRIVILEGES ON *.* TO 'toto'@'localhost';

-- voir les privileges
SHOW GRANTS;

-- donner tous les droits sur une base spécifique
GRANT ALL PRIVILEGES ON entreprise_demo.* TO 'titi'@'localhost';

-- donner les droits en lecture sur une BDD
GRANT SELECT ON exercice_1.adresse TO 'titi'@'localhost';
GRANT INSERT, DELETE ON exercice_1.personne TO 'titi'@'localhost';

-- Donne l'acces a la colonne nom et prenom de personne
GRANT SELECT (nom, prenom) ON exercice_1.personne TO 'titi'@'localhost';


-- Recharger la table des droits
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'titi'@'localhost';