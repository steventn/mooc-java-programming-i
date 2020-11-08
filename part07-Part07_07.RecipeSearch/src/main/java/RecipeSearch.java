
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeFunctions recipeFunctions = new RecipeFunctions();
        
        System.out.println("File to read:");
        String readFile = scanner.nextLine();
        
        try (Scanner fileInput = new Scanner(Paths.get(readFile))) {
            while (fileInput.hasNextLine()) {
                String row = fileInput.nextLine(); 
                recipeFunctions.addToRecipeList(row);
            }
            recipeFunctions.seperateRecipeList();
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Commands: "); 
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
            
        while (true) {
            System.out.println("Enter command: ");
            String commandInput = scanner.nextLine();
            if (commandInput.equals("stop")) {
                break;
            }  
                
            if (commandInput.equals("list")) {
                recipeFunctions.listRecipes();   
            }
                
            if (commandInput.equals("find name")) {
                System.out.println("Searched word:");
                commandInput = scanner.nextLine();
                recipeFunctions.findRecipeName(commandInput);
            }
            
            if (commandInput.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                commandInput = scanner.nextLine();
                recipeFunctions.findRecipeCookingTime(commandInput);
            }
            
            if (commandInput.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                commandInput = scanner.nextLine();
                recipeFunctions.findRecipeIngredient(commandInput);
            }
        }
    }

}
