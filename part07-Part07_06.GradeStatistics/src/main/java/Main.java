
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister gradesList = new GradeRegister();
        
        System.out.println("Enter points total, -1 stops:");
        
        while (true) {
            String inputGrade = scanner.nextLine();
            int inputGradeInt = Integer.valueOf(inputGrade);
            
            if (inputGradeInt == -1) {
                break;
            }
            if (inputGradeInt < 0 || inputGradeInt > 100) {
                continue;
            }
            gradesList.addPoints(inputGradeInt);
        }
        
        gradesList.pointAverage();
        gradesList.passingAverage();
        gradesList.passPercentage();
       
        System.out.println("Grade distribution:");
        gradesList.printGradeDistribution();
        
    }
}
