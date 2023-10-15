import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import FormIdentite from "../components/FormIdentite";

const loginStorage = JSON.parse(localStorage.getItem("login")) || {};

console.log(loginStorage);

const votre_identifiant = JSON.stringify(loginStorage.identite);
const votre_mot_de_passe = JSON.stringify(loginStorage.mdp);

console.log(votre_mot_de_passe);

console.log(votre_identifiant);

const ProtectedRoute = (props) => {
    const navigate = useNavigate();
    const [authenticated, setAuthenticated] = useState(false);

    const checkAuthentication = (identifiant, password) => {
        if (identifiant=== votre_identifiant && password === votre_mot_de_passe) {
            setAuthenticated(true);
        }
    };

    const clickNavigate = () => {
        navigate("/")
    }

    if (!authenticated) {
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
