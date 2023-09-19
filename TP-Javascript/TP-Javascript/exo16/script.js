const result = document.querySelector(".result");

let age = 0, anneeAnciennete = 0, salaire = 0, montantIndemnite = 0

age = Number(prompt("Veuillez saisir votre age :"));
anneeAnciennete = Number(prompt("Veuillez saisir votre ancienneté dans l'entreprise :"));
salaire = Number(prompt("Veuillez saisir votre salaire mensuel en euro :"))

if (anneeAnciennete >= 1 && anneeAnciennete <= 10) {
    montantIndemnite = salaire/2 * anneeAnciennete
} else if (anneeAnciennete > 10) {
    montantIndemnite = salaire * anneeAnciennete
}

if (age > 45 && age <= 49) {
    montantIndemnite = montantIndemnite + salaire * 2
} else if ( age >= 50) {
    montantIndemnite = montantIndemnite + salaire * 5
}

result.innerHTML = `Le montant de l'indemnité pour un salarié de ${age} et avec ${anneeAnciennete} années d'ancienneté s'élève à ${montantIndemnite}€`