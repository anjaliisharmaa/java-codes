import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coefficients of the quadratic equation
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Close the Scanner object
        scanner.close();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is positive, negative, or zero
        if (discriminant > 0) {
            // Roots are real and distinct
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // Roots are real and equal
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root: " + root);
        } else {
            // Roots are complex
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
