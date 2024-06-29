import java.util.Scanner;
public class ExpressionCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the values of a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        // Close the Scanner object
        scanner.close();
        // Calculate the result of the expression using loops
        double result = calculateExpression(a, b, c);
        // Display the result
        System.out.println("Result of the expression: " + result);
    }
    // Method to calculate the expression (a + (b * c)) / (b - c)
    public static double calculateExpression(double a, double b, double c) {
        double numerator = a + (b * c);
        double denominator = b - c;
        return numerator / denominator;
    }
}
