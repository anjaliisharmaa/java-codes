// Base class Distance
class Distance {
    private double d1;

    // Constructor
    public Distance(double d1) {
        this.d1 = d1;
    }

    // Getter for d1
    public double getD1() {
        return d1;
    }

    // Method to add two distances
    public Distance add(Distance other) {
        return new Distance(this.d1 + other.d1);
    }

    // Method to subtract two distances
    public Distance subtract(Distance other) {
        return new Distance(this.d1 - other.d1);
    }

    // Method to print distance
    public void print() {
        System.out.println("Distance: " + d1);
    }
}

// Derived class Dinch
class Dinch extends Distance {
    // Constructor
    public Dinch(double d1) {
        super(d1);
    }

    // Override print method to display in inches
    @Override
    public void print() {
        System.out.println("Distance in inches: " + getD1());
    }

    // Override add method to add two distances in inches
    @Override
    public Distance add(Distance other) {
        if (other instanceof Dinch) {
            double sum = this.getD1() + ((Dinch) other).getD1();
            return new Dinch(sum);
        } else if (other instanceof Dmile) {
            double sum = this.getD1() + ((Dmile) other).toInches();
            return new Dinch(sum);
        } else {
            // Handle other types of Distance
            return super.add(other);
        }
    }
    
    // Helper method to convert miles to inches
    private double toInches() {
        return getD1() * 63360; // 1 mile = 63360 inches
    }
}

// Derived class Dmile
class Dmile extends Distance {
    // Constructor
    public Dmile(double d1) {
        super(d1);
    }

    // Override print method to display in miles
    @Override
    public void print() {
        System.out.println("Distance in miles: " + getD1());
    }

    // Override add method to add two distances in miles
    @Override
    public Distance add(Distance other) {
        double sum = this.getD1() + ((Dmile) other).getD1();
        return new Dmile(sum);
    }

    // Helper method to convert miles to inches
    public double toInches() {
        return getD1() * 63360; // 1 mile = 63360 inches
    }
}

public class Main {
    public static void main(String[] args) {
        Distance distance1 = new Distance(10);
        Distance distance2 = new Dinch(20);
        Distance distance3 = new Dmile(5);

        distance1.print(); // Output: Distance: 10.0
        distance2.print(); // Output: Distance in inches: 20.0
        distance3.print(); // Output: Distance in miles: 5.0

        Distance sum1 = distance1.add(distance2);
        Distance sum2 = distance2.add(distance3);

        sum1.print(); // Output: Distance in inches: 30.0
        sum2.print(); // Output: Distance in inches: 20020.0
    }
}
