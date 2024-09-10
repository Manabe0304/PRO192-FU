package Q1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print("Odd");
        } else {
            System.out.print("Even");
        }
        sc.close();
    }
}
