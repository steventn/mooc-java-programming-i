
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
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("stop")) {
            return;
        }
        if (command.equals("add")) {
            System.out.println("To add: ");
            String addWord = scanner.nextLine();
            todoList.add(addWord);
        } 
        if (command.equals("list")) {
            todoList.print();
        }
        if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            int removeTask = Integer.valueOf(scanner.nextLine());
            todoList.remove(removeTask);
        }
    }
}
