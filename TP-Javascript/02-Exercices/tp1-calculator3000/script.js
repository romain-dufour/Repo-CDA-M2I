


// fonction pour evaluer le chiffre et renvoyer la sortie

// function calculer() {
//   let a = document.getElementById("output").value
//   let b = eval(a)
//   document.getElementById("score").value = b
// }

// //fonction pour afficher la valeur
// function afficher(val) {
//   document.getElementById("output").value += val
// }

// //fonction pour effacer l'ecran
// function effacer() {
//   document.getElementById("output").value = ""
// }

// //fonction pour afficher la valeur tapée au clavier
// function afficherClavier(event) {
//   document.getElementById("output").event.key
//   console.log(event);
// }

// window.addEventListener(
//     "keydown",
//     function (event) {
//       let str =
//         "KeyboardEvent: key='" + event.key + "' | code='" + event.code + "'";
//       let el = document.createElement("span");
//       el.innerHTML = str + "<br/>";

//       document.getElementById("output").appendChild(el);
//     },
//     true,
//   );


document.addEventListener('keydown', function (event) {

})


const touches = [...document.querySelectorAll('.bouton')];
const listKeyCode = touches.map(touche => touche.dataset.key);
const ecran1 = document.querySelector('.ecran1');
const ecran2 = document.querySelector('.ecran2')

document.addEventListener('keydown', (e) => {
  const valeur = e.keyCode.toString;
  calculer(valeur)
})

document.addEventListener('click', (e) => {
  const valeur = e.target.dataset.key
  calculer(valeur)

})


// const afficher = (valeur) => {
//   if (listKeyCode.includes(valeur)) {
//     switch (valeur) {
//       case '8':
//         ecran.textContent = "";
//         break;
//       case '13':
//         const calcul = eval(ecran.textContent);
//         ecran.textContent = calcul;
//         break;
//       default:
//         const indexKeycode = listKeyCode.indexOf(valeur);
//         const touche = touches[indexKeycode];
//         ecran.textContent += touche.innerHTML;
//     }
//   }
// }

const calculer = (valeur) => {
  if (listKeyCode.includes(valeur)) {
    switch (valeur) {
      case '8':
        ecran1.textContent = "";
        ecran2.textContent = ""
        break;
      case '13':
        const calcul = eval(ecran1.textContent);
        ecran2.textContent = calcul;
        ecran2.textContent = calcul.innerHTML;
        break;
      default:
        const indexKeycode = listKeyCode.indexOf(valeur);
        const touche = touches[indexKeycode];
        ecran1.textContent += touche.innerHTML;
    }
  }
}