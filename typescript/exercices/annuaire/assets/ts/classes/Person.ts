class Person {
    private static _count: number = 0
    private _id: number;
    private _firstname: string;
    private _lastname: string;
    private _dateOfBirth: Date;
    private _email: string;
    private _phoneNumber: string;
    // readonly _avatarURL: string;

    constructor(firstname: string, lastname: string, dateOfBirth: Date, email: string, phoneNumber: string) {
        this._id = ++Person._count
        this._firstname = firstname
        this._lastname = lastname
        this._dateOfBirth = dateOfBirth
        this._email = email
        this._phoneNumber = phoneNumber
        // this._avatarURL = avatarURL
    }

    get fullname() {
        return this._firstname + " " + this._lastname
    }

    get firstname() {
        return this._firstname
    }

    get lastname() {
        return this._lastname
    }

    get phoneNumber() {
        return this._phoneNumber
    }

    get dateOfBirth() {
        return this._dateOfBirth
    }

    set phoneNumber(value : string) {
        this.phoneNumber = value
      }

    get createId() {
        return this._id
    }
}


export { Person }