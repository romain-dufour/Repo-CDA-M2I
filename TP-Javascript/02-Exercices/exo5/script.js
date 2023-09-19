const result = document.querySelector(".result");
let chaine = "",
affichage ="",
minuscule ="",
tableau =[],
traitement= ""

chaine = prompt("Veuillez saisir une phrase");

minuscule=chaine.toLowerCase()

tableau = minuscule.split('').join(',')

traitement= chaine.toLowerCase().split(' ').map(x=> x[0].toUpperCase()+x.slice(1)).join(" ")

result.innerHTML =`Vous avez saisi : ${chaine} 
<br>La chaine en minuscule : ${minuscule}
<br>Mise en tableau : ${tableau}
<br>La chaine après traitement : ${traitement}`
