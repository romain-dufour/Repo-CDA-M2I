const result = document.querySelector(".result");
let motDemande = "";
let motInverse= "";


motDemande = prompt("Veuillez rentrer un mot :");

motInverse = motDemande.split('').reverse().join('')

console.log(motInverse);


if (motDemande==motInverse) {
    result.innerHTML = `<h3>le mot ${motDemande} est un palindrome</h3>`
} else {
    result.innerHTML = `<h3>le mot ${motDemande} n'est pas un palindrome</h3>`
}

