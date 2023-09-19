/* 
    Les structures conditionnelles
*/

let compte = 300

if (compte > 0) {
    console.log("Votre compte est créditeur");
}

if (compte < 0) {
    console.log("Votre compte est débiteur");
}

if (compte > 0) {
    console.log("Votre compte est créditeur");
} else {
    console.log("Votre compte est débiteur");
}

if (compte > 0) {
    console.log("Votre compte est créditeur");
} else if(compte == 0){
    console.log("Votre compte est à 0");
} else {
    console.log("Votre compte est débiteur");
}

let estVrai = false
if(estVrai){
    console.log("C'est vrai");
}else{
    console.log("C'est faux");
}

console.log(1 === 1); // Vrai
console.log("1" === 1); // Faux
console.log(1 == 1); // Vrai
console.log("1" == 1); // Vrai

console.log("1" != 1); // Faux
console.log(3 !== 3); // Faux
console.log("3" !== 3); //Vrai


/* 
    switch  case

    switch (condition){
        case valeur1:
            // instructions
            break;
        case valeur 2:
            // instructions 
            break;
        default:
            //instructions
            break;
    }
*/


let fruits = "Orange"

switch(fruit){
    case "Oranges":
        console.log("Les oranges sont à 2 euros");
        break
    case "Banane":
        console.log("Les bananes sont à 1 euro");
        break
    default:
        console.log("Votre fruit n'existe pas");
}

// Switch avec range de valeurs

let age=3

switch(true) {
    case age <= 6:
        console.log("Votre enfant est dans la catégorie 'Baby'");
        break
    case age<= 8:
        console.log("Votre enfant est dans la catégorie 'poussin'");
        break
        case age <= 10:
        console.log("Votre enfant est dans la catégorie 'pupille'");
        break
    case age<= 12:
        console.log("Votre enfant est dans la catégorie 'minime'");
        break
    default:
        console.log("trop grand");
        break

}

for (let i = 1; i<=10; i++){
    if(i===5){
        continue
    }
    console.log(i);
}


let numbers = [1,2,3,4,5,6,7,]
for(let i=0; i < numbers.length; i++){
    console.log(numbers[i]);
}

//For ... of

for(let number of numbers){
    console.log(number);
}

// for each


// for ... in
let fruit = {
    nom: "banane",
    prix : 1.05,
    couleur: "jaune"
}

for (let key in fruit) {
    console.log(key + " : " + fruit[key]);
    
}