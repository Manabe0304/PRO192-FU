/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create an Account object
        Account account = new Account("123456789", 5000.00);
        
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", 10000.00, 3.5);
        
        // Call displayAccountInfo method for the account
        account.displayAccountInfo();
        
        // Call displayAccountInfo method for the savings account
        savingsAccount.displayAccountInfo();
    } 
}
