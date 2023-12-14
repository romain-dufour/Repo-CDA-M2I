USE classicmodels;

SELECT * FROM employees;
SELECT * FROM offices;
SELECT * FROM customers;
SELECT * FROM payments;
SELECT * FROM orders;
SELECT * FROM products;
SELECT * FROM productlines;
SELECT * FROM orderdetails;


-- question 1
-- Afficher les noms, prénoms et titres de l’ensemble des employées en les ordonnant par leurs noms de famille.

SELECT lastName,firstName,jobTitle FROM employees ORDER BY lastName;

-- question 2
-- Afficher les noms des employées en supprimant les doublons. 

SELECT DISTINCT lastname FROM employees  ;

-- question 3
-- Sélectionner et afficher le nom de la société, le prénom et le nom du contact des clients qui habitent aux USA.

SELECT customerName, contactLastName, contactFirstName 
FROM customers 
WHERE country = 'USA';

-- question 4
-- Sélectionner les emails des employées qui ont un firstname qui se termine par 'y' et qui ont un reportsTo qui commence par '105'.

SELECT email FROM employees 
WHERE firstName LIKE '%y' AND reportsTo LIKE '105%';

-- question 5
-- - Sélectionner les noms et emails des employees qui ont un firstname qui commence par un L.

SELECT lastName, email FROM employees 
WHERE firstName LIKE 'l%';

-- question 6
-- Trier la table customers par ordre alphabétique à partir du contactLastName

SELECT * FROM customers 
ORDER BY contactLastName;

-- question 7
-- Trier la table employées par ordre croissant en se basant officeCode
SELECT * FROM employees
ORDER BY officeCode;


-- question 8
-- Sélectionner les clients qui ont payé pour plus de 100000 euros.
SELECT DISTINCT (SELECT customerName FROM customers WHERE customerNumber = pay.customerNumber) 
FROM payments AS pay
WHERE amount > 100000
;

SELECT customerName, SUM(amount) AS total_paiements
FROM customers
INNER JOIN payments ON customers.customerNumber = payments.customerNumber
GROUP BY customerName
HAVING total_paiements > 100000;

-- question 9
-- Afficher le total des ventes par 'orderNumber' et 'status' ?

SELECT T1.orderNumber,status, SUM(quantityOrdered * priceEach) AS total
FROM orders AS T1
INNER JOIN orderdetails AS T2 ON T1.orderNumber = T2.orderNumber
GROUP BY orderNumber ,status;

-- question 10
-- Afficher les “orderNumber”, “productName”, “msrp”, “priceEach” des produits qui un productcode = ‘S10_1678’ ont un msrp supérieur au priceEach.

SELECT orderNumber, productName, msrp, priceEach
FROM products  
INNER JOIN orderdetails ON products.productCode = orderdetails.productCode 
WHERE products.productCode = 'S10_1678'
AND msrp > priceEach;

-- question 11
-- Sélectionner les emails des employées qui ont un firstname qui se termine par 'y' ou qui appartiennent à au bureau de San Francisco.

SELECT email, city
FROM employees
INNER JOIN offices ON employees.officeCode = offices.officeCode
WHERE city = 'San Francisco'
OR firstName LIKE '%y';


-- autre solution

SELECT email FROM employees WHERE firstName LIKE'%y' OR officeCode = (SELECT officeCode FROM offices WHERE city = 'San Francisco');

-- question 12
-- Donner le nombre de client qui sont gérés par Leslie Jennings.

SELECT  firstName, lastName,COUNT(salesRepEmployeeNumber) AS  nombreClients
FROM employees
INNER JOIN customers ON customers.salesRepEmployeeNumber = employees.employeeNumber
GROUP BY firstName, lastName,employeeNumber,salesRepEmployeeNumber
HAVING firstName LIKE 'Leslie' AND lastName = 'Jennings';

-- question 13
-- Afficher le nom et prénom de la personne qui a le jobTitle de Président

SELECT firstName, lastName
FROM employees
WHERE jobTitle = 'President';

-- question 14
-- Donner la somme des montants des paiements reçu pendant le mois de Mars 2005.

SELECT SUM(amount) AS sommePaiement
FROM payments
WHERE paymentDate LIKE '2005-03%';

-- question 15
-- Afficher le total des paiements par nom des clients.

SELECT customerName, SUM(amount) AS sommePaiement
FROM customers
INNER JOIN payments ON customers.customerNumber = payments.customerNumber
GROUP BY customerName;


-- question 16
-- Afficher la date de commande et le numéro client des commandes annulées

SELECT orderDate, customerNumber
FROM orders
WHERE status = 'Cancelled';

-- question 17
-- Afficher la liste (prénom et nom ) des subordonnées de Bow Anthony

SELECT lastName, firstName
FROM employees
WHERE reportsTo =
(SELECT employeeNumber
FROM employees
WHERE firstName='Anthony' AND lastName = 'Bow');


-- question 18
-- Afficher le nom et le prénom du ou des employés qui n'ont pas de supérieur hiérarchique.
SELECT firstName, lastName 
FROM employees 
WHERE reportsTo IS NULL ;


-- question 19
-- Dans le detail des commandes afficher la commande avec la plus petite quantité.
SELECT * 
FROM orders
INNER JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber
ORDER BY orderdetails.quantityOrdered LIMIT 1;


SELECT * 
FROM orderdetails
WHERE quantityOrdered = (
SELECT MIN(quantityOrdered) 
FROM orderdetails);


-- question 20
-- Afficher le detail de la commande qui est datée du 21-04-2003

SELECT *
FROM orderdetails
INNER JOIN orders ON orderdetails.orderNumber = orders.orderNumber
WHERE orders.orderDate LIKE '2003-04-21%';


-- question 21
-- Afficher la liste des managers avec les employées qu’ils managent. Le nom de la colonne s’appellera ‘Manager’ pour la colonne des managers, elle
-- regroupera leurs noms et prénoms. Idem pour la colonne employée, elle s’appellera ‘Employée’, elle affichera le nom et prénom des employés.

SELECT CONCAT(EMP1.lastName,' ',EMP1.firstName) AS Manager , CONCAT(EMP2.lastName,' ',EMP2.firstName) AS Employee
from employees AS EMP1
INNER JOIN employees AS EMP2 ON EMP1.employeeNumber = EMP2.reportsTo
WHERE EMP2.reportsTo= EMP1.employeeNumber ;

-- question 22
-- Afficher le nom des managers et le nombre d’employé qu’ils managent.

SELECT EMP1.lastName AS MANAGER, COUNT(EMP2.employeeNumber) AS Nombre_Subordonnees
FROM employees AS  EMP1
INNER JOIN employees AS EMP2 ON EMP1.employeeNumber = EMP2.reportsTo
GROUP BY MANAGER,EMP1.employeeNumber
