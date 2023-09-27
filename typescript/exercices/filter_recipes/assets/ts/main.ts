import {recipes } from "./data/recipes.js";



interface Recipe {
    id?: string;
    name: string;
    servings: number;
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
// let recipeNamed:[] =recipesList[0] 
// console.table(recipeName);

console.log(recipesList[0].name);

let recipeName : string = recipesList[0].name