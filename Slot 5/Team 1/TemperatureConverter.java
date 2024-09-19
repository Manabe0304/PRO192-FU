/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
public class TemperatureConverter {
    // Attribute for temperature
    private double temperature;
    
    // Constructor that takes Celsius temperature
    public TemperatureConverter(double celsius) {
        this.temperature = celsius;
    }
    
    // Constructor that takes Fahrenheit temperature
    public TemperatureConverter(boolean isFahrenheit, double fahrenheit) {
        if (isFahrenheit) {
            this.temperature = convertToCelsius(fahrenheit);
        }
    }
    
    // Method to convert Celsius to Fahrenheit
    public double convertToFahrenheit() {
        return temperature * 9 / 5 + 32;
    }
    
    // Method to convert Fahrenheit to Celsius
    public double convertToCelsius() {
        return (temperature - 32) * 5 / 9;
    }
    
    // Static method to convert a given Celsius temperature to Fahrenheit
    public static double convertToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    
    // Static method to convert a given Fahrenheit temperature to Celsius
    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static void main(String[] args) {
        // Using constructor with Celsius
        TemperatureConverter tempC = new TemperatureConverter(25.0);
        System.out.println("25 Celsius to Fahrenheit: " + tempC.convertToFahrenheit());
        
        // Using constructor with Fahrenheit
        TemperatureConverter tempF = new TemperatureConverter(true, 77.0);
        System.out.println("77 Fahrenheit to Celsius: " + tempF.convertToCelsius());
        
        // Using overloaded static methods
        System.out.println("30 Celsius to Fahrenheit: " + TemperatureConverter.convertToFahrenheit(30.0));
        System.out.println("100 Fahrenheit to Celsius: " + TemperatureConverter.convertToCelsius(100.0));
    }
}
