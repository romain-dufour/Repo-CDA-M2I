import express from 'express'
import {ProduitDao} from "../dao/ProduitDao.js"
import { Produit } from '../models/Produit.js';


const produits = express.Router();


const produitDao = new ProduitDao();
produitDao.readFile()

// creation d'un produit
produits.post("/", (req, res) =>{
    const{titre, prix, stock} = req.body;
    let produit = new Produit(null, titre, prix, stock)
    res.json(produitDao.save(produit))
});

// afficher un produit par son id
produits.get('/:produitId', (req, res) => {
    let produit = produitDao.findById(req.params.produitId);

    if(produit === undefined) {
        res.status(404).json({code: 404, message: "aucun produit trouvé avec cet id"})
    }

    res.json(produit)
});

export default produits