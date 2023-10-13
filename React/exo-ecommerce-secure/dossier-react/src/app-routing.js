import { createBrowserRouter } from "react-router-dom";
import Home from "./routes/Home";
import DetailProduit from "./routes/DetailProduit";
import Panier from "./routes/Panier";
import FormAjout from "./routes/FormAjout";
import FormIdentite from "./components/FormIdentite";
import ProtectedRoute from "./Services/ProtectedRoute";



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
        path : "/formIdentite",
        element : <FormIdentite />
    },
    {
        path : "/ajout-produit",
        element : <ProtectedRoute><FormAjout /></ProtectedRoute>
    }
])

export default router