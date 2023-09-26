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
const btnAddContact = <HTMLElement>document.querySelector("#btnAddContact");


// let albert = new Person("Albert", "DUPONT",new Date("2000-09-19T12:13:00"),"a.d@gmail.com",1676447729)
// let john = new Person("john", "SMITH",new Date("1989-09-19T12:13:00"),"J.S@gmail.com",1676447729)
// let clara = new Person("clara", "GOMEZ",new Date("1978-09-19T12:13:00"),"c.g@gmail.com",1676447729)
// let elizabeth = new Person("elizabeth", "MARTIN",new Date("2004-09-19T12:13:00"),"e.m@gmail.com",1676447729)

// let listContact:Person[] = []
// listContact.push(albert,john,clara,elizabeth)

createContact("Albert", "DUPONT",new Date("2000-09-19T12:13:00"),"a.d@gmail.com","0676447729")
createContact("john", "SMITH",new Date("1989-09-19T12:13:00"),"J.S@gmail.com","0676447729")
createContact("clara", "GOMEZ",new Date("1978-09-19T12:13:00"),"c.g@gmail.com","0676447729")
createContact("elizabeth", "MARTIN",new Date("2004-09-19T12:13:00"),"e.m@gmail.com","0676447729")

// contactsContainer.addEventListener("submit" , addContact){}

// // ouvrir fenetre pour ajouter un contact et chaque input correspond aux elements de createContact
// btnAddContact.addEventListener("click", openaddcontact){}

// //ouvrir fenetre addcontact
// function AddContact(e) {
//     e.preventDefault();



// }


// creer et afficher un contact
function createContact(firstname: string, lastname: string, dateOfBirth: Date, email: string, phoneNumber: string){
    const instance = new Person(firstname, lastname, dateOfBirth, email, phoneNumber)
    let listContact:Person[] = []
    listContact.push(instance)
    console.table(listContact);

       listContact.forEach(person => {
        
        let fullname = person.fullname
        let id = person.createId
        contact.innerHTML += `<button type="button" class= "w-100 my-2 btn btn-outline-light w-100" id="${id}" onclick="myFunctionEdit">${fullname}
     </button>
      `
       });
  //  const "listen" + "instance.create
}

// Créer un bouton et lui ajouter les infos 
function myFunctionEdit(){
    

}