class Person {
    // readonly _avatarURL: string;
    constructor(firstname, lastname, dateOfBirth, email, phoneNumber) {
        this._id = ++Person._count;
        this._firstname = firstname;
        this._lastname = lastname;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._phoneNumber = phoneNumber;
        // this._avatarURL = avatarURL
    }
    get fullname() {
        return this._firstname + " " + this._lastname;
    }
    get firstname() {
        return this._firstname;
    }
    get lastname() {
        return this._lastname;
    }
    get phoneNumber() {
        return this._phoneNumber;
    }
    get dateOfBirth() {
        return this._dateOfBirth;
    }
    set phoneNumber(value) {
        this.phoneNumber = value;
    }
    get createId() {
        return this._id;
    }
}
Person._count = 0;
export { Person };
