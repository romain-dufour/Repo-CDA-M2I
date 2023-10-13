// import { useNavigate } from "react-router-dom";


// function Panier() {
//     const navigate = useNavigate()

//     const panierStorage = JSON.parse(localStorage.getItem("panier")) || []

//     console.log(panierStorage);

//     const continueAchats = () => {
//         navigate("/")
//     }

//     const calculerPrixTotal = () => {
//         let total = 0;

//         panierStorage.forEach((item) => {
//             total += item.prix * item.qte;
//         });

//         return total;
//     }

//     const viderPanier = () => {
//         localStorage.removeItem("panier")
//         window.location.reload()
//       };



//     return (
//         <>
//             <div className="position-relative m-4 ">
//                 <div className="position-absolute top-50 start-50 translate-middle-x">

//                     <h5>Liste des articles sélectionnés :</h5>
//                     <hr />
//                     <ul>
//                         {panierStorage.map((item, index) => (
//                             <li key={index}>
//                                 <strong>Nom du Produit:</strong> {item.nomProduit}
//                                 <br />
//                                 <strong>Prix:</strong> {item.prix} € pièce
//                                 <br />
//                                 <strong>Quantité:</strong> {item.qte}
//                                 <br />
//                                 <strong>Prix total produit : {item.qte * item.prix} €</strong>
//                                 <hr />
//                             </li>
//                         ))}
//                     </ul>
//                     <hr />
//                     <p><strong>Prix total du panier : {calculerPrixTotal()} €</strong></p>
//                     <div className=" p-2">
//                         <button className="btn btn-secondary text-center" onClick={continueAchats}>Continuer vos achats</button>
//                     </div>
//                     <div className=" p-2">
//                         <button className="btn btn-danger text-center" onClick={viderPanier}>
//                             Vider le Panier
//                         </button>
//                     </div>

//                 </div>
//             </div>


//         </>
//     )
// }

// export default Panier

import { useNavigate } from "react-router-dom";

function Panier() {
    const navigate = useNavigate();

    const panierStorage = JSON.parse(localStorage.getItem("panier")) || [];

    const calculerPrixTotal = () => {
        let total = 0;

        panierStorage.forEach((item) => {
            total += item.prix * item.qte;
        });

        return total.toFixed(2); // Formatage du total avec deux décimales
    };

    const viderPanier = () => {
        localStorage.removeItem("panier");
        window.location.reload();
    };
    const continueAchats = () => {
        navigate("/")
    }

    return (
        <div className="container mt-4">
            <h3>Votre Panier</h3>
            <hr />

            {panierStorage.length === 0 ? (
                <div className="alert alert-info" role="alert">
                    Votre panier est vide.
                </div>
            ) : (
                <div>
                    {panierStorage.map((item, index) => (
                        <div className="card mb-3" key={index}>
                            <div className="row g-0">
                                <div className="col-md-4">
                                    <img
                                        src={item.image}
                                        alt={item.nomProduit}
                                        className="img-fluid"
                                        style={{ maxWidth: "200px" }}
                                    />
                                </div>
                                <div className="col-md-8">
                                    <div className="card-body">
                                        <h5 className="card-title">{item.nomProduit}</h5>
                                        <p className="card-text">
                                            Prix : {item.prix} € pièce
                                            <br />
                                            Quantité : {item.qte}
                                            <br />
                                            Prix total : {item.qte * item.prix} €
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    ))}

                    <hr />
                    <p className="text-end">
                        <strong>Prix total du panier : {calculerPrixTotal()} €</strong>
                    </p>

                    <div className="text-end">
                        <button className="btn btn-secondary me-2" onClick={viderPanier}>
                            Vider le Panier
                        </button>
                        <button className="btn btn-primary me-2" onClick={() => navigate("/commande")}>
                            Passer la Commande
                        </button>
                        <button className="btn btn-secondary" onClick={continueAchats}>
                            Continuer vos achats
                        </button>

                    </div>
                </div>
            )}
        </div>
    );
}

export default Panier;
