import {createSlice} from '@reduxjs/toolkit'

const recipesSlice = createSlice({
    name:"recipe",
    initialState: {
        formMode: "",
        recipes: [],
        selectedRecipe: null,
        ingredients: [],
        isLoading: false,
        error: null
    },
    reducers:{
        addRecipe : (state, action) => {
            const newRecipe = {
                id : Date.now(),
                title: action.payload.title,
                instructions: action.payload.instructions,
                cookTime: action.payload.cookTime,
                prepTime: action.payload.prepTime,
                ingredients: action.payload.ingredients
            }
        state.recipes.push(newRecipe)    
        },

        deleteRecipe: (state, action) => {
            state.recipes = state.recipes.filter(recipe => recipe.id !== action.payload)
        },
        updateRecipe : (state, action) => {
            const index = state.recipes.findIndex(recipe => recipe.id === action.payload.id)
            if (index != -1) {
                state.recipes[index] = action.payload
            }
        }
    }
})

export const {addRecipe, deleteRecipe, updateRecipe} = recipesSlice.actions
export default recipesSlice.reducer