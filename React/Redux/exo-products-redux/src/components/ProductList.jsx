import { useSelector } from "react-redux"
import ProductItem from "./ProductItem"

const ProductList = () => {
    const products = useSelector(state => state.product.products)
    console.log(products);
    return (
        <>
            <h1>Application de gestion de produits</h1>
            <br />

            <table className="table mt-5" >
                <thead style={{ width: "100%" }}>
                    <tr>
                        <th scope="col" style={{ width: "20%" }}>Nom</th>
                        <th scope="col" style={{ width: "20%" }}>Prix</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody className=" table-group-divider">
                    {
                        products.map((product, index) => (
                            <ProductItem product={product} key={index} />
                        ))
                    }
                </tbody>
            </table>
          
        </>
    );
}

export default ProductList