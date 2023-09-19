const result = document.querySelector(".result");

let noteSaisie=0,affichage="", meilleurNote=0, moinsBonneNote=20 , moyenne=0

noteSaisie=Number(prompt("Veuillez saisir une note \nPour ne plus saisir de note, tapez 777"))

affichage=`<div>La série contiend les notes suivantes :</div>`

let i=0
while(noteSaisie!=777){
affichage += `<li> En note ${i+1}, vous avez saisi ${noteSaisie}/20</li>`
i++
if(noteSaisie==777){
    break
}
if(noteSaisie>meilleurNote){
    meilleurNote=noteSaisie
}
if(moinsBonneNote>noteSaisie){
    moinsBonneNote=noteSaisie
}
moyenne=moyenne+noteSaisie
noteSaisie=Number(prompt("Veuillez saisir une note \nPour ne plus saisir de note, tapez 777"))

}
moyenne=(moyenne/i)
affichage+= `<div>Sur l'ensemble de ${i} notes :</div>`
affichage+=`<li> La meilleur note est de ${meilleurNote}/20</li>`
affichage+=`<li> La moins bonne note est de ${moinsBonneNote}/20</li>`
affichage+=`<li> La moyenne des notes est de ${moyenne.toFixed(2)}/20</li>`
result.innerHTML=affichage