import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of x
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        // Prompt the user to enter the number of terms (n)
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Initialize the sum variable to store the sum of the series
        double sum = 0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            // Calculate the ith term of the series: 1 / (x^i)
            double term = 1.0 / Math.pow(x, i);
            
            // Add the ith term to the sum
            sum += term;
        }

        // Display the sum of the series
        System.out.println("Sum of the series: " + sum);
    }
}

