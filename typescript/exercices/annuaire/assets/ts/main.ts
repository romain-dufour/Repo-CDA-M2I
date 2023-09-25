import { Person } from "./classes/Person.js";


const addfirstname  = <HTMLInputElement>document.querySelector("#add-firstname");
const addlastname  = <HTMLInputElement>document.querySelector("#add-lastname");
const adddateOfBirth  = <HTMLInputElement>document.querySelector("#add-dateOfBirth");
const addemail  = <HTMLInputElement>document.querySelector("#add-email");
const addphoneNumber  = <HTMLInputElement>document.querySelector("#add-phoneNumber");
const addavatarURL  = <HTMLInputElement>document.querySelector("#add-avatarURL");
const formAddContact  = <HTMLFormElement>document.querySelector("#formAddContact");
const formEditContact  = <HTMLFormElement>document.querySelector("#formEditContact");
const editContactModal  = <HTMLElement>document.querySelector("#editContactModal");
const contactsContainer  = <HTMLElement>document.querySelector("#contactsContainer");
const contact  = <HTMLElement>document.querySelector(".contact");


let albert = new Person("Albert", "DUPONT",new Date("2000-09-19T12:13:00"),"a.d@gmail.com",1676447729)
let john = new Person("john", "SMITH",new Date("1989-09-19T12:13:00"),"J.S@gmail.com",1676447729)
let clara = new Person("clara", "GOMEZ",new Date("1978-09-19T12:13:00"),"c.g@gmail.com",1676447729)
let elizabeth = new Person("elizabeth", "MARTIN",new Date("2004-09-19T12:13:00"),"e.m@gmail.com",1676447729)

let listContact:Person[] = []
listContact.push(albert,john,clara,elizabeth)
console.table(listContact);

contact.innerHTML = albert.fullname

formAddContact.addEventListener("submit",()=>{
    

})

// Créer un bouton et lui ajouter les infos 