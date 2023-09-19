const result = document.querySelector(".result");

let netImposable = 0, nbrEnfants = 0, nbrAdulte = 0, part = 0 , fractionImposable = 0, montantImpot = 0

netImposable = Number(prompt("Quel est le montant Net imposable ?"))
nbrEnfants = Number(prompt("Combien d'enfants ?"))
nbrAdulte = Number(prompt("Combien d'adultes ?"))


if (nbrEnfants >=3) {
    part = nbrAdulte + 1 + (nbrEnfants- 2)
} else {
    part = nbrAdulte + (nbrEnfants / 2)
}

fractionImposable = netImposable / part

if ( fractionImposable <10778) {
    montantImpot = 0
} else if (fractionImposable >= 10778 && fractionImposable < 27479){
    montantImpot= (((fractionImposable - 10778) * 11 / 100) * part)
} else if (fractionImposable >= 27479 && fractionImposable < 78571){
    montantImpot= ((fractionImposable - 27479) * 30 / 100) * part
} else if (fractionImposable >= 78571 && fractionImposable < 168995){
    montantImpot= ((fractionImposable - 78571) * 41 / 100) * part
} else if (fractionImposable >= 168995){
    montantImpot= ((fractionImposable - 168995) * 45 / 100) * part
}
console.log(fractionImposable);
console.log(part);
console.log(netImposable);
montantImpot = Math.round(montantImpot)
result.innerHTML = `Le montant de l'impot sur le revenu pour un foyer composé de ${nbrAdulte} adulte(s) et de ${nbrEnfants} enfant(s), avec un revenu fiscal de ${netImposable}€ s'élève à : ${montantImpot}€.`