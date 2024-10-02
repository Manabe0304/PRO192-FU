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
        // Call the static method to convert 25°C to Fahrenheit
        double temp1 = TemperatureConverter.celsiusToFahrenheit(25);
        System.out.println("25°C in Fahrenheit: " + temp1);

        // Call the static method to convert 0°C to Fahrenheit
        double temp2 = TemperatureConverter.celsiusToFahrenheit(0);
        System.out.println("0°C in Fahrenheit: " + temp2);
    }
}
