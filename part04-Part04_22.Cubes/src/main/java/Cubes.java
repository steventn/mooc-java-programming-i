
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            number = Integer.parseInt(input);
            number *= (number * number);
            System.out.println(number);
            count++;
        }
        
        

    }
}
