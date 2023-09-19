import { Vehicule } from "./vehicule.js";

export class CarList {
    constructor(){
        this.carList = []
    }

    //ajouter immat
    addImmat(immat){
        const ajoutImmat = new Vehicule(immat);
        this.carList.push(ajoutImmat)

    }

    //vérifier si immat est dans la liste

    checkimmat(immat){
        this.carList.some(immat)
    }
    } 


