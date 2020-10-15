
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            String input = scanner.nextLine();
            String[] array = input.split(" "); 
            
            if (input.equals("")) {
                break;
            }
            int lastNum = array.length - 1;
            System.out.println(array[lastNum]);
        }

    }
}
