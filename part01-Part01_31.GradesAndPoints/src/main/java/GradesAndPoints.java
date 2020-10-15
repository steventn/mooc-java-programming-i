
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int input = Integer.valueOf(scan.nextLine());
        if (input < 0){
            System.out.println("impossible!");
        } else if (input <= 49 && input >= 0) {
            System.out.println("failed");
        } else if (50 <= input && input <= 59) {
            System.out.println("1");
        } else if (60 <= input && input <= 69) {
            System.out.println("2");
        } else if (70 <= input && input <= 79) {
            System.out.println("3");
        } else if (80 <= input && input <= 89) {
            System.out.println("4");
        } else if (90 <= input && input <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
        
    }
}
