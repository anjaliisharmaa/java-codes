public class SwapTwoNumbers {
    public static void main(String[] args) {
        //defining two numbers
        int number1 = 5;
        int number2 = 2;

    //displaying the result before swapping
    System.out.println("The numbers before swapping are:");
    System.out.println("First number - " + number1);
    System.out.println("Second number - " + number2);

    //swapping the numbers
    number1 = number1 + number2;
    number2 = number1 - number2;
    number1 = number1 - number2;

    //displaying result after swapping
    System.out.println("The numbers after swapping are:");
    System.out.println("First number - " + number1 + ", Second number - " + number2); 
    }
}