package Q2;

public class Exercise2 {
    public int sum(int a, int b) {
        return a+b;
    }
    public double sum(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Exercise2 obj2 = new Exercise2();
        System.out.println("Sum of 3 and 4 is: " + obj.sum(3, 4));
        System.out.println("Sum of 2.5 and 3.5 is: " + obj2.sum(2.5, 3.5));
    }
}
