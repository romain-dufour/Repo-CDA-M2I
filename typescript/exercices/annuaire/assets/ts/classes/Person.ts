class Person {
    private _firstname: string;
    private _lastname: string;
    private _dateOfBirth: Date;
    private _email: string;
    private _phoneNumber: number;
    // readonly _avatarURL: string;

    constructor(firstname: string, lastname: string, dateOfBirth: Date, email: string, phoneNumber: number) {
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
}


export {Person}