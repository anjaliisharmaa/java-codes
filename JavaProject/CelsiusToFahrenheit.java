import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input form user
        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble(); 

        //converting celsius to fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        //displaying temperature in fahrenheit
        System.out.println("The temperature in Fahrenheit is " + fahrenheit + "F");
        scanner.close();
    }
    
}
