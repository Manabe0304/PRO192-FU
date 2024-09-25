public class Account {
    // Attributes for accountNumber and balance
    private String accountNumber;
    private double balance;

    // Constructor to initialize the attributes
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
    }

    // Getters (optional, if needed)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
