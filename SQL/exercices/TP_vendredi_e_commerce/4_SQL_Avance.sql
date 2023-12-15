USE tabletoptreasures_database;


-- Étape 4 : Requêtes SQL avancées
-- 1. Sélectionnez les noms des clients, noms de jeux et date de commande pour chaque commande passée.
SELECT c.nom , cmd.Date_de_commande
FROM Clients AS c
INNER JOIN Commandes AS cmd ON c.Clients_id = cmd.ID_Client;


-- pas de lien entre les tables client/commande et le nom des jeux commandés 
-- comment rajouter le 




-- 2. Sélectionnez les noms des clients et le montant total dépensé par chaque client. 
-- Triez les résultats par montant total décroissant.

SELECT c.nom , SUM(Prix)
FROM Clients c
INNER JOIN Commandes cmd ON c.Clients_id = cmd.ID_Client
INNER JOIN Jeux j ON j.Jeux_id = cmd.
GROUP BY c.nom




-- 3. Sélectionnez les noms des jeux, noms de catégories et prix de chaque jeu.
-- 4. Sélectionnez les noms des clients, date de commande et noms de jeux pour toutes les commandes passées.
-- 5. Sélectionnez les noms des clients, nombre total de commandes par client et montant total dépensé par client. Incluez uniquement les clients ayant effectué au moins une commande.