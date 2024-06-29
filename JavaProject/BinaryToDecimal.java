import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        // Close the Scanner object
        scanner.close();

        // Convert the binary string to decimal using loops and conditionals
        int decimal = binaryToDecimal(binaryString);

        // Display the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);
    }

    // Method to convert a binary string to decimal
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0;

        // Iterate over the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            // Get the current digit
            char digit = binaryString.charAt(i);

            // Check if the current digit is '1'
            if (digit == '1') {
                // Add the contribution of this digit to the decimal value
                decimal += Math.pow(2, power);
            }

            // Increment the power
            power++;
        }

        return decimal;
    }
}

