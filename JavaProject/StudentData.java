import java.io.*;
import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private String stream;
    private double marks;
    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Stream: ");
        stream = scanner.nextLine();
        System.out.print("Enter Marks: ");
        marks = scanner.nextDouble();
    }
    public void writeToFile(FileWriter writer) throws IOException {
        writer.write("Name: " + name + "\n");
        writer.write("Roll Number: " + rollNumber + "\n");
        writer.write("Stream: " + stream + "\n");
        writer.write("Marks: " + marks + "\n");
        writer.write("\n");
    }

    public boolean matchRollNumber(int rollNumber) {
        return this.rollNumber == rollNumber;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Stream: " + stream);
        System.out.println("Marks: " + marks);
    }
}
public class StudentData {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[10];

        // Read details for each student and write to file
        try (FileWriter writer = new FileWriter("students.txt")) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                students[i] = new Student();
                students[i].readDetails();
                students[i].writeToFile(writer);
            }
            System.out.println("Details of 10 students written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Search for a student by roll number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number to search for: ");
        int searchRollNumber = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.matchRollNumber(searchRollNumber)) {
                student.printDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with roll number " + searchRollNumber + " not found.");
        }
    }
}

