package org.example;

public class Plat {
    private String name;
    private String[] ingredientList;

    public Plat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(String[] ingredientList) {
        this.ingredientList = ingredientList;
    }

    public void addIngredientInPlat(String newIngredient) {
        if (ingredientList == null) {
            ingredientList = new String[1];
            ingredientList[0] = newIngredient;
        } else {
            // Créez une nouvelle liste avec une taille augmentée de 1
            String[] newIngredientList = new String[ingredientList.length + 1];

            // Copiez les éléments existants dans la nouvelle liste
            System.arraycopy(ingredientList, 0, newIngredientList, 0, ingredientList.length);

            // Ajoutez le nouvel ingrédient à la fin de la nouvelle liste
            newIngredientList[newIngredientList.length - 1] = newIngredient;

            // Remplacez l'ancienne liste par la nouvelle liste
            ingredientList = newIngredientList;
        }
    }
}
