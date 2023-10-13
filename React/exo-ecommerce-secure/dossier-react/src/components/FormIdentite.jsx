import { useRef } from "react"
import { useNavigate } from "react-router-dom"



const FormIdentite = () => {

    const password = useRef()
    const identifiant = useRef()
    const navigate = useNavigate()

    const submitFormHandler = (e) => {
        e.preventDefault()
    }
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