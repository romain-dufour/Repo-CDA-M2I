// ENUM
// Le typescript permet la création d'énum, des types permettant de 
// relier des valeurs numériques avec des valauers en toutes lettres plus utiles pour nous developpeur
// Au niveau de la requestAnimationFrame, celas restera seulement des nombres cela dispatchEvent, donc on gagne en performance
var STATUS;
(function (STATUS) {
    STATUS[STATUS["CADRE"] = 0] = "CADRE";
    STATUS[STATUS["SALARIE"] = 1] = "SALARIE";
    STATUS[STATUS["COMMERCIAL"] = 2] = "COMMERCIAL";
    STATUS[STATUS["BLABLA"] = 3] = "BLABLA";
})(STATUS || (STATUS = {}));
let myStatusC = STATUS.CADRE;
let myStatusD = 2;
let myStatusE = STATUS[2];
console.log(myStatusC);
console.log(myStatusD);
console.log(myStatusE);
let myObjectWithEnum = {
    name: "Toto",
    role: STATUS.COMMERCIAL,
    isCommercial: function () { return this.role === STATUS.COMMERCIAL; }
};
console.log(`mon utilisateur est un commercial ? ` + myObjectWithEnum.isCommercial());
// Type ANY
const myFunction = (arg) => {
    console.log(arg.length);
};
myFunction("Bonjour");
myFunction(3);
// Type Unknown + vérifications
console.log(" #### UNKNOW ####");
let str;
let strAny;
let hello = "bonjour";
let myNumber = 42;
str = myNumber;
strAny = hello;
// console.log(str.length); // erreur strr est de type unknown
console.log(strAny.length); // aucune erreur
// console.log(typeof str);
console.clear();
if (typeof str == 'string') {
    console.log(str.length); // str est de type string
    console.log(typeof str);
}
else {
    console.log(str); // type autre que string
    console.log(typeof str);
}
// VOID
function afficherMessage() {
    console.log('bonjour, monde !');
}
const resultat = afficherMessage(); // resultat est de type void
console.log(typeof resultat); // undefined
// Type function
let operation;
operation = function (a, b) {
    return a + b;
};
const calcul = operation(5, 3); // resultat est de type number
console.log(calcul); // Affiche 8
// 3
