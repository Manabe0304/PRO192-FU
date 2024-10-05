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
        // Test case for Circle
        System.out.println("Sample 1: Circle Test Case");
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.setRadius(5.0);

        System.out.println("Test getColor(): " + circle.getColor());
        System.out.println("Test getRadius(): " + circle.getRadius());
        System.out.println("Test area(): " + circle.area());
        System.out.println("Test perimeter(): " + circle.perimeter());
        circle.draw();

        // Test case for Rectangle
        System.out.println("\nSample 2: Rectangle Test Case");
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setWidth(4.0);
        rectangle.setHeight(6.0);

        System.out.println("Test getColor(): " + rectangle.getColor());
        System.out.println("Test getWidth(): " + rectangle.getWidth());
        System.out.println("Test getHeight(): " + rectangle.getHeight());
        System.out.println("Test area(): " + rectangle.area());
        System.out.println("Test perimeter(): " + rectangle.perimeter());
        rectangle.draw();
    }
}
