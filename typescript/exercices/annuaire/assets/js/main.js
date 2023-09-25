import { Person } from "./classes/Person.js";
const addfirstname = document.querySelector("#add-firstname");
const addlastname = document.querySelector("#add-lastname");
const adddateOfBirth = document.querySelector("#add-dateOfBirth");
const addemail = document.querySelector("#add-email");
const addphoneNumber = document.querySelector("#add-phoneNumber");
const addavatarURL = document.querySelector("#add-avatarURL");
const formAddContact = document.querySelector("#formAddContact");
const formEditContact = document.querySelector("#formEditContact");
const editContactModal = document.querySelector("#editContactModal");
const contactsContainer = document.querySelector("#contactsContainer");
const contact = document.querySelector(".contact");
let albert = new Person("Albert", "DUPONT", new Date("2000-09-19T12:13:00"), "a.d@gmail.com", 1676447729);
let john = new Person("john", "SMITH", new Date("1989-09-19T12:13:00"), "J.S@gmail.com", 1676447729);
let clara = new Person("clara", "GOMEZ", new Date("1978-09-19T12:13:00"), "c.g@gmail.com", 1676447729);
let elizabeth = new Person("elizabeth", "MARTIN", new Date("2004-09-19T12:13:00"), "e.m@gmail.com", 1676447729);
let listContact = [];
listContact.push(albert, john, clara, elizabeth);
console.table(listContact);
contact.innerHTML = albert.fullname;
formAddContact.addEventListener("submit", () => {
});
// Créer un bouton et lui ajouter les infos 
