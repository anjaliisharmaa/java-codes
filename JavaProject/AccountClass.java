import java.util.Scanner;

class Account {
    protected int accNumber;
    protected String accType;
    protected String holderName;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Account Type: ");
        accType = scanner.nextLine();
        System.out.print("Enter Holder's Name: ");
        holderName = scanner.nextLine();
    }

    public void print() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Holder's Name: " + holderName);
    }
}

class SavingsAccount extends Account {
    private double balance;
    private double interestRate = 0.10;

    public void updateBalance(double amount) {
        balance += amount;
        balance += balance * interestRate;
    }

    public void print() {
        super.print();
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    private double balance;
    private int numTransactions = 0;
    private static final double TRANSACTION_FEE = 1500;

    public void updateBalance(double amount) {
        balance += amount;
        numTransactions++;
        if (numTransactions > 30) {
            balance -= TRANSACTION_FEE;
        }
    }

    public void print() {
        super.print();
        System.out.println("Balance: " + balance);
        System.out.println("Number of Transactions: " + numTransactions);
    }
}

public class AccountClass {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        
        for (int i = 0; i < 5; i++) {
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.read();
            savingsAccount.updateBalance(1000); // Example initial balance
            accounts[i] = savingsAccount;
        }
        
        for (int i = 5; i < 10; i++) {
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.read();
            currentAccount.updateBalance(1000); // Example initial balance
            accounts[i] = currentAccount;
        }
        
        // Printing all accounts
        for (int i = 0; i < 10; i++) {
            System.out.println("Account " + (i + 1) + ":");
            accounts[i].print();
            System.out.println();
        }
    }
}
