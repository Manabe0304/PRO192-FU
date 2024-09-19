/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class Wallet {
    // Attribute
    private double balance;
    
    // Constructor
    public Wallet(double balance) {
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
    
    // Method to transfer money to another wallet
    public void transfer(Wallet other, double amount) {
        if (balance >= amount) {
            this.withdraw(amount); // Implicit parameter
            other.deposit(amount); // Explicit parameter
        }
    }
    
    // Method to get balance
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        // Create two wallet objects
        Wallet wallet1 = new Wallet(1000);
        Wallet wallet2 = new Wallet(500);
        
        // Transfer money from wallet1 to wallet2
        wallet1.transfer(wallet2, 200);
        
        // Print the new balances
        System.out.println("Wallet 1 Balance: " + wallet1.getBalance());
        System.out.println("Wallet 2 Balance: " + wallet2.getBalance());
    }
}
