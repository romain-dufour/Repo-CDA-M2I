import { recipes } from "./data/recipes.js";

const recipeName = document.querySelector("#recipeName") as HTMLElement
const prepTime = document.querySelector("#prepTime") as HTMLElement
const cookTime = document.querySelector("#cookTime") as HTMLElement
const recipeContainer = document.querySelector("#recipeContainer") as HTMLElement

const bntFilter = document.querySelector("#btnFilter") as HTMLButtonElement
const btnRecipe = document.querySelector("#btnRecipe") as HTMLButtonElement
const myModalContainer = document.querySelector("#myModalContainer") as HTMLElement
const editContactClose = document.querySelector("#editContactClose") as HTMLButtonElement

const modalPrepTime = document.querySelector("#modalPrepTime") as HTMLElement
const modalCookTime = document.querySelector("#modalCookTime") as HTMLElement
const modalServings = document.querySelector("#modalServings") as HTMLElement
const modalIngredients = document.querySelector("#modalIngredients") as HTMLUListElement
const modalIngredientsName = document.querySelector("#modalIngredientsName") as HTMLElement
const modalIngredientsAmount = document.querySelector("#modalIngredientsAmount") as HTMLElement
const modalRecipeName = document.querySelector("#modalRecipeName") as HTMLElement
const modalRecipeInstructions = document.querySelector("#modalRecipeInstructions") as HTMLElement


interface Recipe {
  id?: string;
  name: string;
  servings: string;
  prepTime: string;
  cookTime: string;
  ingredients: {
    name: string;
    amount: string;
  }[];
  instructions: string[];
}

const recipesList: Recipe[] = [];

for (const el in recipes) {

  recipesList.push(recipes[el])

}
console.table(recipesList);



// creation 
function displayRecipes(){
  for (let key in recipesList) {

    const newbouton = document.createElement("button")
    newbouton.className = "btn btn-outline-light  w-100"
    newbouton.innerHTML =
      `
  <div class="fw-bold fs-4" id="recipeName">${recipesList[key].name}</div>
  <hr>
  <div class="row">
      <div class="col-6"><i class="bi bi-hourglass-split"></i>
          <span id="prepTime">${recipesList[key].prepTime}</span></div>
      <div class="col-6"><i class="bi bi-fire"></i>
          <span id="cookTime">${recipesList[key].cookTime}</span></div>
  </div>
  `
  recipeContainer.appendChild(newbouton)
  
  newbouton.addEventListener('click', () => {
    myModalContainer.style.display = "block"

  createModal(recipesList.indexOf(recipesList[key]))
  closeModal()
  })
  
  }
}



displayRecipes()
//fonction creation modal
function createModal(a : number) {
  const newModal = document.createElement("div")
newModal.className = "myModal-content"

modalPrepTime.innerHTML = recipesList[a].prepTime ;
modalCookTime.innerHTML = recipesList[a].cookTime ;
modalServings.innerHTML = recipesList[a].servings + " servings";
modalRecipeName.innerHTML = recipesList[a].name;
recipesList[a].ingredients.forEach(element => {
  modalIngredients.innerHTML+=`<li>${element.name} (${element.amount})</li>`
});
recipesList[a].instructions.forEach(element =>{
  modalRecipeInstructions.innerHTML += `<li>${element}</li>` 
})
}

// croix close modal
function closeModal(){
editContactClose.addEventListener('click', (e) => {
  myModalContainer.style.display = "none"
  modalIngredients.innerHTML = ""
  modalRecipeInstructions.innerHTML = ""

})
}

modalPrepTime.innerHTML = recipesList[i].prepTime ;
modalCookTime.innerHTML = recipesList[i].cookTime ;
modalServings.innerHTML = recipesList[i].servings + " servings";
modalRecipeName.innerHTML = recipesList[i].name;


// modalRecipeInstructions.innerHTML = recipesList[i].ingredients[].name




  // addModal(newbouton)



// function createButton (i:number){
//   const newbutton = document.createElement("button")
//   newbutton.className = "btn btn-outline-light  w-100"
//   newbutton.innerHTML +=
//     `
// <div class="fw-bold fs-4" id="recipeName">${recipesList[i].name}</div>
// <hr>
// <div class="row">
//     <div class="col-6"><i class="bi bi-hourglass-split"></i>
//         <span id="prepTime">${recipesList[i].prepTime}</span></div>
//     <div class="col-6"><i class="bi bi-fire"></i>
//         <span id="cookTime">${recipesList[i].cookTime}</span></div>
// </div>
// `
// }

// function modalOpen(arg : HTMLElement) {
//   arg.addEventListener('click', (e) => {
//     myModalContainer.style.display = "block"
//   })

// }
// function modalClose(arg : HTMLElement) {

//   editContactClose.addEventListener('click', (e) => {
//     myModalContainer.style.display = "none"
//   })
// }

// insérer les recettes dans la modal

// function addModal(i){
// modalPrepTime.innerHTML = recipesList[i].prepTime ;
// modalCookTime.innerHTML = recipesList[arg].cookTime ;
// modalServings.innerHTML = recipesList[arg].servings + " servings";
// modalRecipeName.innerHTML = recipesList[arg].name;

// modalRecipeInstructions.innerHTML = recipesList[arg].ingredients[arg].name



// const ingredientsList = recipesList[arg].ingredients.forEach(ingredient => {
//   const newli = document.createElement("li")
//   newli.innerHTML = `
//   ${ingredient.name} (${ingredient.amount})
//   `


  

// modalIngredients.innerHTML += ingredientsList + "1"



// }

