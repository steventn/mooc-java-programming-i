
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class GradeRegister {
    private ArrayList<Integer> gradeList;
    private ArrayList<Integer> pointsList;
    private int totalPoints;
    private int counter; 
    private int passingPoints;
    private int passingCounter;
    
    public GradeRegister() {
        this.gradeList = new ArrayList<>();
        this.pointsList = new ArrayList<>();
    }
    
    public void addPoints(int grade) {
        this.pointsList.add(grade);
        
        if (grade < 50) {
            this.gradeList.add(0);
        } else if (grade < 60) {
            this.gradeList.add(1);
        } else if (grade < 70) {
            this.gradeList.add(2);
        } else if (grade < 80) {
            this.gradeList.add(3);
        } else if (grade < 90) {
            this.gradeList.add(4);
        } else {
            this.gradeList.add(5);
        }
        
        this.counter++;
    }
    
    public int getCounter() {
        return this.counter;
    }
    
    public int addTotalPoints() {
        for (int totalGrades: this.pointsList) {
            totalPoints += totalGrades;
        }
        return totalPoints;
    }
    
    public void pointAverage() {
         double pointAverage = addTotalPoints() / getCounter();
         System.out.println("Point average (all): " + pointAverage);        
    }
    
    public int getPassingCounter() {
        return this.passingCounter;
    }
    
    public int addPassingPoints() {
        for (int passingGrades: this.pointsList) {
            if (passingGrades >= 50) {
                passingPoints += passingGrades;
                passingCounter++;
            }
        }
        if (passingPoints <= 0) {
            return -1;
        }
        return passingPoints;
    }
    
    public void passingAverage() {
        double passingAverage = addPassingPoints() / getPassingCounter();
        if (passingAverage < 0) {
            System.out.println("Points average (passing): " + addPassingPoints());
        }
        System.out.println("Points average (passing): " + passingAverage);
    }
    
    public void passPercentage() {
        double passPercentage = 100.0 * getPassingCounter()/getCounter();
        System.out.println(getPassingCounter());
        System.out.println(getCounter());
        System.out.println("Pass percentage: " + passPercentage);
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int i = 0; i < this.gradeList.size(); i++) {
            if (this.gradeList.get(i) == grade) {
                count++;
            }
        }
        return count;
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    public void printGradeDistribution() {
        for (int grade = 5; grade >= 0; grade--) {
            int stars = numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
        }
    }
}
