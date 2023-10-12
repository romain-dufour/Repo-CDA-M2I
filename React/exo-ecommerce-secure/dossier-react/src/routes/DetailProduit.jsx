import axios from "axios"
import { useEffect, useRef, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"
import Menu from "../components/Navbar"



function DetailProduit() {
    const { id } = useParams()
    const [produit, setProduit] = useState([])
    const navigate = useNavigate()
    const btnpanier = useRef()

    useEffect(() => {
        axios.get(`http://localhost:5000/produits/${id}`)
            .then(response => {
                setProduit(response.data)
            })
    }, [id])
    const inputQuantity = useRef()

    const addPanier = () => {
        const panier = JSON.parse(localStorage.getItem("panier"))

        if(panier==[]){
            localStorage.setItem("panier",JSON.stringify({nomProduit:produit.nomProduit,prix: produit.prix, qte :inputQuantity.current.value}))
        }
        else{
            localStorage.setItem(panier,{nomProduit:produit.nomProduit,prix: produit.prix, qte :inputQuantity.current.value})
        }
        btnpanier.current.className = "btn btn-success text-center m-1 d-block"
    }

    const gotoPanier = () => {
        navigate("/panier")
    }

    return (
        <>
<Menu />
        <div className="position-relative">
            <div className="position-absolute top-50 start-50 translate-middle-x">
                <h5>Ci dessous le détail du produit :</h5>
                <ul>
                    <li><strong>{produit.nomProduit}</strong></li>
                    <li>Description du produit : {produit.description}</li>
                    <li>Prix du produit : {produit.prix} € pièce</li>
                </ul>
                <br />
                <label for="quantity">Quantité désirée :</label>
                <input className="mx-4 my-4" type="number" id="quantity" ref={inputQuantity} name="quantity" size={4} min="1" max="100" />
                <br />
                <div>
                    <button className="btn btn-dark text-center" onClick={addPanier}>Ajouter au panier</button>
                    <button className="d-none" ref={btnpanier} onClick={gotoPanier}>Aller au panier</button>
                </div>
            </div>
        </div>
        </>

    )
}

export default DetailProduit