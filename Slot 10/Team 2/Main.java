/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a list of Cala objects (or MyCala if needed)
        List<Cala> calaList = new ArrayList<>();
        // Example initialization (you may change the owner and price for testing)
        calaList.add(new Cala("A1B5", 5));
        calaList.add(new Cala("BC24", 24));
        calaList.add(new Cala("CT3", 3));
        calaList.add(new Cala("D3X4", 4));
        calaList.add(new Cala("2E15", 15));
        calaList.add(new Cala("FY42", 42));

        MyCala myCala = new MyCala(calaList);

        System.out.println("Add how many elements: 0"); // Fixed input for simplicity
        System.out.print("Enter TC(1=f1; 2=f2; 3=f3): ");
        int tc = sc.nextInt();

        switch (tc) {
            case 1:
                System.out.println("The list before running f1: " + calaList);
                System.out.println("OUTPUT: " + myCala.f1());
                break;
            case 2:
                System.out.println("The list before running f2: " + calaList);
                myCala.f2();
                System.out.println("OUTPUT: " + calaList);
                break;
            case 3:
                System.out.println("The list before running f3: " + calaList);
                myCala.f3();
                System.out.println("OUTPUT: " + calaList);
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        sc.close();
    }
}
