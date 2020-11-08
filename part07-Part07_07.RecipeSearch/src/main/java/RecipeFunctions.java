
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class RecipeFunctions {
    
    private ArrayList<String> recipeList; 
    private ArrayList<Integer> recipeCookingTime;
    private ArrayList<String> recipeTitles;
    
    public RecipeFunctions () {
        this.recipeList = new ArrayList<>();
        this.recipeCookingTime = new ArrayList<>();
        this.recipeTitles = new ArrayList<>();
    }
    
    public void addToRecipeList (String recipe) {
        recipeList.add(recipe);
    }
    
    public void seperateRecipeList() {
        this.addToRecipeCookingTime();
        this.addToRecipeTitles();
    }
    
    public void addToRecipeCookingTime () {
        recipeCookingTime.add(Integer.valueOf(recipeList.get(1)));
        recipeList.remove(1);
        for (int i = 0; i < recipeList.size (); i++) {
            if (recipeList.get(i).isEmpty()) {
                recipeCookingTime.add(Integer.valueOf(recipeList.get(i+2)));
                recipeList.remove(i+2);
            }
        }
    }
    
    public void addToRecipeTitles () {
        recipeTitles.add(recipeList.get(0));
        for (int i = 0; i < recipeList.size (); i++) {
            if (recipeList.get(i).isEmpty()) {
                recipeTitles.add(recipeList.get(i+1));
            }
        }
    }
    
    public void printRecipe(int indexTitle, int indexCookTime) {
        System.out.println(recipeTitles.get(indexTitle) + ", cooking time: " + recipeCookingTime.get(indexCookTime));
    }
    
    public void listRecipes () {
        System.out.println("Recipes:");
        for (int i = 0; i < recipeCookingTime.size(); i++) {
            this.printRecipe(i, i);
        }
    }
    
    public void findRecipeName (String name) {
        for (String recipe: recipeTitles) {
            if (recipe.contains(name)) {
                this.printRecipe(recipeTitles.indexOf(recipe), recipeTitles.indexOf(recipe));
            }
        }
    }
    
    public void findRecipeCookingTime (String time) {
        int cookingInputTime = Integer.valueOf(time);
        for (int cookingTime: recipeCookingTime) {
            if (cookingTime <= cookingInputTime) {
                this.printRecipe(recipeCookingTime.indexOf(cookingTime), recipeCookingTime.indexOf(cookingTime));
            }
        }
    }
    
    public void findRecipeIngredient (String name) {
        for (String ingredient: recipeList) {
            if (ingredient.equals(name)) {
                if (recipeList.indexOf(ingredient) >= 0 && recipeList.indexOf(ingredient) < 6) {
                    this.printRecipe(0,0);
                }
                if (recipeList.indexOf(ingredient) >= 7 && recipeList.indexOf(ingredient) < 10) {
                    this.printRecipe(1,1);
                }
                if (recipeList.indexOf(ingredient) > 10) {
                    this.printRecipe(2,2);
                } 
            }
        }
    }
    
}
