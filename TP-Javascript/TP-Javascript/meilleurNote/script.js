const result = document.querySelector(".result");

let i=1, noteSaisie =0, meilleurNote = 0, moinsBonneNote = 20,somme=0, moyenne = 0, affichage =""

noteSaisie = Number(prompt("Veuillez saisir la note " + i + "\nPour ne plus saisir de note, rentrez une note infèrieure à 0 ou supérieure à 20"));

while(noteSaisie >= 0 && noteSaisie <= 20){
    somme = somme + noteSaisie
    
    if(noteSaisie > meilleurNote){
            meilleurNote = noteSaisie
        }
    
    if(noteSaisie < moinsBonneNote) {
            moinsBonneNote = noteSaisie
        }

    affichage += `En note ${i}, vous avez saisi ${noteSaisie}/20<br>`
    i++
    noteSaisie = Number(prompt("Veuillez saisir la note " + i + "\nPour ne plus saisir de note, rentrez une note infèrieure à 0 ou supérieure à 20"));
}

moyenne = somme/(i-1)
affichage += `Sur l'ensemble des ${i-1} notes : <br>
                <li>La meilleure note est de ${meilleurNote}/20<br>
                <li>La moins bonne note est de ${moinsBonneNote}/20<br>
                <li>La moyenne des notes est de ${moyenne}/20`

result.innerHTML = affichage


