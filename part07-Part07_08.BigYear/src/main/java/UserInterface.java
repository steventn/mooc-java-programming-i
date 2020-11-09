/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdActions birdActions;
    
    public UserInterface(Scanner scanner, BirdActions birdActions) {
        this.scanner = scanner; 
        this.birdActions = birdActions;
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            inputActions(input, scanner);
        }
    }
    
    public void inputActions(String input, Scanner scanner) {
        if (input.equalsIgnoreCase("Add")) {
            this.addBird(scanner);
            
        } else if (input.equalsIgnoreCase("Observation")) {
            this.addBirdObservation(scanner);
            
        } else if (input.equalsIgnoreCase("All")) {
            this.printAll();
            
        } else if (input.equalsIgnoreCase("One")) {
            this.printOne(scanner);
            
        } else {
            System.out.println("Invalid command");
        }
    }
    
    public void addBird(Scanner scanner) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String nameLatin = scanner.nextLine();
        this.birdActions.add(name, nameLatin);
    }
    
    public void addBirdObservation(Scanner scanner) {
        System.out.println("Bird?");
        String bird = scanner.nextLine();
        this.birdActions.addBirdObservation(bird);      
    }
    
    public void printAll() {
        this.birdActions.printAllBirds();
    }
    
    public void printOne(Scanner scanner) {
        System.out.println("Bird?");
        String bird = scanner.nextLine();
        this.birdActions.printOne(bird);    
    }
 
}
