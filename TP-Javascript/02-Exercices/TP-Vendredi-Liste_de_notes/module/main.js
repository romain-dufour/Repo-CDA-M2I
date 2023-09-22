import { Eleve } from "./classes/eleve.js";

const nomEleve = document.querySelector("#nomEleve");
const prenomEleve = document.querySelector("#prenomEleve");
const ajoutEleve = document.querySelector(".btnAjoutEleve");
const intituleMatiere = document.querySelector("#intituleMatiere");
const ajouterMatiere = document.querySelector(".btnAjouterMatiere");
const selectEleve = document.querySelector("#selectEleve");
const ajouterNote = document.querySelector("#ajouterNote");
const selectMatiere = document.querySelector("#selectMatiere");
const btnAjouterNote = document.querySelector(".btnAjouterNote");
const selectListeEleve = document.querySelector("#selectListeEleve");
const selectListeMatiere = document.querySelector("#selectListeMatiere");



let eleve1 = new Eleve("Martin","John","Mathématiques",12)
let eleve2 = new Eleve("Dupont","michelle","Mathématiques",12)
let eleve3 = new Eleve("Dufour","Romain","Mathématiques",12)


console.log(eleve1);
console.log(eleve2);
console.log(eleve3);

console.log(eleve1.nom);

let listEleve = [];
listEleve.push(eleve1)
listEleve.push(eleve2)
listEleve.push(eleve3)

console.table(listEleve);

ajoutEleve.addEventListener("click", () => {
    console.log(nomEleve.value);
    console.log(prenomEleve.value);
    let newEleve = new Eleve (nomEleve.value, prenomEleve.value)
    console.log(newEleve);
    listEleve.push(newEleve)
    console.table(listEleve);
})


function ajoutListeEleve(){

}