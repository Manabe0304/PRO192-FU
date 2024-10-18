/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Order {
    private int orderId;
    private String productName;
    private int quantity;

    // Constructor
    public Order(int orderId, String productName, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Getter for orderId
    public int getOrderId() {
        return orderId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Override toString to display order details
    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Product Name: " + productName + ", Quantity: " + quantity;
    }
}
