/* 
    Les tableaux à 2 dimensions
*/ 

console.log("--------------------------- Les tableaux à 2 dimentsions --------------------------" );

// Déclaration de deux tableaux numériques

let legumes =  ["Carottes", "Choux", "Haricots"]
let fruit = ["Raisin", "Bananes", "Abricots"]

// Création d'un tableau à 2 dimensions
let primeur =[legumes, fruit]
console.table(primeur);

console.log(primeur[0][1]);
console.log(primeur[1][2]);

// Avec tableaux associatifs
let zoo = [
    {
        pseudo:"Simba",
        espece:"Lion",
        continent:"Afrique"
    },
    {
        pseudo:"Jack",
        espece:"Kangourou",
        continent:"Oceanie"
    }
]
console.table(zoo);
console.log(`Les pseudos sont :${zoo[0].pseudo} et ${zoo[1].pseudo}`);
