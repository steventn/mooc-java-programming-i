
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] splitArray = input.split(" ");
            
            for (String splitArray1 : splitArray) {
                if (splitArray1.contains("av")) {
                    System.out.println(splitArray1);
                } 
            }
            
            if (input.equals("")) {
                break;
            }
        }

    }
}
