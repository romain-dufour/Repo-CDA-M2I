// ENUM

// Le typescript permet la création d'énum, des types permettant de 
// relier des valeurs numériques avec des valauers en toutes lettres plus utiles pour nous developpeur
// Au niveau de la requestAnimationFrame, celas restera seulement des nombres cela dispatchEvent, donc on gagne en performance

enum STATUS {
    CADRE,
    SALARIE,
    COMMERCIAL,
    BLABLA
}

let myStatusC = STATUS.CADRE
let myStatusD: STATUS = 2
let myStatusE = STATUS[2]

console.log(myStatusC);
console.log(myStatusD);
console.log(myStatusE);


let myObjectWithEnum = {
    name: "Toto",
    role: STATUS.COMMERCIAL,
    isCommercial: function (): boolean { return this.role === STATUS.COMMERCIAL }
}
console.log(`mon utilisateur est un commercial ? ` + myObjectWithEnum.isCommercial());

// Type ANY

const myFunction = (arg: any): void {
    console.log(arg.length);
}

myFunction("Bonjour")
myFunction(3)

// Type Unknown + vérifications

console.log(" #### UNKNOW ####")

let str: unknown;
let strAny: any;
let hello: string = "bonjour"
let myNumber: number = 42;
str = myNumber;
strAny = hello;

// console.log(str.length); // erreur strr est de type unknown
console.log(strAny.length) // aucune erreur
// console.log(typeof str);
console.clear();

if(typeof str == 'string'){
    console.log(str.length); // str est de type string
    console.log(typeof str);
}else {
    console.log(str); // type autre que string
    console.log(typeof str);
}


// VOID

function afficherMessage(): void {
    console.log('bonjour, monde !')
}

const resultat = afficherMessage(); // resultat est de type void
console.log(typeof resultat); // undefined

// Type function

let operation : Function;

operation = function (a: number, b: number): number {
    return a + b;
}

const calcul = operation(5,3); // resultat est de type number
console.log(calcul); // Affiche 8

// 3