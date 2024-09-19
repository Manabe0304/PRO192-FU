/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
public class BankAccount {
    // Attribute
    private double balance;
    
    // Constructor
    public BankAccount(double balance) {
        // Your code here
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        // Your code here
         if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        // Your code here
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    
    // Method to transfer money to another account
    public void transfer(BankAccount other, double amount) {
        // Your code here
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);  // Withdraw from the current account
            other.deposit(amount);  // Deposit to the other account
        } else {
            System.out.println("Transfer failed: insufficient funds or invalid amount.");
        }
    }
    // Method to get the balance
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);
        
        // Transfer money from account1 to account2
        account1.transfer(account2, 200);
        
        // Print the new balances (Hint: create a method to get the balance)
        System.out.println("Account 1 Balance: " + account1.balance); // Use accessor method
        System.out.println("Account 2 Balance: " + account2.balance); // Use accessor method
    }
}
