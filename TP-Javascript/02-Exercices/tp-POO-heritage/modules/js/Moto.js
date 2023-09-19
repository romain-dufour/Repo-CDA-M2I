import { Vehicule } from "./vehicule.js";

export class Moto extends Vehicule{
//     display(){
//         return `Moto : ${this.marque} - ${this.modele} - ${this.kilometrage}km - ${this.année}`
    
// }

    display(){
        return `Moto : ${super.display()}`
    
}
}

    