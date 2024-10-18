/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Customer {
    // Fields
    private int customerId;
    private String customerName;

    // Constructor
    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    // Getter for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Override toString method to return customer details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName;
    }
}
