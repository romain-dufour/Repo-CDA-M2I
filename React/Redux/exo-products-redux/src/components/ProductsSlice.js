import { createSlice } from "@reduxjs/toolkit"

const productsSlice = createSlice({
    name: "product",
    initialState: {
        products: []
    },
    reducers: {
        addProduct: (state, action) => {
            const newProduct = {
                id: Date.now(),
                name: action.payload.name,
                price: action.payload.price,
            }
            state.products.push(newProduct)
        },
        deleteProduct: (state, action) => {
            state.products = state.products.filter(product => product.id !== action.payload)
        },
        updateProductDetail: (state, action) => {
            const index = state.products.findIndex(product => product.id === action.payload.id)
            if (index != -1) {
                state.products[index] = action.payload
            }
        },
    }
})

export const { addProduct, deleteProduct, updateProductDetail } = productsSlice.actions
export default productsSlice.reducer
