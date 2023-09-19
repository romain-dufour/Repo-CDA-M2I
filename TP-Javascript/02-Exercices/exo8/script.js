const result = document.querySelector(".result");
let prixHT=0, pourcentageTva=0, montantTva=0, prixTtc =0;

prixHT = Number(prompt("Veuillez indiquer le prix HT en euros"));
pourcentageTva = Number(prompt("Veuillez indiquer le taux de TVA en pourcentage"));

montantTva=(prixHT*pourcentageTva)/100;
prixTtc=prixHT+montantTva;


result.innerHTML =`Le prix H.T de l'objet étant de ${prixHT}€, avec un taux de T.V.A applicable de ${pourcentageTva}%<br><li>Le montant de la T.V.A s'élévera à ${montantTva}€<br><li>Le prix de l'objet sera de ${prixTtc}€`