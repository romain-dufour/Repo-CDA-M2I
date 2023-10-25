import {readFileSync, writeFileSync} from 'fs'
// import {v4 as uuidv4} from "uuid"
import { resolve } from "path";


export class ProduitDao {
    constructor() {
        this.file = resolve("./data/produits.json")
        this.produits = []
    }
    
    readFile() {
        const file = readFileSync(this.file, {encoding:"utf-8"})
        this.produits = JSON.parse(file)
    }

    writeFile() {
        writeFileSync(this.file, JSON.stringify(this.produits))
    }

    getAll() {
        return this.produits
    }


    save(produit) {
        produit.id = new Date();
        this.produits.push(produit);
        this.writeFile();
        return produit;
      }

      findById(id) {
        return this.produits.find((p) => p.id === id)
      }
}