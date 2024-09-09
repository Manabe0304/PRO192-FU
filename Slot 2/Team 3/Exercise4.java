package Q4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();  // Consume the newline character
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            a[i] = sc.nextLine();  
        }
        for (String string : a) {
            System.out.println(string); 
        }
    }
}

