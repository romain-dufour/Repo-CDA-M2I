/*
    Les tableaux associatif (on accède aux éléments via la clé)
*/

// Déclaration d'un tableau associatif
let personne = {
    nom:"Dufour",
    prenom:"Romain",
    age : 34
}

// Affichage de la valeur associée à une clé
console.log(personne.prenom);
console.log(personne["nom"]);

// Ajouter une clé et une valeur à notre tableau
personne["clé"] = "valeur"

console.table(personne);

