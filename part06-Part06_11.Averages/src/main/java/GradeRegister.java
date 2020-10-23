
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int grade = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            grade += this.grades.get(i);            
        }
        return grade * (1.0) / this.grades.size();
    }
    
    public double averageOfPoints() {
        if (this.examPoints.isEmpty()) {
            return -1;
        }
        int examPoints = 0;
        for (int i = 0; i < this.examPoints.size(); i++) {
            examPoints += this.examPoints.get(i);
        }
        return examPoints * (1.0) / this.examPoints.size();
    }
}
