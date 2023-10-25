import express from 'express'
import {CommandeDao} from "../dao/CommandeDao.js"
import {Commande} from "../models/Commande.js"

const commandes = express.Router();

const commandeDao = new CommandeDao();
commandeDao.readFile()


// afficher la liste des commandes
commandes.get("/", (req, res) =>{
    res.json(commandeDao.getAll())
})

// creation d'une commande
commandes.post("/", (req, res) =>{
    const{client,listeProduits}=req.body;
    let commande = new Commande(null,client,listeProduits )
    res.json(commandeDao.save(commande))
})

// afficher une commande par son id
commandes.get('/:commandeId', (req, res) => {
    let commande = commandeDao.findById(req.params.commandeId);

    if(commande === undefined) {
        res.status(404).json({code: 404, message: "aucune commande trouvée avec cet id"})
    }

    res.json(commande)
});

export default commandes