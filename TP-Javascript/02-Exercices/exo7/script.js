const result = document.querySelector(".result");
let coteA= 0, coteB = 0, hypotenuse = 0

coteA = Number(prompt("Veuillez saisir la longueur A d'un coté du triangle")) ;
coteB = Number(prompt("Veuillez saisir la longueur B d'un coté du triangle")) ;

hypotenuse=Math.round(Math.sqrt(Math.pow(coteA,2)+Math.pow(coteB,2))*100)/100
result.innerHTML= `Les longueurs des cotés adjacents à l'angle droit étant de ${coteA}cm et de ${coteB}cm, <br> <li>La longueur de l'hypoténuse est de ${hypotenuse}cm`
