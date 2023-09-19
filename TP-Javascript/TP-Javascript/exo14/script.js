const result = document.querySelector(".result");

let AB=0,BC=0,AC=0,affichage=""

AB=Number(prompt("Veuillez rentrez la longueur AB"));
BC=Number(prompt("Veuillez rentrez la longueur BC"));
AC=Number(prompt("Veuillez rentrez la longueur AC"));

if(AB-BC==0 && BC-AC==0 && AB-AC==0){
    affichage ="Le triangle est équilatéral"
} else if (AB-AC==0) {
    affichage="Le triangle est isocèle en A, mais n'est pas équilatéral"
} else if (AB-BC==0) {
    affichage="Le triangle est isocèle en B, mais n'est pas équilatéral"
} else if (AC-BC==0) {
    affichage="Le triangle est isocèle en C, mais n'est pas équilatéral"
} else {
    affichage="Le triangle n'est isocèle ni en A, ni en B, ni en C"
}

result.innerHTML = affichage