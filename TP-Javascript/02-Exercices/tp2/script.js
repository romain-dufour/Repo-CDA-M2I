
// constantes et variables

const coup = document.querySelector(".nbrDeCoup");
const reponse = document.querySelector(".reponse");
const texteInput = document.querySelector(".saisi")
const nbrMax = 50;
const entrer = document.querySelector(".valider")
const rejouer = document.querySelector(".rejouer")
// const nombreEntre = document.querySelector(".saisi")

let saisieUtilisateur = 0
let nombreAleatoire = 0
let compteur = 0


//générer un nombre entre 1 et 50 inclus

nombreAleatoire = Math.floor(Math.random() * nbrMax)

console.log(nombreAleatoire);



//créer alerte (+ petit ou + grand) quand clic sur valider ou Enter
// ecouter evenement clic
// const 
// valider.addEventListener("click",)


coup.innerHTML = `Nombre de coups : ${compteur}`

function nombreSaisi() {
    saisieUtilisateur = document.querySelector(".saisi").value
    console.log(saisieUtilisateur);
    if (compteur < 4) {
        switch (true) {

            case saisieUtilisateur > nombreAleatoire:
                compteur++
                reponse.innerHTML = `${saisieUtilisateur} est plus grand que le nombre mystère`
                coup.innerHTML = `Nombre de coups : ${compteur}`
                break;
            case saisieUtilisateur < nombreAleatoire:
                compteur++
                reponse.innerHTML = `${saisieUtilisateur} est plus petit que le nombre mystère`
                coup.innerHTML = `Nombre de coups : ${compteur}`
                break;
            case saisieUtilisateur == nombreAleatoire:
                compteur++
                reponse.innerHTML = `Vous avez trouvé le nombre mystère`
                coup.innerHTML = `Nombre de coups : ${compteur}`
                break;
        }
    }
    else {
        coup.innerHTML = `Nombre de tentatives épuisées`
        reponse.innerHTML = `Vous avez perdu`

    }
}

document.addEventListener("keydown", (event)=>{
    if(event.key == 'Enter'){
        nombreSaisi()
    }
}
)

// cliquer sur rejouer relance la partie 

function replay() {
compteur = 0
coup.innerHTML = `Nombre de coups : ${compteur}`
reponse.innerHTML = ``
nombreAleatoire = Math.floor(Math.random() * nbrMax)
console.log(nombreAleatoire);
}




