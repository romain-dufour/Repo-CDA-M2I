import {resolve} from "path"
import { readFileSync, writeFileSync } from "fs"


export class ContactDao {
    constructor() {
        this.file = resolve("./data/db.json");
        this.contacts=[];
    }
    readFile() {
        const file = readFileSync(this.file, { encoding: "utf-8" });
        this.contacts = JSON.parse(file);
    }

    writeFile() {
        writeFileSync(this.file, JSON.stringify(this.contacts));
      }
    
      getAll() {
        return this.contacts;
      }

      save(contact) {
        contact.id = new Date();
        this.contacts.push(contact);
        this.writeFile();
        return contact;
      }
    
      findById(id) {
        return this.contacts.find((c) => c.id === id);
      }
    
      deleteContact(id) {
        this.contacts = this.contacts.filter((c) => c.id !== id);
        this.writeFile();
      }

      updateContact(contactUpdate) {
        const contact = this.findById(contactUpdate.id);
        if (contact == undefined) {
          return false;
        }
        contact.firstName = contactUpdate.firstName;
        contact.lastName = contactUpdate.lastName;
        contact.phone = contactUpdate.phone;
        contact.email = contactUpdate.email;

        this.writeFile();
        return true;
      }
    
    
}