import express from 'express'
import cors from 'cors';
import { dateMiddleware , queryLogger, authMiddleware} from './middlewares/middlewares.js';
import {Contact} from './models/Contact.js'
import {ContactDao} from './dao/ContactDao.js'

const app = express();
const port = 3001;

const contactDao = new ContactDao();

app.use(express.json());

app.use(cors());
app.use(dateMiddleware);
app.use(queryLogger);

//recupère les contacts
app.get('/contacts', (req, res) => {
    res.json(contactDao.getAll());
});

//récupérer un contact par son Id
app.get('/contacts/:contactId', (req, res) => {
    let contact = contactDao.findById(req.params.contactId);

    if(contact == undefined) {
        res.status(404).json({code: 404, message: "aucun contact trouvé avec cet id"});
    }

    res.json(contact);
});


// créer un contact
app.post('/contacts',authMiddleware, (req, res) => {
    const {firstName, lastName, phone, email} = req.body;
    const {user, password} = req.header;

    let contact = new Contact(null, firstName, lastName, phone, email);
    res.json(contactDao.save(contact));
});

// mettre a jour le contact
app.put('/contacts/:contactId',authMiddleware, (req, res) => {
    const {id, firstName, lastName, phone, email} = req.body;
    const {user, password} = req.header;
    if(req.params.contactId != id && req.params.) res.sendStatus(409);

    let contact = new Contact(id, firstName, lastName, phone, email);

    contactDao.updateContact(contact) ? res.sendStatus(200) : res.status(400).json({code: 400, message: "problème lors de la mise à jour du contact"})
});


// supprimer un contact

app.delete('/contacts/:contactId',authMiddleware, (req, res) => {
    let user = authMiddleware.user;
    let password = authMiddleware.password;

 if(!user || !password) {res.sendStatus(401)}
    contactDao.deleteContact(req.params.contactId);
    res.sendStatus(200);
});


app.listen(port, () => {
    console.log(`http://127.0.0.1:${port}`)

})