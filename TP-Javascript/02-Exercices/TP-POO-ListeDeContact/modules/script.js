import { Contact } from "./classe/Contact.js";

const result = document.querySelector(".result")

let contact1 = new Contact("Mr", "Dupont", "Jean", "08/10/1973","+(33)6 12 36 54 78", "jdupont@gmail.com")
let contact2 = new Contact("Mme", "Doe", "Jeanne", "24/02/1985","+(33)6 45 23 87 14", "jdoe@yahoo.fr")
let contact3 = new Contact("Mr", "Martin", "Jacques", "22/06/1933","+(33)6 78 45 24 95", "jmartin@petitrapporteur.fr")

console.log(contact1.listContact());
result.innerHTML += contact1.listContact()
result.innerHTML += contact2.listContact()
result.innerHTML += contact3.listContact()