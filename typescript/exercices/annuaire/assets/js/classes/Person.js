class Person {
    // readonly _avatarURL: string;
    constructor(firstname, lastname, dateOfBirth, email, phoneNumber) {
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
}
export { Person };
