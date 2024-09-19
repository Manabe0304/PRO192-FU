/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
public class BankAccount2 {
    // Private fields
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    
    // Method to print account details
    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    
    public static void main(String[] args) {
        // Create a BankAccount2 object
        BankAccount2 account = new BankAccount2("123456789", 1000.0);
        
        // Deposit and withdraw operations
        account.deposit(500.0);
        account.withdraw(200.0);
        
        // Print account details
        account.printAccountDetails();
    }
}
