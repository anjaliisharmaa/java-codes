import java.util.Scanner;

public class RupeeToPaiseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input of rupee from user
        System.out.println("Enter the amount in rupees");
        int rupee = scanner.nextInt();

        //converting rupee to paise
        int paise = rupee*100;

        System.out.println("The amount in paise is " + paise);

        scanner.close();
    } 
}
