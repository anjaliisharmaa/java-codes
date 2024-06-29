public class CompoundInterest {
    public static void main(String[] args) {
        // Define the principal amount
        double principal = 1000.0;

        // Define the annual interest rate (in percentage)
        double rate = 5.0;

        // Convert the annual interest rate from percentage to decimal
        rate /= 100.0;

        // Define the time period (in years)
        double time = 2.0;

        // Calculate the compound interest
        double compoundInterest = principal * Math.pow(1 + rate, time) - principal;

        // Display the result
        System.out.println("Principal amount: " + principal);
        System.out.println("Annual interest rate (in percentage): " + rate * 100);
        System.out.println("Time period (in years): " + time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

