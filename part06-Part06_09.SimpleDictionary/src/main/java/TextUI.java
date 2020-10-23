
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            }
            
            inputCommands(word);
            System.out.println("");
            
        }
        System.out.println("Bye bye!");
    }

    public void inputCommands (String word) {
        if (word.equals("add")) {
            add();
        }else if (word.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("Word:");
        String addedWord = scanner.nextLine();
        System.out.println("Translation");
        String translatedWord = scanner.nextLine();
        this.simpleDictionary.add(addedWord, translatedWord);
    }
    
    public void search() { 
        System.out.println("To be translated: ");
        String searchWord = scanner.nextLine();
        if (this.simpleDictionary.translate(searchWord) == null) {
            System.out.println("Word " + searchWord + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDictionary.translate(searchWord));
        }
        
    }
}
