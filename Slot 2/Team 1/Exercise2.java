package Q2;

import java.util.Scanner;

public class Exercise2 {
    public int sum (int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 obj = new Exercise2();
        System.out.print("Nhap a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Tong cua 2 so la: " + obj.sum(a, b));
        sc.close()
    }
}
