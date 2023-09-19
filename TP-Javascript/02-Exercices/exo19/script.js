const result = document.querySelector(".result");

let taille, poids

poids = Number(prompt("Veuillez saisir votre poids en Kg"));
taille = Number(prompt("Veuillez saisir votre taille en cm"));


switch(true){
    case (poids >=48 && poids <= 53 && taille >=169 && taille <=178) || 
         (poids >=54 && poids <= 59 && taille >=166 && taille <=175) ||
         (poids >=60 && poids <= 65 && taille >=163 && taille <=172) ||
         (poids >=66 && poids <= 71 && taille >=160 && taille <=169):
        result.innerHTML = `Pour ${taille}cm et ${poids} <br><li>Prennez la taille 2`
        break
    case (poids >=43 && poids <= 65 && taille >=145 && taille <=169):
        result.innerHTML = `Pour ${taille}cm et ${poids} <br><li>Prennez la taille 1`
        break
    case (poids >=54 && poids <= 77 && taille >=163 && taille <=183):
        result.innerHTML = `Pour ${taille}cm et ${poids} <br><li>Prennez la taille 3`
        break
    default : 
        result.innerHTML = `Nous n'avons pas votre taille`
        break
}