
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int greatestNumber = 0; 
        int i = 0; 
        
        while (i <= list.size()-1) {
            if (list.get(i) > greatestNumber) {
                greatestNumber = list.get(i);
                i++;
            } else {
                i++;
            }
        }

        System.out.println("The greatest number: " + greatestNumber);
        // implement finding the greatest number in the list here
    }
}
