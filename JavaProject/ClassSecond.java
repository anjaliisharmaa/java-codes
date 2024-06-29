import java.util.Scanner;

// Base class Employee
class Employee {
    private String name;
    private String address;
    private int age;
    private char gender;

    // Constructor to initialize employee details
    public Employee(String name, String address, int age, char gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived class FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double salary;
    private String designation;

    // Constructor to initialize full time employee details
    public FullTimeEmployee(String name, String address, int age, char gender, double salary, String designation) {
        super(name, address, age, gender);
        this.salary = salary;
        this.designation = designation;
    }

    // Method to display full time employee details
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

// Derived class PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double workHours;
    private double ratePerHour;

    // Constructor to initialize part time employee details
    public PartTimeEmployee(String name, String address, int age, char gender, double workHours, double ratePerHour) {
        super(name, address, age, gender);
        this.workHours = workHours;
        this.ratePerHour = ratePerHour;
    }

    // Method to calculate and display pay for part time employee
    public void displayPay() {
        super.display();
        double pay = workHours * ratePerHour;
        System.out.println("Pay: " + pay);
    }
}

public class ClassSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for full time employee
        System.out.println("Enter details for Full Time Employee:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, address, age, gender, salary, designation);

        // Input for part time employee
        System.out.println("\nEnter details for Part Time Employee:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Gender (M/F): ");
        gender = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline
        System.out.print("Work Hours: ");
        double workHours = scanner.nextDouble();
        System.out.print("Rate per Hour: ");
        double ratePerHour = scanner.nextDouble();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name, address, age, gender, workHours, ratePerHour);

        // Display details of both employees
        System.out.println("\nDetails of Full Time Employee:");
        fullTimeEmployee.display();

        System.out.println("\nDetails of Part Time Employee:");
        partTimeEmployee.displayPay();
    }
}

