import { recipes } from "./data/recipes.js";
const recipeName = document.querySelector("#recipeName");
const prepTime = document.querySelector("#prepTime");
const cookTime = document.querySelector("#cookTime");
const recipeContainer = document.querySelector("#recipeContainer");
const bntFilter = document.querySelector("#btnFilter");
const btnRecipe = document.querySelector("#btnRecipe");
const myModalContainer = document.querySelector("#myModalContainer");
const editContactClose = document.querySelector("#editContactClose");
const recipesList = [];
for (const el in recipes) {
    recipesList.push(recipes[el]);
}
console.table(recipesList);
// let recipeNamed:[] =recipesList[0] 
// console.table(recipeName);
console.log(recipesList[0].name);
// let affichageName: string = recipesList[0].name
// let affichageCookingTime: string = recipesList[0].cookTime
// let affichagePrepTime: string = recipesList[0].prepTime
// console.log(affichageName);
// console.log(affichageCookingTime);
// console.log(affichagePrepTime);
// recipeName.innerHTML = affichageName
// prepTime.innerHTML = affichagePrepTime
// cookTime.innerHTML = affichageCookingTime
for (let i = 0; i < recipesList.length; i++) {
    const newbouton = document.createElement("button");
    newbouton.className = "btn btn-outline-light  w-100";
    newbouton.innerHTML +=
        `
<div class="fw-bold fs-4" id="recipeName">${recipesList[i].name}</div>
<hr>
<div class="row">
    <div class="col-6"><i class="bi bi-hourglass-split"></i>
        <span id="prepTime">${recipesList[i].prepTime}</span></div>
    <div class="col-6"><i class="bi bi-fire"></i>
        <span id="cookTime">${recipesList[i].cookTime}</span></div>
</div>
`;
    recipeContainer.appendChild(newbouton);
    modal(newbouton);
}
function modal(arg) {
    arg.addEventListener('click', (e) => {
        myModalContainer.style.display = "block";
        console.log(e);
    });
    editContactClose.addEventListener('click', (e) => {
        myModalContainer.style.display = "none";
        console.log(e);
    });
}
