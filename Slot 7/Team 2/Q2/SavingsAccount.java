/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SavingsAccount extends Account{
    // Attribute for interest rate
    private double interestRate;

    // Constructor to initialize all attributes, including those of the superclass
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the Account class constructor
        this.interestRate = interestRate;
    }

    // Override the method to display savings account information
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + getAccountNumber() + " | Balance: $" + getBalance() + " | Interest Rate: " + interestRate + "%");
    }

    // Getter for interestRate (optional)
    public double getInterestRate() {
        return interestRate;
    }
}
