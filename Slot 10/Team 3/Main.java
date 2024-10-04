/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a MyString object
        MyString myString = new MyString();

        // Input the string
        System.out.print("Enter the string: ");
        String inputString = sc.nextLine();

        // Test f1() method
        System.out.println("1. Test f1()");
        System.out.println("Input: " + inputString);
        int resultF1 = myString.f1(inputString);
        System.out.println("Output: " + resultF1);

        // Test f2() method
        System.out.println("2. Test f2()");
        System.out.println("Input: " + inputString);
        String resultF2 = myString.f2(inputString);
        System.out.println("Output: " + resultF2);

        sc.close();
    }
}
