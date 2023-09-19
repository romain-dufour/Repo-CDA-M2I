const result = document.querySelector(".result");

let capitalDepart = 0, tauxInteret=0, dureeEpargne = 0, montantInteret=0, capitalFinal =0

capitalDepart = Number(prompt("Veuillez indiquer votre capital de départ en euros :"));
tauxInteret = Number(prompt("Veuillez indiquer le taux d'intérêt en pourcentage :"));
dureeEpargne = Number(prompt("Veuillez indiquer la durée de votre placement en année :"));

montantInteret=Math.round((capitalDepart*Math.pow(1+(tauxInteret/100),dureeEpargne))-capitalDepart);
capitalFinal = capitalDepart + montantInteret;

result.innerHTML =`Avec un capital initial de ${capitalDepart}€, placé à ${tauxInteret}% pendant  ${dureeEpargne}année(s),<br><li>Le montant total des intérêts s'élèvera à ${montantInteret}€<br><li>Le capital final à l'issue sera de ${capitalFinal}€`