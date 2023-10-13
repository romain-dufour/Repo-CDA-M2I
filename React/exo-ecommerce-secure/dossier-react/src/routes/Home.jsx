// import 'bootstrap/dist/css/bootstrap.min.css'
// import 'bootstrap-icons/font/bootstrap-icons.min.css'
// import Menu from '../components/Navbar'
// // import DisplayArticles from '../components/DisplayArticles'
// import { Link } from "react-router-dom"
// import { useEffect, useState } from 'react'
// import axios from 'axios'



// function Home() {
//     const [produits, setProduits] = useState([])

//     useEffect(() => {
//         axios.get("http://localhost:5000/produits")
//             .then(response => {
//                 setProduits(prev => [...response.data])
//             })
//     }, [])

//     console.log(produits);

 
//     return (
//         <>



//             <Menu />
//             <br />
//             <h5>Ci-dessous nos articles disponibles :</h5>
//             <br />
//             <div className="card-deck">
//                 {produits.map((produit, index) => (
//                     <div key={produit.id} className="card">
//                         <img src={produit.image} className="card-img-top" style={{ maxWidth: "200px", maxHeight: "200px" }} alt={produit.nomProduit} />
//                         <div className="card-body">
//                             <h5 className="card-title">{produit.nomProduit}</h5>
//                             <Link to={`detail-produit/${produit.id}`} className="btn btn-primary">Voir le détail</Link>
//                         </div>
//                     </div>
//                 ))}
//             </div>
//         </>
//     )
// }

// export default Home

import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-icons/font/bootstrap-icons.min.css'
import Menu from '../components/Navbar'
import { Link } from "react-router-dom"
import { useEffect, useState } from 'react'
import axios from 'axios'

function Home() {
    const [produits, setProduits] = useState([])

    useEffect(() => {
        axios.get("http://localhost:5000/produits")
            .then(response => {
                setProduits(prev => [...response.data])
            })
    }, [])

    return (
        <>
            <Menu />
            <div className="container mt-4 bg-secondary">
                <h2 className="text-center text-white">Bienvenue dans notre boutique en ligne</h2>
                <div className="row">
                    {produits.map(produit => (
                        <div key={produit.id} className="col-md-4">
                            <div className="card mb-4">
                                <img src={produit.image} className="card-img-top" alt={produit.nomProduit} style={{ height: "250px" }} />
                                <div className="card-body">
                                    <h5 className="card-title">{produit.nomProduit}</h5>
                                    <p className="card-text">Prix : {produit.prix} €</p>
                                    <Link to={`detail-produit/${produit.id}`} className="btn btn-primary">Voir le détail</Link>
                                </div>
                            </div>
                        </div>
                    ))}
                </div>
            </div>
        </>
    )
}

export default Home
