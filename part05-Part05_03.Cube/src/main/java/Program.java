
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.println("Input number");
        int input = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(input);
        System.out.println(cube);
    }
}
