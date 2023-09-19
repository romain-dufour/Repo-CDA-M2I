// const result = document.querySelector(".result");
// const calcul = document.querySelector(".calcul");
// let affichage = 0
// let resultat = 0
// let reset = 0


// // document.addEventListener("click","keydown", (event)=>{
// //     if(event.key == 'Enter'){
// //         calcul.addEventListener
// //     }
// // }

// //     let valeur = event.target.dataset.key
// //     affichage=valeur
// //     calcul=valeur
// //     result.innerHTML+=affichage
// //     calcul.innerHTML+=affichage
// // }
    
// // )

// document.addEventListener("click", (event)=>{
//     let valeur = event.target.dataset.key
//     if(valeur== C ) {
//         affichage = C
//     }
//     affichage=valeur
//     resultat = 
//     result.innerHTML+=`${affichage}`
//     calcul.innerHTML+=`${affichage}`
// }
// )


// fonction pour evaluer le chiffre et renvoyer la sortie

function calculer(){
    let a = document.getElementById("output").value 
    let b = eval(a)
    document.getElementById("score").value = b
}

//fonction pour afficher la valeur
function afficher(val) {
    document.getElementById("output").value+=val
}

//fonction pour effacer l'ecran
function effacer(){
    document.getElementById("output").value=""
}

//fonction pour afficher la valeur tapée au clavier
 function afficherClavier(event){
    document.getElementById("output").event.key
    console.log(event);
 }

window.addEventListener(
    "keydown",
    function (event) {
      let str =
        "KeyboardEvent: key='" + event.key + "' | code='" + event.code + "'";
      let el = document.createElement("span");
      el.innerHTML = str + "<br/>";
  
      document.getElementById("output").appendChild(el);
    },
    true,
  );