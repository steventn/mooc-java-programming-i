
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int outputAdd = first + second;
        int outputSub = first - second;
        int outputMulti = first * second;
        double outputDivide = (double) first / second;
        
        System.out.println(first + " + " + second + " = " + outputAdd);
        System.out.println(first + " - " + second + " = " + outputSub);
        System.out.println(first + " * " + second + " = " + outputMulti);
        System.out.println(first + " / " + second + " = " + outputDivide);
        

    }
}
