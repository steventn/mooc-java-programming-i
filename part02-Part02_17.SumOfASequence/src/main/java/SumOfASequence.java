
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        System.out.println("Last number?");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= input; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
