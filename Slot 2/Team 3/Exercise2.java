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
        Exercise2 exercise = new Exercise2();

        System.out.print("Enter two integers: ");
        int intA = sc.nextInt();
        int intB = sc.nextInt();

        System.out.print("Enter two doubles: ");
        double doubleA = sc.nextDouble();
        double doubleB = sc.nextDouble();

        System.out.println("Sum of integers: " + exercise.sum(intA, intB));
        System.out.println("Sum of doubles: " + exercise.sum(doubleA, doubleB));

        sc.close();
    }
}
