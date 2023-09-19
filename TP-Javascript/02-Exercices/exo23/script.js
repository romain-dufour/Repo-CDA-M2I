const result = document.querySelector(".result");

let i=1, j=1, d=1,resultat ,affichage = ""

// for (i = 1; i < 11; i++) {
//     affichage += `Table de ${i} <br>`
//     for(j = 1; j < 11; j++) {
//         resultat = i*j
//         affichage += `<li> ${i} x ${j} = ${resultat} <br>`
//     }
// }
for (d=1; d<11; d++) {
    affichage+= "b"
    result.innerHTML = affichage
    for (i = 1; i < 11; i++) {
        affichage += `Table de ${i} <br>`
        for(j = 1; j < 11; j++) {
            resultat = i*j
            affichage += `<li> ${i} x ${j} = ${resultat} <br>`
        }
    }
}
// result.innerHTML = affichage
// for(i=1;i<11 ; i++) {
//    <div class='result'>
    


//     </div>
// }
// // result.innerHTML = affichage

// let id = "lead" ; // ID de ton div a cloner
// var copy = 5; // Nombre de copie à faire

// var elem = document.getElementById(id);
// for (let i=0;i<copy;i++) {
//     elem.parentNode.appendChild(elem.cloneNode("bonjour"));
// }