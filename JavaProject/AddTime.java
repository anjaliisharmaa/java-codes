import java.util.Scanner;

public class AddTime {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public AddTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two times
    public AddTime add(AddTime other) {
        int totalSeconds = this.toSeconds() + other.toSeconds();
        int addedHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int addedMinutes = remainingSeconds / 60;
        int addedSeconds = remainingSeconds % 60;

        return new AddTime(addedHours, addedMinutes, addedSeconds);
    }

    // Method to convert time to seconds
    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Method to print time
    public void print() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Main method for taking user input and testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for time 1
        System.out.println("Enter time 1 (hours minutes seconds):");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        // Input for time 2
        System.out.println("Enter time 2 (hours minutes seconds):");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        AddTime time1 = new AddTime(hours1, minutes1, seconds1);
        AddTime time2 = new AddTime(hours2, minutes2, seconds2);

        // Calculate and print the sum
        AddTime sum = time1.add(time2);

        System.out.println("Time 1:");
        time1.print();
        System.out.println("Time 2:");
        time2.print();
        System.out.println("Sum:");
        sum.print();

        scanner.close();
    }
}
