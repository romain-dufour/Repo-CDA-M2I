const result = document.querySelector(".result");

let poids = 0, taille = 0, affichage = ""

poids = Number(prompt("Veuillez rentrer votre poids"))
taille = Number(prompt("Veuillez rentrer votre taille"))

if ((taille >= 169 && taille < 183 && poids >= 48 && poids <= 53) 
|| (taille >= 166 && taille < 178 && poids >= 54 && poids <= 59) 
|| (taille >= 163 && taille < 175 && poids >= 60 && poids <= 65) 
|| (taille >= 160 && taille < 172 && poids >= 66 && poids <= 71)) {
    affichage = `Pour ${taille}cm et ${poids}kg : <br><li>Prenez la taille 2`
} else if ((taille >= 145 && taille < 172 && poids >= 43 && poids <= 65) ){
    affichage = `Pour ${taille}cm et ${poids}kg : <br><li>Prenez la taille 1`
} else if ((taille >= 163 && taille <= 183 && poids >= 54 && poids <= 77) ){    
    affichage = `Pour ${taille}cm et ${poids}kg : <br><li>Prenez la taille 3`
} else {
    affichage = "Nous n'avons pas votre taille"
}

result.innerHTML=affichage