import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-icons/font/bootstrap-icons.min.css'
import Menu from '../components/Navbar'
// import DisplayArticles from '../components/DisplayArticles'
import { Link } from "react-router-dom"
import { useEffect, useState } from 'react'
import axios from 'axios'



function Home() {
    const[produits, setProduits] = useState([])

    useEffect(() => {
        axios.get("http://localhost:5000/produits")
        .then(response =>{
            setProduits(prev =>[...response.data])
        })
    },[])

    console.log(produits);

    return (
        <>

            <Menu />
            <br />
            <h5>Ci dessous nos articles disponibles : </h5>
            <br />
            <ul>
                
                    {produits.map((produit) =>(
                        <li key={produit.id}>
                            {produit.nomProduit}
                            <img src={produit.url} alt={produit.nomProduit} />
                            <Link to={`detail-produit/${produit.id}`}> voir le détail </Link>
                        </li>
                    ))}
                
            </ul>

        </>
    )
}

export default Home