/*
    Les tableaux numériques (On accède aux élémtens via l'index)
*/

// Déclaration d'un tableau
let monTableau = []
// let monTableau = new Array() <---- equivalent

monTableau[0] = "Pomme" // Affectation d'une valeur à l'index 0 du tableau
monTableau[1] = "Poire" // Affectation d'une valeau à l'index 1 du tableau

console.log(monTableau);
console.table(monTableau);
console.log(monTableau[1]);

let legumes = ["Carottes", "Choux", "Haricots"];
console.log(legumes[2]);
legumes[2] = "Epinards";
console.log(legumes[2]);

let nbLegumes = legumes.length
console.log(`Mon tableau contient ${nbLegumes} légumes`);

// Insertion dans le dernier index ----> equivalent au legume.push("Haricots")
legumes[legumes.length] = "Haricots";
console.table(legumes);

// Retirer le dernier élément d'un tableau
legumes.pop()

// Retirer le premier élément d'un tableau
legumes.shift()

console.table(legumes);
