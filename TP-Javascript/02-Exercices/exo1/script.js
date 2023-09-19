const result =document.querySelector(".result");
let prenom = "", nom = "", resultat = ""


prenom = prompt("Veuillez saisir votre prénom :");

nom = prompt("Veuillez saisir votre nom :");

resultat = prenom + " " + nom

console.log(`Vous avez saisi ${prenom}`);
console.log(`Vous avez saisi ${nom}`);

console.log(`Bonjour ${prenom} ${nom}`);



result.innerHTML = `<h3>vous avez saisi : ${prenom} <br> vous avez saisi : ${nom} <br> Bonjour ${resultat} `;



