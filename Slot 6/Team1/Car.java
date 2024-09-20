/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void start() {
        System.out.println("The car " + make + " " + model + " has started");
    }
    
    public void stop() {
        System.out.println("The car " + make + " " + model + " has stopped");
    }
    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.start(); 
        myCar.stop();  
        System.out.println(myCar.getDetails()); 
    }
}
