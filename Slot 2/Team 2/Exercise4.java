package Q4;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (1-7): ");
        int n = sc.nextInt();
        
        if (n < 1 || n > 7) {
            System.out.println("Vui long nhap lai n tu 1-7!");
            System.out.print("Nhap n (1-7): ");
            n = sc.nextInt();
        }
        switch(n) {
            case(1): 
                System.out.print("Monday");
                break;
            case(2): 
                System.out.print("Tuesday");
                break;
            case(3): 
                System.out.print("Wednesday");
                break;
            case(4): 
                System.out.print("Thursday");
                break;
            case(5): 
                System.out.print("Friday");
                break;
            case(6): 
                System.out.print("Saturday");
                break;
            case(7): 
                System.out.print("Sunday");
                break;
        }
        sc.close();
    }
}
