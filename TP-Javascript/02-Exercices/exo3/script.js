const result = document.querySelector(".result")
let diametre =0 , perimetre = 0, aire = 0;


diametre = Number(prompt("Veuillez saisir un diamètre:"));

perimetre = diametre * Math.PI;
aire = Math.PI * ((diametre/2)**2)

result.innerHTML = `<h3>Diamètre = ${diametre}cm<br>Périmètre = ${perimetre}cm<br>Aire = ${aire}cm²<br>Périmètre(arrondi) = ${Math.round(perimetre)}cm<br>Aire(arrondi) = ${Math.round(aire)}cm²`;
