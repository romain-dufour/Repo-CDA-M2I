import { useRef } from "react";
import { useDispatch } from "react-redux";

const RecipesForm = (props) => {

    const user = true

    const titleref = useRef()
    const prepTimeref = useRef()
    const cookTimeref = useRef()
    const ingredientsref = useRef()
    const instructionsref = useRef()

    // const dispatch = useDispatch()

    const handleFormSubmit = async (event) => {
        event.preventDefault()

        const newRecipe = {
            id: Date.now(),
            title: titleref.current.value,
            instructions: instructionsref.current.value,
            cookTime: +cookTimeref.current.value,
            prepTime: +prepTimeref.current.value,
            ingredients: ingredientsref.current.value

        }

        if(user.idToken) {
            try { 
                const response = await fetch(`${BASE_DB_URL}/recipesList?auth=${user.idToken}`,{
                    method: "POST",
                    headers: {
                        "Content-Type" : "application/json"
                    },
                    body: JSON.stringify(newRecipe)
                })
                if(!response.ok){
                    throw new Error("Something went wrong during the POST request !")
                }

                const data = await response.json()

                console.log(data);
                dispatch(addTask(newRecipe))
            } catch(error) {
                console.error(error.message);
            }
        }
    }


    return (

        <form onSubmit={handleFormSubmit} className="bg-dark text-light rounded m-2 p-4">
            <div>

                <div className="row">
                    <label htmlFor="title" className="col-6">Titre recette :</label>
                    <input type="text" id="title" className="col-6" ref={titleref} />
                </div>
                <div className="row ">
                    <label htmlFor="prepTime" className="col-6">Temps de préparation :</label>
                    <input type="text" id="prepTime" className="col-6" ref={prepTimeref} />
                </div>
                <div className="row ">
                    <label htmlFor="cookTime" className="col-6">Temps de cuisson :</label>
                    <input type="text" id="cookTime" className="col-6" ref={cookTimeref} />
                </div>
            </div>
            <hr />
            <div className="row mx-2">
                <div className="col-4">
                    <p>Ingredients</p>
                    <hr />
                    <ul>
                        <li><input type="text" id="ingredients" ref={ingredientsref} /></li>
                    </ul>
                </div>
                <div className="col-8">
                    <p>Instructions</p>
                    <hr />
                    <input type="text-area" id="instructions" ref={instructionsref} />
                </div>
            </div>
            <hr />
            <button className={`btn btn-success m-2 ${user.idToken ? "d-block" : "d-block" }`}><i class="bi bi-plus-circle"></i>Add</button>
            <div>
                <button className={`btn btn-warning m-2 ${user.idToken ? "d-block" : "d-none" }`}><i className="bi bi-pencil-square"></i>Edit</button>
            </div>
            <div>
                <button className={`btn btn-danger m-2 ${user.idToken ? "d-block" : "d-none" }`}><i className="bi bi-trash3"></i>Delete</button>
            </div>


        </form>








        // <h3 class="text-center">${recipe.name}</h3>
        // <hr>
        // <div class="row g-3">
        //   <div class="col-6 d-flex justify-content-center align-items-center">
        //     <img class="invert-100" src="./assets/img/chef-hat.svg" alt="Chef Hat SVG">
        //     <span>${recipe.prepTime}</span>
        //   </div>
        //   <div class="col-6 d-flex justify-content-center align-items-center">
        //     <img class="invert-100" src="./assets/img/fire.svg" alt="Fire SVG">
        //     <span>${recipe.cookTime}</span>
        //   </div>
        // </div>
    )
}

export default RecipesForm;