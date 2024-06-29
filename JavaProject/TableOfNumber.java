import java.util.Scanner;
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input from user
        System.out.println("Enter a number:");
        int table = scanner.nextInt();

        //using loop to print table 
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table*i);
        }
    }
    
}
