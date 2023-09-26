import { User } from "./interfaces/user.js";
import { Admin } from "./interfaces/admin.js";

type Personne = string | number ;

let toto : User = {
    nom: "Toto Dupont",
    age: 35,
    occupation: "Facteur",
}

let Jeanne : Admin = {
    nom: "Jeanne Doe",
    age: 25,
    role: "Admin",
}

let Michel : User = {
    nom: "Michel Michel",
    age: 23,
    occupation: "Lutteur",
}

let Michael : User = {
    nom: "Michael Flinch",
    age: 64,
    occupation: "Gérant",
}

let monTableau: Personne[] =[]

monTableau.push(toto,Jeanne,Michel,Michael)
console.table(monTableau);