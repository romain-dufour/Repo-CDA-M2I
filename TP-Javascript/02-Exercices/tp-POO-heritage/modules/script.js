import { Voiture } from "./js/Voiture.js";
import { Moto } from "./js/Moto.js";


const result = document.querySelector(".result")

let renaultKangoo = new Voiture ("Renault", "Kangoo", 240000, 2003,1)
let BMWR1150 = new Moto ("BMW", "R1150R Rockster", 65000, 2005)


console.log(renaultKangoo.display());
result.innerHTML += renaultKangoo.display()

console.log(BMWR1150.display());
result.innerHTML += BMWR1150.display()