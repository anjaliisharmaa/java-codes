class Complex {
    double real;
    double imaginary;

    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to display the complex number
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        // Create two complex numbers
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(2.0, 1.5);

        // Add the two complex numbers
        Complex sum = num1.add(num2);

        // Display the result
        System.out.print("The sum of ");
        num1.display();
        System.out.print(" and ");
        num2.display();
        System.out.print(" is ");
        sum.display();
    }
}

