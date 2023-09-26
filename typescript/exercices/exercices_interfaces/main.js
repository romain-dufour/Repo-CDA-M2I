"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let toto = {
    nom: "Toto Dupont",
    age: 35,
    occupation: "Facteur",
};
let Jeanne = {
    nom: "Jeanne Doe",
    age: 25,
    role: "Admin",
};
let Michel = {
    nom: "Michel Michel",
    age: 23,
    occupation: "Lutteur",
};
let Michael = {
    nom: "Michael Flinch",
    age: 64,
    occupation: "Gérant",
};
let monTableau = [];
monTableau.push(toto, Jeanne, Michel, Michael);
console.table(monTableau);
