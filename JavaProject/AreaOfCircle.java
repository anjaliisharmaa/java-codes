import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompting the user to enter radius of circle
        System.out.println("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        //calculating the area of circle
        double area = 3.14*radius*radius;

        //displaying the area of the circle
        System.out.println("The area of circle is " + area);
        scanner.close();
    }  
}
