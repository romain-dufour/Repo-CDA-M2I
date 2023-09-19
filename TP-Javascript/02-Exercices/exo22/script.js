const result = document.querySelector(".result");

let i=1, j=1, affichage = ""

for (i = 1; i < 4; i++) {
    affichage += `Chapitre ${i} <br>`
    for(j = 1; j < 4; j++) {
        affichage += `<li>- Partie ${i} . ${j} <br>`
    }
}

console.log(affichage);

result.innerHTML = affichage

// for (i = 0; i = 2; i++) {
//     console.log(i);
//     }

    // for (i==0; i==2; i++) {
    //     affichage += "partie 1" 
    // }

//     do {
//         affichage += `Chapitre ${i} \n`;
//         i++
//         do{affichage += `Partie ${i} . ${j} \n`;
//         j++}
//         while(j != 4)
//     }while (i != 4)
// console.log(affichage);