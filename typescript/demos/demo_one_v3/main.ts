console.log("Base TypeScript");

//Inference (typescript le fait pour nous)

let test;
test = true;
test = "true";
test = 42;

let monPrenom = "Romain"; // type string
let monAge = 34; // type number
let isPresent = true; // type boolean

// je peux reasigne des valeurs uniquement du meme type
// monPrenom = true ; erreur

// error TS2322: Type 'boolean' is not assignable to type 'string'.
monPrenom = "true";

// error TS2322: Type 'string' is not assignable to type 'number'.
monAge = 45;

// error TS2322: Type 'string' is not assignable to type 'boolean'.
isPresent = false;


// Assignation (on donne nous meme le type)

// Pour specifier le type d'une variable, la syntinxe est la suivante
let firstname: string;
firstname = "Christophe";
// firstname = 45 //main.ts:31:1 - error TS2322: Type 'number' is not assignable to type 'string'.

// let age : number = "toto" //erreur
let age: number = 45; // force le bon type
let present: boolean = true;


// Via le typescript on a une auto-completion et une intelissence plus poussée
console.log("nombre de lettre dans " + firstname + " " + firstname.length);

// Connaitre le type d'une variable avec typeof
console.log("type de la varibale firstname : " + typeof firstname);
console.log("type de la varibale age : " + typeof age);
console.log("type de la varibale present : " + typeof present);

let ageString: string = age.toString();
let presentString: string = present.toString();

console.log(ageString + " " + typeof ageString);
console.log(presentString + " " + typeof presentString);

let message: string = `
Bonjour ${firstname}
Vous avez ${age} ans.
Vous etes ${present ? "présent" : "absent"}
`
console.log(message);

// Pour la création de fonction en TS, la difference est l'ajout du typage pour les parametres
// De la sorte on sécurise les utilisation futures de notre fonction en vérouillant des types incorrects

function addition(a: number, b: number): number {
    return a + b
}

function multiply(a: number, b: number): number {
    return a * b
}

function logMessage(message: string): void {
    console.log(message);
}

let result = addition(1, 2)

console.log("resultat de 1 + 2 = " + result);

// let resultB = multiply("A","B") // ne marche pas 


// Array

// Pour définir un tableau de number, il faut utiliser le type suivi des crochets
let numbers: number[] = [1, 2, 3, 4]

// ou

let numbers2: Array<number> = [1, 2, 3, 4]

// numbers.push("toto") // erreur
numbers.push(5)
console.log(numbers);
console.table(numbers2);

// Dans un tableau array de type any on peut mettre ce que l'ont veut

let tab: any[];

// On peux declarer un tableau qui contitent plusieurs types alors tous ces types peuvent etres present dans le tableau


let tab2 = [23, true, "Christophe"]
console.log(tab2);
tab2[1] = "toto"
tab2.push("24")

// Tuples

// On peut aussi via le typescript creer des tuples, , des Array de taille fixe
// On devra du coup avoir le bon nombre d'éléments dans la variable et le bon typage dans le bon ordre

let myPerson: [string, string, number]
myPerson = ["Albert", "Dupont", 45]
console.table(myPerson);
myPerson.push("toto") // incohérence mais fonctionne
myPerson.push(22) // incohérence mais fonctionne
//myPerson.push(true) // ne fonctionne pas
console.log(myPerson.length);

//myPerson[3] // index non connu donc erreur

// Objet

let monObjetA = {
    firstname: "Albert",
    lastname: "Dupont",
    age: 35
}


// indicateur de valeur objet
let monObjetB: object = { // permet de definir que c'est un objet sans precision
    firstname: "Albert",
    lastname: "Dupont",
    age: 35
}

monObjetA.age
// monObjetB.age // ne trouve rien

let monObjetC: {
    firstname: string,
    lastname: string,
    age: number
} = {
    firstname: "Albert",
    lastname: "Dupont",
    age: 35
}

monObjetC.age // trouve la propriete
// de préférence utilisation de l'inference


let monObjet: object = {
    firstnam : "Dupont" }

console.log("monObjet objet : " + typeof monObjet)
monObjet=[]
console.log("monObjet Array : " + typeof monObjet);