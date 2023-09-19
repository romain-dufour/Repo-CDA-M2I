export class Contact {
    constructor() {
        this.nom = "Toto"
        this.prenom = ""
        this.email = "toto@gmail.fr"
    }

    toString() {
        return `Je suis ${this.prenom}, mon email : ${this.email}`
    }

    get name()  {
        return this.nom
    }

    set name(n) {
        this.nom = n
    }
}