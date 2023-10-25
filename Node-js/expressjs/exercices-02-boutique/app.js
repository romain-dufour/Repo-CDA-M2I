import express from "express"
import clients from "./routes/clients.js"
import produits from "./routes/produits.js"
import commandes from "./routes/commandes.js"

const port = 3001;

const app = express();

app.use(express.json());
app.use('/clients', clients);
app.use('/commandes', commandes);
app.use('/produits', produits);

app.listen(port, () => {
    console.log(`http://127.0.0.1:${port}`);
})
    