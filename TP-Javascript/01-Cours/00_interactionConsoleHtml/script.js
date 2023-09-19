//commentaire sur une ligne
/*commentaire
    sur
        plusieurs
            lignes*/

let prenom = "Romain";
let age;
let resultat = "";

/* ou pour ne pas remettre let plusieurs fois, on peut mettre une virgule a la fin :
let prenom,
age,
resultat 
*/

/*
    les types de variables :
        - let -> Peut etre modifiée mais pas redéclarée
        - const -> Peut etre ni modifiée ni redéclarée
*/

const result =document.querySelector(".result"); //sert a aller chercher un element dans le html

prenom = prompt("Veuillez saisir votre prénom :");

// result.innerHTML = prenom;
result.innerHTML = `votre prenom : ${prenom}`;

// Affichage de la valeur dans la console.
console.log(prenom);

// alert("Hello World");

console.log(age);