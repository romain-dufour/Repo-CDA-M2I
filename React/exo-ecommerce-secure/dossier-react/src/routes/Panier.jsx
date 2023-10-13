import { useNavigate } from "react-router-dom";


function Panier() {
    const navigate = useNavigate()

    const panierStorage = JSON.parse(localStorage.getItem("panier")) || []

    console.log(panierStorage);

    const continueAchats = () => {
        navigate("/")
    }

    const calculerPrixTotal = () => {
        let total = 0;
    
        panierStorage.forEach((item) => {
          total += item.prix * item.qte;
        });
    
        return total;
      }


    return (
        <>
            <div className="position-relative m-4 ">
                <div className="position-absolute top-50 start-50 translate-middle-x">

                    <h5>Liste des articles sélectionnés :</h5>
                    <hr />
                    <ul>
                        {panierStorage.map((item, index) => (
                            <li key={index}>
                                <strong>Nom du Produit:</strong> {item.nomProduit}
                                <br />
                                <strong>Prix:</strong> {item.prix} € pièce
                                <br />
                                <strong>Quantité:</strong> {item.qte}
                                <br />
                            <strong>Prix total produit : {item.qte * item.prix} €</strong>
                                <hr />
                            </li>
                        ))}
                    </ul>
                    <hr />
                    <p><strong>Prix total du panier : {calculerPrixTotal()} €</strong></p>
                    <div className=" p-2">
                        <button className="btn btn-secondary text-center" onClick={continueAchats}>Continuer vos achats</button>
                    </div>
                </div>
            </div>


        </>
    )
}

export default Panier