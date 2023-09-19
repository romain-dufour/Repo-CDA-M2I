const result =document.querySelector(".result");    
let nb1 = 0, nb2 = 0, resultat = 0;


nb1 = Number(prompt("Veuillez saisir un premier nombre:"));

nb2 = Number(prompt("Veuillez saisir second nombre :"));

resultat = (nb1 + nb2);



result.innerHTML = `<h3>Vous avez saisi ${nb1} <br>Vous avez saisi ${nb2}<br>La somme de ${nb1} + ${nb2} = ${resultat}`;



