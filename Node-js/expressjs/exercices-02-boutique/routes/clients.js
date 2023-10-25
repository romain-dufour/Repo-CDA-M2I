import express from 'express'
import {ClientDao} from "../dao/ClientDao.js"
import { Client } from '../models/Client.js';


const clients = express.Router();

const clientDao = new ClientDao();
clientDao.readFile()

// afficher la liste des clients
clients.get("/", (req, res) =>{
    res.json(clientDao.getAll())
});

// creation d'un client
clients.post("/", (req, res) =>{
    const{nom, prenom, telephone} = req.body;
    let client = new Client(null, nom, prenom, telephone)
    res.json(clientDao.save(client))
});

//afficher un client par son id
clients.get('/:clientId', (req, res) => {
    let client = clientDao.findById(req.params.clientId);

    if(client === undefined) {
        res.status(404).json({code: 404, message: "aucun client trouvé avec cet id"})
    }

    res.json(client)
});

export default clients