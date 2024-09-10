package Q3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int elementToFind = sc.nextInt();

        // Find the index of the element
        int index = -1; // Default to -1 if not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                index = i + 1;
                break;
            }
        }

        // Print the index of the element if found
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Not found!");
        }

        sc.close();
    }
}
