import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import { SIGN_IN_URL, SIGN_UP_URL } from "../../fireBaseConfig";

export const signInAction = createAsyncThunk(
    "auth/signInAction",
    async (credentials) => {
        const response = await fetch(SIGN_IN_URL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(credentials)
        })
        const data = await response.json()
        localStorage.setItem("token", data.idToken)
        console.log(data);
        return {

            data
        }
    }
)

export const signUpAction = createAsyncThunk(
    "auth/signUpAction",
    async (credentials) => {
        const response = await fetch(SIGN_UP_URL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(credentials)
        })
        const data = await response.json()
        console.log(data);
        localStorage.setItem("token", data.idToken)
        return {
            data
        }
    }
)


const authSlice = createSlice({
    name: "auth",
    initialState: {
        user: null,
        authMode: "Se connecter"
    },
    reducers: {
        setAuthMode: (state, action) => {
            state.authMode = action.payload
        },
        setUser : (state, action) => {
            state.user = action.payload
        },
        removeUser : (state, action) => {
            state.user = null
            localStorage.removeItem("token")
        }
    },

    extraReducers: (builder) => {
        builder.addCase(signInAction.fulfilled, (state, action) => {
            state.user = action.payload
            state.authMode =""

        }),
        builder.addCase(signUpAction.fulfilled, (state, action) => {
            state.user = action.payload
            state.authMode = ""
        })

    }
})
export const { setAuthMode, removeUser } = authSlice.actions
export default authSlice.reducer