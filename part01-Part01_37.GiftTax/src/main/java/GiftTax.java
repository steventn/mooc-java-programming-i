
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int input = Integer.valueOf(scan.nextLine()); 
        double taxFirst = (100 + (input - 5000) * .08);
        double taxSecond = (1700 + (input - 25000) * .10);
        double taxThird = (4700 + (input - 55000) * .12);
        double taxFourth = (22100 + (input - 200000) * .15);
        double taxFifth = (142100 + (input - 1000000) * .17
                );
        
        if (input < 5000) { 
            System.out.println("No tax!");
        } else if (input < 25000) {
            System.out.println("Tax: " + taxFirst);
        } else if (input < 55000) {
            System.out.println("Tax: " + taxSecond);
        } else if (input < 200000) {
            System.out.println("Tax: " + taxThird);
        } else if (input < 1000000) {
            System.out.println("Tax: " + taxFourth);
        } else {
            System.out.println("Tax: " + taxFifth);
        }
    }
}
