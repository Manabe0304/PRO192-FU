package Q3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
	for (int i = 0; i < 10; i++) {
             System.out.print("a[" + i + "] = ");
	     arr[i] = sc.nextInt();
	}
		
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
        } 
        System.out.println("Sum of array is: " + sum);
	sc.close();
    }
}
    
