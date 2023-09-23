import { Eleve } from "./classes/eleve.js";
import { Matiere } from "./classes/matiere.js";
import { Note } from "./classes/note.js";

const nomEleve = document.querySelector("#nomEleve");
const prenomEleve = document.querySelector("#prenomEleve");
const btnAjoutEleve = document.querySelector(".btnAjoutEleve");
const intituleMatiere = document.querySelector("#intituleMatiere");
const btnAjouterMatiere = document.querySelector(".btnAjouterMatiere");
const selectEleve = document.querySelector("#selectEleve");
const ajouterNote = document.querySelector("#ajouterNote");
const selectMatiere = document.querySelector("#selectMatiere");
const btnAjouterNote = document.querySelector(".btnAjouterNote");
// const selectListeEleve = document.querySelector("#selectListeEleve");
// const selectListeMatiere = document.querySelector("#selectListeMatiere");
const ajoutTableNom = document.querySelector("#ajoutTableNom");
const ajoutTablePrenom = document.querySelector("#ajoutTablePrenom");
const ajoutTableMatiere = document.querySelector("#ajoutTableMatiere");
const ajoutTableNote = document.querySelector("#ajoutTableNote");
const tableau = document.querySelector(".tableau");
const selectListeEleve = document.querySelector(".selectListeEleve");
const selectListeMatiere = document.querySelector(".selectListeMatiere");


// let eleve1 = new Eleve("Martin", "John")
// let eleve2 = new Eleve("Dupont", "michelle")
// let eleve3 = new Eleve("Dufour", "Romain")


// console.log(eleve1);
// console.log(eleve2);
// console.log(eleve3);

// console.log(eleve1.nom);

let listEleve = [];
// listEleve.push(eleve1)
// listEleve.push(eleve2)
// listEleve.push(eleve3)

// console.table(listEleve);

// Ajout des des 3 new eleve créés

listEleve.forEach(element => {
    tableau.innerHTML += `
<tr>
    <td>${element.nom}</td>
    <td>${element.prenom}</td>
</tr>`
});

// fonction pour afficher l'eleve ajoutee dans les choix de selection d'eleve
function ajoutEleveListe() {
    selectListeEleve.innerHTML += `
    <option value ="${nomEleve.value}+" " + ${prenomEleve.value}">${nomEleve.value} ${prenomEleve.value}</option>
    `
    selectEleve.innerHTML += `
    <option value ="${nomEleve.value}+" " + ${prenomEleve.value}">${nomEleve.value} ${prenomEleve.value}</option>
    `
}

// fonction pour afficher la matiere ajoutee dans les choix de selection de matiere
function ajoutMatiere() {
    selectMatiere.innerHTML += `
    <option value ="${intituleMatiere.value}">${intituleMatiere.value}</option>
    `
    selectListeMatiere.innerHTML += `
    <option value ="${intituleMatiere.value}">${intituleMatiere.value}</option>
    `
}

// ajout elements de chaque eleve ajoute dans un tableau au clique sur ajouter
btnAjoutEleve.addEventListener("click", () => {
    // console.log(nomEleve.value);
    // console.log(prenomEleve.value);
    let newEleve = new Eleve(nomEleve.value, prenomEleve.value)
    listEleve.push(newEleve)
    console.table(listEleve);
    // ajoutTableau()
    ajoutEleveListe()
}
)

btnAjouterMatiere.addEventListener("click", () => {
    // console.log("ajout matiere");
    let newMatiere = new Matiere(intituleMatiere.value)
    ajoutMatiere(newMatiere)
})


// ajouter dans le tableau l'eleve, la matiere et la note
let tableauEleve = []

btnAjouterNote.addEventListener("click", () => {
    // console.log("ajout note");
    let newNote = new Note(ajouterNote.value)
    let choixEleve = selectEleve.value;
    console.log(choixEleve);
    // console.log(newNote);

    // listEleve.push(selectEleveNewNote)
    console.log(choixEleve.nom);
    ajoutTableau()
})
console.table(listEleve);


//fonction pour ajouter nom et prenom d'un nouvel eleve dans le tableau
function ajoutTableau() {
    tableau.innerHTML += `
                <tr>
                    <td>${nomEleve.value}</td>
                    <td>${prenomEleve.value}</td>
                    <td>${intituleMatiere.value}</td>
                    <td>${ajouterNote.value}</td>

                </tr>`
};