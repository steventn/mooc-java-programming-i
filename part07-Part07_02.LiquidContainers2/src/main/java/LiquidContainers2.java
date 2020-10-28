
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();
        System.out.println("");
        System.out.println("First: " + containerOne);
        System.out.println("Second: " + containerTwo);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.contains("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                containerOne.add(value);
            }

            if (command.equals("move")) {
                if (value >= containerOne.contains()) {
                    System.out.println("first if of move command");
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(containerOne.contains());
                } else {
                    System.out.println("second if of move command");
                    containerOne.remove(value);
                    containerTwo.add(value);
                }
            }

            if (command.equals("remove")) {
                containerTwo.remove(value);
            }
            System.out.println("");
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);
        }
    }

}
