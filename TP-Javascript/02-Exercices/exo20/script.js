const result = document.querySelector(".result");

let netImposable=0, nbadulte=0, nbenfant=0, montantImpot=0, part=0

netImposable= Number(prompt("Net imposable?"))
nbadulte= Number(prompt("nombre d'adulte?"))
nbenfant= Number(prompt("nombre d'enfant?"))

switch(true){
    case nbenfant>2 :
        part=nbadulte*1+2*0.5+(nbenfant-2)*1
    break
    default:
        part=nbadulte*1+nbenfant*0.5
    break
}


switch(true){
    case (netImposable/part)<=10777 :
        montantImpot = 0
        break
    case (netImposable/part)<=27478 :
        montantImpot = (((netImposable/part-10778)*11)/100)*part
        break
    case (netImposable/part)<=78570 :
        montantImpot = (((netImposable/part-27479)*30)/100)*part
        break
    case (netImposable/part)<=168994 :
        montantImpot = (((netImposable/part-78571)*41)/100)*part
        break
    default: 
        montantImpot = (((netImposable/part-168995)*45)/100)*part

}


console.log(part);
result.innerHTML=`Le montant de l'impot sur le revenu pour un foyer composé de ${nbadulte} adulte(s) et de ${nbenfant} enfant(s), avec un revenu fiscal de ${netImposable}€ s'élève à ${Math.round(montantImpot)}€`