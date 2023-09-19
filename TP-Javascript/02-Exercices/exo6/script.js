const result = document.querySelector(".result");
let coteCarre = 0,
affichage="",
perimetre=0,
perimetreRectangle=0,
aire=0,
aireRectangle,
longueur=0,
largeur=0

coteCarre = Number(prompt("Veuillez saisir un nombre :"))

perimetre= coteCarre*4

aire = coteCarre**2

result.innerHTML = `Les longueurs des cotés du carré étant de ${coteCarre}cm, <br> <li>Le périmètre de ce carré est de  ${perimetre}cm </li> <li>L'aire de ce carré est de ${aire}cm²</li> `


//------------------------------------------------------------rectangle----------------------------------------

longueur = Number(prompt("Veuillez saisir une longueur :"))
largeur = Number(prompt("Veuillez saisir une largeur :"))

perimetreRectangle= longueur*2+largeur*2

aireRectangle = longueur*largeur

result.innerHTML = `Les longueurs des cotés du carré étant de ${coteCarre}cm, <br> <li>Le périmètre de ce carré est de  ${perimetre}cm </li> <li>L'aire de ce carré est de ${aire}cm²</li> <br>Les longueurs des cotés du rectangle étant de ${longueur}cm pour la longueur , et de ${largeur}cm pour la largeur, <br> <li>Le périmètre de ce carré est de  ${perimetreRectangle}cm </li> <li>L'aire de ce carré est de ${aireRectangle} cm²</li> `