import { input } from "../tools.js";
import { displayGrid } from "./morpion.js";
import readline from "readline";


export class Ihm{
 constructor() {
    this.ligne1 = [" "," "," "];
    this.ligne2 = [" "," "," "];
    this.ligne3 = [" "," "," "];
 }

async menu() {

    let morpion = [
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]
    let affichageDepart = displayGrid(morpion)
    console.log(affichageDepart);
    console.log("Quelle position voulez vous?");

    // choixLigne = parseInt(readline.promises("Ligne :"))
    // choixColonne = parseInt(readline.promises("Colonne :"))

   let choixLigne = await input("Ligne :");
   let choixColonne = await input("Colonne :")

    morpion[choixLigne-1][choixColonne-1]=1
    console.log(affichageDepart);




}

}