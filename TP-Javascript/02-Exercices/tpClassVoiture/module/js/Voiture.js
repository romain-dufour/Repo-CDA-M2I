export class Voiture {
    constructor(marque, modele, vitesse){
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }

    toString() {
        return `Voiture : ${this.marque} ${this.modele} va à ${this.vitesse} km/h</p>`
        
    }

    Accelerer(){
        console.log(this.toString);
        this.vitesse += 10
        return `<p> La voiture ${this.marque} ${this.modele} avance désormais à ${this.vitesse} km/h</p>`
    }

    Tourner(){
        console.log(this.toString);
        this.vitesse -= 5
        return `<p> La voiture ${this.marque} ${this.modele} avance désormais à ${this.vitesse} km/h</p>`

    }
}






