// import { useNavigate } from "react-router-dom"
// import React, { useState } from "react";


// function ProtectedRoute (props) {
//     const navigate = useNavigate()

// if(true){
//     return(
//         // <>{props.children}</>
//         navigate("/ajout-produit")
//     )
// }

// }
// export default ProtectedRoute

import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import FormIdentite from "../components/FormIdentite";

const ProtectedRoute = (props) => {
    const navigate = useNavigate();
    const [authenticated, setAuthenticated] = useState(false);

    const checkAuthentication = (identifiant, password) => {
        // Vérifiez ici l'identifiant et le mot de passe, et définissez authenticated à true si l'authentification réussit.
        if (identifiant === "votre_identifiant" && password === "votre_mot_de_passe") {
            setAuthenticated(true);
        }
    };

    const clickNavigate = () => {
        navigate("/")
    }

    if (!authenticated) {
        // L'utilisateur n'est pas authentifié, affichez le formulaire d'authentification
        return (
            <>
                <p className="text-danger">Vous n'avez pas l'autorisation d'accéder à cette page</p>
                <button type="submit" className="btn btn-danger mx-4" onClick={clickNavigate}>Retour à la page d'accueil</button>

                <FormIdentite onAuthenticate={checkAuthentication} />;

            </>

        )
    }

    return <>{props.children}</>;
};

export default ProtectedRoute;
