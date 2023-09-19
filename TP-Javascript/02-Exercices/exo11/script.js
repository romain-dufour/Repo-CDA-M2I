const result = document.querySelector(".result");

let lettreSaisie =""

lettreSaisie = prompt("Veuillez saisir une lettre");
lettreSaisie =lettreSaisie.toLowerCase

if(lettreSaisie === "a" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else if (lettreSaisie === "e" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else if (lettreSaisie === "i" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else if (lettreSaisie === "o" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else if (lettreSaisie === "u" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else if (lettreSaisie === "y" ){
    result.innerHTML = `La lettre ${lettreSaisie} est une voyelle`
} else (
    result.innerHTML = `La lettre ${lettreSaisie} est une consonne`
)
