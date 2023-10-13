import { useRef ,useSearchParams} from "react"
import { useNavigate } from "react-router-dom"
import axios from "axios"

function FormAjout() {

    const inputNomproduit = useRef()
    const inputDescriptionproduit = useRef()
    const inputPrixproduit = useRef()
    const inputImageProduit = useRef()
    const[params] = useSearchParams()
    const id = params.get("id")
    const navigate = useNavigate()


    const submitFormHandler = (e) => {
        e.preventDefault()

        axios.post("http://localhost:5000/produits",
        {
            nomProduit : inputNomproduit.current.value, 
            description : inputDescriptionproduit.current.value, 
            image : inputImageProduit.current.value,
            prix : inputPrixproduit.current.value,
        })
        localStorage.clear("login")
        navigate("/")

    }

    return (
        <>

            <form onSubmit={submitFormHandler} className="m-3">
                <div className="mb-3">
                    <label for="nomProduit" className="form-label">Nom du produit :</label>
                    <input type="text" className="form-control" ref={inputNomproduit} id="nomProduit" aria-describedby="nomProduit" />
                </div>

                <div className="form-floating mb-3">
                    <textarea className="form-control" placeholder="Leave a comment here" ref={inputDescriptionproduit} id="floatingTextarea"></textarea>
                    <label for="floatingTextarea">Décrivez le produit</label>
                </div>

                <div className="mb-3">
                    <label for="imageProduit" className="form-label">Image du produit : (insérez un lien Url)</label>
                    <input type="text" className="form-control" ref={inputImageProduit} id="ImageProduit" aria-describedby="ImageProduit" />
                </div>

                <div class="mb-3">
                    <label for="prixproduit" className="form-label">prix du produit :</label>
                    <input type="number" className="form-control" ref={inputPrixproduit} id="prixProduit" aria-describedby="prixproduit" />
                </div>

                <button type="submit" className="btn btn-success mx-4">Ajouter</button>

            </form>



        </>
    )
}

export default FormAjout