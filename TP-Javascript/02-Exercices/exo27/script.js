const result = document.querySelector(".result");
let affichage = "";

let etudiants = [
    {
        prenom:"José",
        nom:"Garcia",
        matières:{
            français:16,
            anglais:7,
            humour:14
        }
    },
    {
        prenom:"Antoine",
        nom:"De Caunes",
        matières:{
            français:15,
            anglais:6,
            humour:16,
            informatique:4,
            sport:10
    }
   
}
]


for (let element of etudiants) {

    affichage += element[1,1]
}

// etudiants.forEach(etudiants => {
//     for (let key in etudiants){
//         affichage+=etudiants[1]
//     }
// })

// let numbers = [1,2,3,4,5,6,7,]
// numbers.forEach(number => {
//     affichage+=number;

// })


result.innerHTML=affichage
// etudiants.forEach(number => {
//     for (let key in matières){
//         console.log(key + ":" + matières[key] + "/20");
//     };
// })

// let fruit = {
//     nom: "banane",
//     prix : 1.05,
//     couleur: "jaune"
// }

// for (let key in fruit) {
//     console.log(key + " : " + fruit[key]);
    
// }

// for (let appellation in etudiants){
//     console.log(`${prenom} + ${nom}`);
// }


// let matières = {
//     nom: "banane",
//     prix : 1.05,
//     couleur: "jaune"
// }
// for (let key in matières) {
//     console.log(key + " : " + matières[key]);
    
// }


// etudiants.forEach(etudiant => {
//     console.log(prenom + " " + nom);
// })



// let fruit = {
//     nom: "banane",
//     prix : 1.05,
//     couleur: "jaune"
// }

// for (let key in fruit) {
//     console.log(key + " : " + fruit[key]);
    
// }