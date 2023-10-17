import { useRef, useState } from "react"
import { useDispatch } from "react-redux"
import { addProduct, updateProductDetail } from "./ProductsSlice";
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-icons/font/bootstrap-icons.min.css'



const AddProduct = () => {
    const textRef = useRef()
    const priceRef = useRef()
    const dispatch = useDispatch()

    const handleSubmit = (event) => {
        event.preventDefault()
        dispatch(addProduct(
            {
                name : textRef.current.value,
                price : priceRef.current.value
            }
        ))
            // dispatch(updateProductDetail(
            //         textRef.current.value = name,
            //         priceRef.current.value = price,
                
            // ))
        textRef.current.value = ""
        priceRef.current.value = ""
    }

    return (
        
        <>
  <h3 className="text-center">Ajouter un produit</h3>
  <div className="d-flex justify-content-center">
    <form onSubmit={handleSubmit} style={{ width: "80%" }}>
      <div className="mb-3">
        <label htmlFor="Nom du produit" className="form-label"></label>
        <input
          type="text"
          className="form-control"
          placeholder="Ajouter un produit"
          ref={textRef}
          required
        />
      </div>
      <div className="mb-3">
        <label htmlFor="Prix du produit" className="form-label"></label>
        <input
          type="number"
          min={0}
          className="form-control"
          ref={priceRef}
          required
        />
      </div>
      <button className="btn btn-success">Submit</button>
    </form>
  </div>
</>
    );
}

export default AddProduct