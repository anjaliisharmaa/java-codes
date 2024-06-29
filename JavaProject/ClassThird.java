import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String color;
    protected String type;
    protected double weight;

    // Method to read vehicle details
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = scanner.nextLine();
        System.out.print("Enter type: ");
        type = scanner.nextLine();
        System.out.print("Enter weight: ");
        weight = scanner.nextDouble();
    }

    // Method to print vehicle details
    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
    }
}

// Derived class Car
class Car extends Vehicle {
    private String model;
    private String engine;
    private int numberOfSeats;

    // Method to read car details
    @Override
    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        model = scanner.nextLine();
        System.out.print("Enter engine: ");
        engine = scanner.nextLine();
        System.out.print("Enter number of seats: ");
        numberOfSeats = scanner.nextInt();
    }

    // Method to print car details
    @Override
    public void print() {
        super.print();
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}

// Derived class Bike
class Bike extends Vehicle {
    private String engineType;
    private String tyreType;

    // Method to read bike details
    @Override
    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter engine type: ");
        engineType = scanner.nextLine();
        System.out.print("Enter tyre type: ");
        tyreType = scanner.nextLine();
    }

    // Method to print bike details
    @Override
    public void print() {
        super.print();
        System.out.println("Engine type: " + engineType);
        System.out.println("Tyre type: " + tyreType);
    }
}

public class ClassThird {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Enter details for Car:");
        car.read();
        System.out.println("\nCar details:");
        car.print();

        System.out.println();

        Bike bike = new Bike();
        System.out.println("\nEnter details for Bike:");
        bike.read();
        System.out.println("\nBike details:");
        bike.print();
    }
}

