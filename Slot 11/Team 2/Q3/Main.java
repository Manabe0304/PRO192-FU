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
        // Test case for Smartphone
        System.out.println("Sample 1: Smartphone Test Case");
        Smartphone phone = new Smartphone();
        phone.setBrand("Apple");
        phone.setModel("iPhone 12");
        phone.setScreenSize(6.1);

        System.out.println("Test getBrand(): " + phone.getBrand());
        System.out.println("Test getModel(): " + phone.getModel());
        System.out.println("Test getScreenSize(): " + phone.getScreenSize());
        phone.deviceInfo();
        phone.connect();
        phone.disconnect();

        // Test case for Laptop
        System.out.println("\nSample 2: Laptop Test Case");
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("XPS 13");
        laptop.setBatteryLife(10);

        System.out.println("Test getBrand(): " + laptop.getBrand());
        System.out.println("Test getModel(): " + laptop.getModel());
        System.out.println("Test getBatteryLife(): " + laptop.getBatteryLife());
        laptop.deviceInfo();
        laptop.connect();
        laptop.disconnect();
    }
}
