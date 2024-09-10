package Q2;
import java.util.Scanner;

public class Exercise2 {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 obj = new Exercise2();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter two doubles: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println("Sum of integers: " + obj.sum(a, b));
        System.out.println("Sum of doubles: " + obj.sum(c, d));

        sc.close();
    }
}
