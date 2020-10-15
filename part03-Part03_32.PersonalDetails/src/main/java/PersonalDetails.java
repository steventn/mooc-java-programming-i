
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestName = 0; 
        int sumOfYears = 0;
        int count = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            int convertYear = Integer.valueOf(array[1]);
            int convertName = array[0].length();
            sumOfYears += convertYear;
            count++;
            if (convertName > longestName) {
                longestName = convertName;
                name = array[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth year " + (double)sumOfYears / count);

    }
}
