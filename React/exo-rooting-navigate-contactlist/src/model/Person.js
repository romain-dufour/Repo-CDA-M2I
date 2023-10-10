let personCount = 0

class Person {
    static personCount = 0

    constructor(_prenom,_nom,_email,_telephone) {
        this._id = ++personCount
        this._prenom = _prenom
        this._nom = _nom
        this._email = _email
        this._telephone = _telephone
    }

    get id(){
        return this._id
    }

    get prenom(){
        return this._prenom
    }

    get nom(){
        return this._nom
    }

    get email(){
        return this._email
    }

    get telephone(){
        return this._telephone
    }
}

export default Person