
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String name = "";
        int converter = 0;
        
        while (true) {
            String input = scanner.nextLine(); 
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(","); 
            converter = Integer.valueOf(array[1]); 
            if (converter > longest) {
                longest = converter;
                name = array[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}
