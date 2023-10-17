import {configureStore} from "@reduxjs/toolkit"
import ProductsSlice from "./components/ProductsSlice"


export default configureStore({
    reducer: {
        product: ProductsSlice,
    }
})