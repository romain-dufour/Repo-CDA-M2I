import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-icons/font/bootstrap-icons.min.css'
import Menu from '../components/Navbar'
// import DisplayArticles from '../components/DisplayArticles'
import { Link } from "react-router-dom"
import { useEffect, useState } from 'react'
import axios from 'axios'



function Home() {
    const [produits, setProduits] = useState([])
    const [activeIndex, setActiveIndex] = useState(0);

    useEffect(() => {
        axios.get("http://localhost:5000/produits")
            .then(response => {
                setProduits(prev => [...response.data])
            })
    }, [])

    console.log(produits);

    const handleSlide = (index) => {
        setActiveIndex(index);
    }
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

<div id="carouselExample" className="carousel slide text-center" data-bs-ride="carousel">
                <div className="carousel-inner">
                    {produits.map((produit, index) => (
                        <div key={produit.id} className={`carousel-item ${index === activeIndex ? 'active' : ''}`}>
                            <div className="card" style={{ width: '18rem' }}>
                                <img src={produit.url} className="card-img-top" alt={produit.nomProduit} />
                                <div className="card-body">
                                    <h5 className="card-title">{produit.nomProduit}</h5>
                                    <p className="card-text">Description du produit: {produit.description}</p>
                                    <Link to={`detail-produit/${produit.id}`} className="btn btn-primary">Voir le détail</Link>
                                </div>
                            </div>
                        </div>
                    ))}
                </div>
                <a className="carousel-control-prev" href="#carouselExample" role="button" data-bs-slide="prev">
                    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Previous</span>
                </a>
                <a className="carousel-control-next" href="#carouselExample" role="button" data-bs-slide="next">
                    <span className="carousel-control-next-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Next</span>
                </a>
                <ol className="carousel-indicators">
                    {produits.map((_, index) => (
                        <li
                            key={index}
                            data-bs-target="#carouselExample"
                            data-bs-slide-to={index}
                            className={index === activeIndex ? "active" : ""}
                            onClick={() => handleSlide(index)}
                        ></li>
                    ))}
                </ol>
            </div>
            
        </>
    )
}

export default Home