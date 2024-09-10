package Q6

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }

        System.out.println(fruits);
    }
}
