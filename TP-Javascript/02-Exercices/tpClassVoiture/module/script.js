import { Voiture } from "./js/Voiture.js";

const result = document.querySelector(".result")

let voiture1 = new Voiture ("Bmw", "Serie1", 80)
let voiture2 = new Voiture ("Mercedes", "GLB", 100)



console.log(voiture1.vitesse);

// voiture1.Accelerer()
// voiture1.Accelerer()
// voiture1.Accelerer()

// voiture2.Accelerer()
// voiture2.Accelerer()
// voiture2.Tourner()
// voiture2.Tourner()

// console.log(voiture1.vitesse);
// console.log("----------------");
// console.log(voiture2.vitesse);


result.innerHTML += voiture1.Accelerer()
result.innerHTML += voiture1.Accelerer()
result.innerHTML += voiture1.Accelerer()

result.innerHTML += voiture2.Accelerer()
result.innerHTML += voiture2.Accelerer()
result.innerHTML += voiture2.Tourner()
result.innerHTML += voiture2.Tourner()