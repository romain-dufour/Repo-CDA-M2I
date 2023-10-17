import { useDispatch } from "react-redux"
import { deleteProduct, updateProductDetail } from "./ProductsSlice"
import { useRef, useState } from "react"


const ProductItem = (props) => {
    const product = props.product
    const [update, setUpdate] = useState(false)
    const dispatch = useDispatch()
    const nameRef = useRef()
    const priceRef = useRef()


    const updateProductHandler = (event) => {
        event.preventdefault

        const newName = nameRef.current.value
        const newPrice = priceRef.current.value

        const updatedProduct = {
            id : product.id,
            name : newName,
            price : newPrice
        }

        dispatch(updateProductDetail(updatedProduct))
        setUpdate(!update)
    }

    return (
        <>
            {
                update ?

                    <tr>
                        <td><input type="text" placeholder={product.name} className="form-control"  ref={nameRef} defaultValue={product.name}/></td>
                        <td><input type="text" placeholder={product.price} className="form-control" ref={priceRef} defaultValue={product.price}/></td>
                        <td>
                            <button onClick={updateProductHandler} className=" btn btn-success me-1">Valider</button>
                            <button onClick={() => setUpdate(!update)} className=" btn btn-danger">Annuler</button>
                        </td>
                        {/* <td style={{ width: "20%" }}>{product.name}</td>
                        <td style={{ width: "20%" }}>{product.price} €</td>
                        <td style={{ width: "60%" }}>
                            <button
                                onClick={() => dispatch(updateProductDetail(product.id))}
                                className="btn btn-primary me-2"
                            >
                                Modifier le produit
                            </button>
                            <button
                                onClick={() => dispatch(deleteProduct(product.id))}
                                className="btn btn-danger"
                            >
                                Supprimer
                            </button>
                        </td> */}
                    </tr >
                    :
                    <tr>
                        <td>{product.name}</td>
                        <td>{product.price} €</td>
                        <td>
                            <button onClick={() => setUpdate(!update)} className=" btn btn-warning me-1">Modifier</button>
                            <button onClick={() =>dispatch(deleteProduct(product.id))} className="btn btn-warning">Supprimer</button>
                        </td>
                    </tr>

            }

        </>

    )

}

export default ProductItem