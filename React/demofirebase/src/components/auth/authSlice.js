import {createSlice} from '@reduxjs/toolkit'

const authSlice = createSlice({
    name: "auth",
    initialState: {
        user: null,
        authMode: "Sign Up"
    },
    reducers: {
        setUser: (state, action) =>{
            state.user = action.payload
        },
        removerUser : (state, action) => {
            state.user = null
            localStorage.removeItem("token")
        },
        setAuthMode : (state, action) => {
            state.authMode = action.payload
        }
    }
})

export const {setUser, setAuthMode, removerUser} = authSlice.actions
export default authSlice.reducer