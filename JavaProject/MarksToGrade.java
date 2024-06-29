import java.util.Scanner;

public class MarksToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input of marks from user
        System.out.println("Enter marks");
        double marks = scanner.nextDouble();
        
        //conditions for grades
        if (marks >= 85 && marks <= 100) {
            System.out.println("Grade is A.");
        }
        if (marks >= 70 && marks < 85) {
            System.out.println("Grade is B.");
        }
        if (marks >= 60 && marks < 70) {
            System.out.println("Grade is C.");
        }
        if (marks >= 50 && marks < 60) {
            System.out.println("Grade is D.");
        }
        if (marks < 50) {
            System.out.println("Failed");
            scanner.close();
        }
    }
    
}
