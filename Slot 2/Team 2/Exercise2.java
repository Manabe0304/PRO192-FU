package Q2;

import java.util.Scanner;

public class Exercise2 {

    public float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 obj = new Exercise2();
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Sum of float: " + obj.sum(a, b));
        sc.close();
    }
}
