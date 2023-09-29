import { recipes } from "./data/recipes.js";

const recipeName = document.querySelector("#recipeName") as HTMLElement
const prepTime = document.querySelector("#prepTime") as HTMLElement
const cookTime = document.querySelector("#cookTime") as HTMLElement
const recipeContainer = document.querySelector("#recipeContainer") as HTMLElement

const bntFilter = document.querySelector("#btnFilter") as HTMLButtonElement
const btnRecipe = document.querySelector("#btnRecipe") as HTMLButtonElement
const myModalContainer = document.querySelector("#myModalContainer") as HTMLElement
const editContactClose = document.querySelector("#editContactClose") as HTMLButtonElement


//id de la modal
const modalPrepTime = document.querySelector("#modalPrepTime") as HTMLElement
const modalCookTime = document.querySelector("#modalCookTime") as HTMLElement
const modalServings = document.querySelector("#modalServings") as HTMLElement
const modalIngredients = document.querySelector("#modalIngredients") as HTMLUListElement
const modalIngredientsName = document.querySelector("#modalIngredientsName") as HTMLElement
const modalIngredientsAmount = document.querySelector("#modalIngredientsAmount") as HTMLElement
const modalRecipeName = document.querySelector("#modalRecipeName") as HTMLElement
const modalRecipeInstructions = document.querySelector("#modalRecipeInstructions") as HTMLElement

//id du filter
const preparation_time = document.querySelector("#preparation_time") as HTMLInputElement
const cooking_time = document.querySelector("#cooking_time") as HTMLInputElement



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
  prepTimeNombre : number
  prepCookNombre : number
}

const recipesList: Recipe[] = [];

for (const el in recipes) {

  recipesList.push(recipes[el])

}
// console.table(recipesList);



// creation liste de recette et modal
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

// modalPrepTime.innerHTML = recipesList[i].prepTime ;
// modalCookTime.innerHTML = recipesList[i].cookTime ;
// modalServings.innerHTML = recipesList[i].servings + " servings";
// modalRecipeName.innerHTML = recipesList[i].name;

// --------- FILTER --------------


// a partir du tableau recipesList => faire un filter a chaque range et renvoyer le nouveau tableau sur le filtre suivant
// renvoyer le dernier tableau qui servira pour l'affichage


const recipesList2: Recipe[] = [];

for (const el in recipes) {

  recipesList2.push(recipes[el])

}



// transformer le temps de cuisson et de preparation en nombre pour pouvoir filtrer le tableau avec le max range
for (let key in recipesList2) {
  let tempsPrep :string = recipesList2[key].prepTime
  let tempsPrepNumérique : string = tempsPrep.replace(/\D/g, '');  
  let nombrePrep : number = parseInt(tempsPrepNumérique)

  let tempsCook :string = recipesList2[key].cookTime
  let tempsCookNumérique : string = tempsCook.replace(/\D/g, '');  
  let nombreCook : number = parseInt(tempsCookNumérique)

  recipesList2[key].prepTimeNombre=nombrePrep
  recipesList2[key].prepCookNombre=nombreCook

  
}
// console.table(recipesList2);


// filtre prep time -> creer variable égale au max du range puis filtrer 
// recuperer la valeur du rangevalue

let prepRangeValue : string = preparation_time.value
let prepRangeValueNumber : number = parseInt(prepRangeValue)

let cookRangeValue : string = cooking_time.value
let cookRangeValueNumber : number = parseInt(cookRangeValue)

// for(let key in recipesList2){
//   const preplist :[key] = recipesList2[key].prepTimeNombre

// }
// const preplist :[] = recipesList2[].prepTimeNombre

// const recipesListPrepTimeFilter:[]= recipesList2.prepTimeNombre[].filter((PrepRangeValueNumber)=>recipesList2[key])

const recipesListPrepTimeFilter= recipesList2.filter((arg)=> arg.prepTimeNombre < prepRangeValueNumber)

console.log(prepRangeValue);
console.table(recipesListPrepTimeFilter)