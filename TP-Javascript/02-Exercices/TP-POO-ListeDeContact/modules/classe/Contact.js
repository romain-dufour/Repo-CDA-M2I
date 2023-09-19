export class Contact {
    constructor(Titre, Nom, Prenom, DateNaissance, Telephone, Email) {
        this.Titre = Titre
        this.Nom = Nom
        this.Prenom = Prenom
        this.DateNaissance = DateNaissance
        this.Telephone = Telephone
        this.Email = Email
    }

    listContact() {
        return `
        <div class="col-1 fs-6 border">
                ${this.Titre}
            </div>
            <div class="col-1">
                ${this.Nom}
            </div>
            <div class="col-2">
                ${this.Prenom}
            </div>
            <div class="col-2">
                ${this.DateNaissance}
            </div>
            <div class="col-3">
                ${this.Telephone}
            </div>
            <div class="col-3">
                ${this.Email}
            </div>`
    }

}