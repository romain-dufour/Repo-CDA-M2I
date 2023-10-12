import { createBrowserRouter } from "react-router-dom";
import Home from "./routes/Home";
import DetailProduit from "./routes/DetailProduit";
import Panier from "./routes/Panier";
import FormAjout from "./routes/FormAjout";



const router = createBrowserRouter([
    {
        path : "/",
        element : <Home />
    },
    {
        path : "/detail-produit/:id",
        element : <DetailProduit />
    },
    {
        path : "/panier",
        element : <Panier />
    },
    {
        path : "/ajout-produit",
        element : <FormAjout />
    }
])

export default router