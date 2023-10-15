import { createBrowserRouter,redirect } from "react-router-dom";
import Home from "./routes/Home";
import DetailProduit from "./routes/DetailProduit";
import Panier from "./routes/Panier";
import FormAjout from "./routes/FormAjout";
import FormIdentite from "./components/FormIdentite";


const authCheck = () => {
    const id = localStorage.getItem('id')
    const mdp = localStorage.getItem('')

    if(id === "Admin"){
        return (true)
    }else {
        return redirect("/panier")
    }
}


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
        element : <FormAjout />,
        loader : () => authCheck("Admin","mdp")
    }
])

export default router