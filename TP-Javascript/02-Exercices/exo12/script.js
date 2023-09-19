const result = document.querySelector(".result");

let nombre1 =0,
    nombre2 =0

nombre1 = Number(prompt("Veuillez saisir un premier nombre"));
nombre2 = Number(prompt("Veuillez saisir un second nombre différent de 0"));

while (nombre2 == 0){

    nombre2 = Number(prompt("Veuillez saisir un second nombre différent de 0"));
} 

if (nombre1 % nombre2 ==0 & nombre2 != 0){
    result.innerHTML =`Le nombre ${nombre1} est divisible par ${nombre2}`
} else {
    result.innerHTML =`Le nombre ${nombre1} n'est pas divisible par ${nombre2}, il y  `
}