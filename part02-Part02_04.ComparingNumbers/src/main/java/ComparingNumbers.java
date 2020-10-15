
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFirst = Integer.valueOf(scanner.nextLine());
        int inputSecond = Integer.valueOf(scanner.nextLine());
        if (inputFirst > inputSecond) {
            System.out.println(inputFirst + " is greater than " + inputSecond + ".");
        } else if (inputFirst < inputSecond) {
            System.out.println(inputFirst + " is smaller than " + inputSecond + ".");
        } else {
            System.out.println(inputFirst + " is equal to " + inputSecond + ".");
        }
    }
}
