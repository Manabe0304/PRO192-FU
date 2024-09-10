package Q3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();  
        }
        for (int n : a) {
            System.out.print(n + " "); 
        }
        sc.close();
    }
}
