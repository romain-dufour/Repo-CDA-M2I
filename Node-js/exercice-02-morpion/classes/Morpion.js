import readline from "readline";

// vérifier si la partie est gagnée

//affichage début du jeu

export function grilleDepart(tableau){


}

// gestion de la grille

export function displayGrid (tableau) {

    for(let i = 0; i < tableau.length; i++){
        let affichage = ""
        for (let j=0; j < tableau[i].length; j++){
            if(tableau[i][j]===0) affichage +="| |";
            else if(tableau[i][j]===1) affichage +="|X|";
            else if(tableau[i][j]===2) affichage += "|O|"
            }
            console.log(affichage);
    }

}


// jouer (test si la colonne est déja remplie,...)




