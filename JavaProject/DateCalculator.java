import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateString = scanner.nextLine();

        // Parse the entered date string into a LocalDate object
        LocalDate date = LocalDate.parse(dateString);

        // Calculate previous date
        LocalDate previousDate = date.minusDays(1);

        // Calculate next date
        LocalDate nextDate = date.plusDays(1);

        // Calculate the number of days between the entered date and today's date
        LocalDate today = LocalDate.now();
        long daysDifference = Math.abs(today.toEpochDay() - date.toEpochDay());

        // Close the Scanner object
        scanner.close();

        // Display the results
        System.out.println("Entered date: " + date);
        System.out.println("Previous date: " + previousDate);
        System.out.println("Next date: " + nextDate);
        System.out.println("Number of days from today: " + daysDifference);
    }
}
 
