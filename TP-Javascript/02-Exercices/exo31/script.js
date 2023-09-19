const result = document.querySelector(".result");


// Création d'un tableau à deux dimensions contenant trois personnes
let person = [
    ["Jean", "Dupont", 15],
    ["Pierre", "Durant", 15],
    ["Jean", "Martin", 17]
];

// Affichage de la concaténation du prénom et du nom de la deuxième personne
let deuxiemePersonne = person[1];
let prenomDeuxiemePersonne = deuxiemePersonne[0];
let nomDeuxiemePersonne = deuxiemePersonne[1];
let concatNomPrenom = prenomDeuxiemePersonne + " " + nomDeuxiemePersonne;
console.log("Concaténation du prénom et du nom de la deuxième personne : " + concatNomPrenom);



result.innerHTML = `La personne à la <strong>2eme position</strong> de l'annuaire est : <br>  <strong>${prenomDeuxiemePersonne} ${nomDeuxiemePersonne}</strong> `


let fruit = {
    nom: "banane",
    prix : 1.05,
    couleur: "jaune"
}

for (let key in fruit) {
    console.log(key + " : " + fruit[key]);
    
}


let personnes = [
    {
        prenom : "Jean",
        nom : "Dupont",
        age: 15
    },
    {
        prenom : "Pierre",
        nom : "Durant",
        age: 16
    },
    {
        prenom : "Jean",
        nom : "Martin",
        age: 17
    },
]
  

// for (let personne of personnes) {
//     console.log(personne);
   
// }

for (let propriete of personnes){
    result.innerHTML=
    <tr>
        <td>${propriete.prenom}</td>
        <td>${propriete.nom}</td>
        <td>${propriete.age}</td>
    </tr>
}

