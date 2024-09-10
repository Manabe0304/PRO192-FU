package Q1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        } while (number != 0);
        
        System.out.println("Loop Exited");
        sc.close();
    }
}
