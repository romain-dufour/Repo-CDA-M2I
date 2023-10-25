import {readFileSync, writeFileSync} from 'fs'
// import {v4 as uuidv4} from "uuid"
import { resolve } from "path";


export class CommandeDao {
    constructor() {
        this.file = resolve("./data/commandes.json")
        this.commandes = []
    }

    readFile() {
        const file = readFileSync(this.file, { encoding: "utf-8" })
        this.commandes = JSON.parse(file)
    }

    writeFile() {
        writeFileSync(this.file, JSON.stringify(this.commandes))
    }

    getAll() {
        return this.commandes
    }


    save(commande) {
        commande.id = new Date();
        this.commandes.push(commande);
        this.writeFile();
        return commande;
    }

    findById(id) {
        return this.commandes.find((c) => c.id === id)
    }

    
}
