const result = document.querySelector(".result");

let nbHabitant=96809,anneeInitiale=2015, nbHabitantHabitantFinal,nbAnnees = 0, tauxAccroisement = 0.89, affichage  ="";

affichage = `En 2015, il a été recensé ${nbHabitant} habitants, la taux d'accroissement de la population étant de ${tauxAccroisement}%. Combien faudra-t-il d'années pour atteindre une population de 120000 habitants?`


while(nbHabitant<120000){
    nbHabitant+=nbHabitant*(tauxAccroisement/100);
    anneeInitiale=anneeInitiale+1;
    
    affichage+=`<br>En ${anneeInitiale}, il y aura ${Math.round(nbHabitant)} habitants`;
    nbAnnees=nbAnnees+1
}
affichage += `<br> Avec un taux d'accroissement de la population de 0.89%, en ${anneeInitiale}, il y aura ${nbHabitant} dans la ville de Tourcoing, il aura fallu ${nbAnnees} années`
result.innerHTML = affichage
// Math.round(nbHabitantInitial)=(nbHabitantInitial*tauxAccroisement/100)+nbHabitantInitial
// console.log(nbHabitantInitial);



