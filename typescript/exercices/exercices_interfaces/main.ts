import { User } from "./interfaces/user.js";
import { Admin } from "./interfaces/admin.js";

type Personne = User | Admin;

// let toto: User = {
//     nom: "Toto Dupont",
//     age: 35,
//     occupation: "Facteur",
// }

// let Jeanne: Admin = {
//     nom: "Jeanne Doe",
//     age: 25,
//     role: "Admin",
// }

// let Michel: User = {
//     nom: "Michel Michel",
//     age: 23,
//     occupation: "Lutteur",
// }

// let Michael: User = {
//     nom: "Michael Flinch",
//     age: 64,
//     occupation: "Gérant",
// }

// let monTableau: Personne[] = []
// console.table(Jeanne);
// monTableau.push(toto, Jeanne, Michel, Michael)

let monTableau: Personne[] = [
    {
        nom: "Toto Dupont",
        age: 35,
        occupation: "Facteur",
    },

    {
        nom: "Jeanne Doe",
        age: 25,
        role: "Admin",
    },

    {
        nom: "Michel Michel",
        age: 23,
        occupation: "Lutteur",
    },

    {
        nom: "Michael Flinch",
        age: 64,
        occupation: "Gérant",
    }

]

console.table(monTableau);


monTableau.forEach(personne => console.log(`${personne.nom} ${personne.age}`));

//bonus
monTableau.forEach(personne => {
    let bonus = ("occupation" in personne) ? "Son occupation est :" + personne.occupation : "son role est : " + personne.role
    console.log(bonus);
    });