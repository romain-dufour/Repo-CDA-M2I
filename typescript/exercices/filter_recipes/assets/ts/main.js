import { recipes } from "./data/recipes.js";
const recipesList = [];
for (const el in recipes) {
    recipesList.push(recipes[el]);
}
console.table(recipesList);
// let recipeNamed:[] =recipesList[0] 
// console.table(recipeName);
console.log(recipesList[0].name);
let recipeName = recipesList[0].name;
