import { useRef } from "react"
import { useNavigate } from "react-router-dom"


const FormIdentite = ({ onAuthenticate }) => {
    const password = useRef()
    const identifiant = useRef()
    const navigate = useNavigate()

    const submitFormHandler = (e) => {
        e.preventDefault()

        const storedLogin = JSON.parse(localStorage.getItem("login"));

        if (storedLogin) {
            const enteredIdentifiant = identifiant.current.value;
            const enteredPassword = password.current.value;

            // Vérifier si l'identifiant et le mot de passe correspondent à ceux du local storage
            if (
                enteredIdentifiant === storedLogin.identite && enteredPassword === storedLogin.mdp
            ) {
                // Authentification réussie, envoyer l'identifiant et le mot de passe
                onAuthenticate(enteredIdentifiant, enteredPassword);
                console.log("coucou");
                navigate("/ajout-produit"); 
                // Rediriger ici après une authentification réussie
            } else {
                alert("Identifiant ou mot de passe incorrect");
            }
        } else {
            alert("Identifiants non trouvés dans le local storage");
        }
    };
    
    const clickNavigate = () =>{
        navigate("/ajout-produit")
    }

    return(

        <>

        <form onSubmit={submitFormHandler} className="m-3">
            <div className="mb-3">
                <label for="identifiant" className="form-label">Identifiant :</label>
                <input type="text" className="form-control" ref={identifiant} id="identifiant" aria-describedby="identifiant" />
            </div>

            <div className="mb-3">
                <label for="password" className="form-label">Mot de passe</label>
                <input type="Password" className="form-control" ref={password} id="password" aria-describedby="password" />
            </div>

            <button type="submit" className="btn btn-success mx-4" onClick={clickNavigate}>Se connecter</button>

        </form>
        </>
    )
}

export default FormIdentite