/*
    Creation de fonctions

*/

//Fonction sans paremètres
function hello(){
    console.log("Hello world");
}

//appel de la fonction

hello()
hello()
hello()

// Fonction avec paramètres (valeur par défaut à mettre en dernier )

function helloParams(lastname,firstname= "dufour"){
    console.log(`Hello ${firstname} ${lastname}`);
}

helloParams("dufour")

//Fonction avec return
console.log("------------------------------------------------");

function helloReturn (firstname) {
    let chaine = `Hello ${firstname}`
    return chaine 
}

let result =  helloReturn("Romain")

console.log(result);

// let lastname = prompt("Veuillez saisir votre prénom :")

// helloParams(lastname)

function tuples(){
    let nb1 = 1,
    nb2 = 2,
    nb3 = 3
    return [nb1, nb2, nb3]
}

let [valeur1, valeur2, valeur3] = tuples()

console.log(valeur2);

let sayHi = function(){
    alert("Hello world")
}
console.log(typeof(sayHi));

// Fonctions callback

function salutation(name) {
    alert("Bonjour " + name)

}

function salutationCallback(callback) {
    let name = prompt("Veuillez saisir votre nom")
    callback(name)
}
salutationCallback(salutation)

/*
Les fonctions fléchées
*/

// Sans paramètres
let cas1 = () => {
    return "Toto"
}

let cas2 = (firstname) => {
return firstname
}
//simplification seulement si la fonction ne fair qu'un return
let cas3 = (firstname) => firstname
