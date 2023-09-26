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
const btnAddContact = document.querySelector("#btnAddContact");
// let albert = new Person("Albert", "DUPONT",new Date("2000-09-19T12:13:00"),"a.d@gmail.com",1676447729)
// let john = new Person("john", "SMITH",new Date("1989-09-19T12:13:00"),"J.S@gmail.com",1676447729)
// let clara = new Person("clara", "GOMEZ",new Date("1978-09-19T12:13:00"),"c.g@gmail.com",1676447729)
// let elizabeth = new Person("elizabeth", "MARTIN",new Date("2004-09-19T12:13:00"),"e.m@gmail.com",1676447729)
// let listContact:Person[] = []
// listContact.push(albert,john,clara,elizabeth)
createContact("Albert", "DUPONT", new Date("2000-09-19T12:13:00"), "a.d@gmail.com", "0676447729");
createContact("john", "SMITH", new Date("1989-09-19T12:13:00"), "J.S@gmail.com", "0676447729");
createContact("clara", "GOMEZ", new Date("1978-09-19T12:13:00"), "c.g@gmail.com", "0676447729");
createContact("elizabeth", "MARTIN", new Date("2004-09-19T12:13:00"), "e.m@gmail.com", "0676447729");
// contactsContainer.addEventListener("submit" , addContact){}
// // ouvrir fenetre pour ajouter un contact et chaque input correspond aux elements de createContact
// btnAddContact.addEventListener("click", openaddcontact){}
// //ouvrir fenetre addcontact
// function AddContact(e) {
//     e.preventDefault();
// }
// creer et afficher un contact
function createContact(firstname, lastname, dateOfBirth, email, phoneNumber) {
    const instance = new Person(firstname, lastname, dateOfBirth, email, phoneNumber);
    let listContact = [];
    listContact.push(instance);
    console.table(listContact);
    listContact.forEach(person => {
        let fullname = person.fullname;
        let id = person.createId;
        contact.innerHTML += `<button type="button" class= "btn btn-outline-light w-100" id="${id}" onclick="myFunctionEdit">${fullname}
     </button>
      `;
    });
    //  const "listen" + "instance.create
}
// Créer un bouton et lui ajouter les infos 
function myFunctionEdit() {
}
