import { Vehicule } from "./vehicule.js";

export class Voiture extends Vehicule {
    constructor(marque, modele, kilometrage, annee, clim=false){
        super(marque, modele, kilometrage, annee)
        this.clim = clim
        this.display()
    }

    display(){
        // return `Auto : ${this.marque} - ${this.modele} - ${this.kilometrage}km - ${this.année} - Climatisée`

        if(this.clim == true){
            return `Auto : ${super.display()} - Climatisée <br>` /* ou ${this.clim?"Climatisée":"non climatisé"*/
        }
       else{
        return `Auto : ${super.display()} - Non climatisée <br>`
       }
    }

}