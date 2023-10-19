import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import { BASE_DB_URL } from "../../fireBaseConfig";

export const fetchAlbums = createAsyncThunk(
    "AlbumsList/fetchAlbums",
    async () => {
        const response = await fetch(BASE_DB_URL + "/albums.json")
        const data = await response.json()
        const albums = []
        for (const key in data) {
            albums.push({ id: key, ...data[key] })
        }
        return albums

    }
)

export const postAlbums = createAsyncThunk(
    "AlbumsList/postAlbums",
    async (newAlbum) => {
        const token = localStorage.getItem("token")
        const response = await fetch(`${BASE_DB_URL}/albums.json?auth=${token}`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newAlbum)
        })
        const data = await response.json()
        return {
            id: data.name,
            ...newAlbum
        }
    }
)

export const editAlbums = createAsyncThunk(
    "AlbumsList/editAlbums",
    async (newAlbum) => {
        const token = localStorage.getItem("token")
        const response = await fetch(`${BASE_DB_URL}/albums/${newAlbum.id}.json?auth=${token}`, {
            method: "PATCH",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newAlbum)
        })
        const data = await response.json()
        return {
            id: data.name,
            ...newAlbum
        }
    }
)

export const deleteAlbums = createAsyncThunk(
    "AlbumsList/deleteAlbums",
    async (newAlbum) => {
        const response = await fetch(`${BASE_DB_URL}/albums/${newAlbum.id}.json?auth=${token}`, {
            method: "DELETE"
        })
        const data = await response.json()
        return {
            id: data.name,
            ...newAlbum
        }
    }
)


const albumsSlice = createSlice({
    name: "albums",
    initialState: {
        formMode: "",
        selectedAlbum: null,
        albums: []
    },
    reducers: {
        setFormMode: (state, action) => {
            state.formMode = action.payload
        },
        setAlbums: (state, action) => {
            state.albums = action.payload
        },
        setSelectedAlbum: (state, action) => {
            state.selectedAlbum = action.payload
        },

    },

    extraReducers: (builder) => {
        builder.addCase(fetchAlbums.fulfilled, (state, action) => {
            state.albums = action.payload
        })
        builder.addCase(postAlbums.fulfilled, (state, action) => {
            state.albums.push(action.payload)
        })
        builder.addCase(editAlbums.fulfilled, (state, action) => {
            state.albums.push(action.payload)
        })
        builder.addCase(deleteAlbums.fulfilled, (state, action) => {
            state.albums.push(action.payload)
        })
    }
})

export const { setFormMode, setAlbums, setSelectedAlbum } = albumsSlice.actions
export default albumsSlice.reducer