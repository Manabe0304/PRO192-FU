import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC(1 or 2): ");
        int choice=sc.nextInt();
        System.out.println("Enter a string: ");
        Scanner sc1=new Scanner(System.in);
        String str=sc1.nextLine();
        MyString obj=new MyString();
        System.out.println();
        System.out.println("OUTPUT: ");
        if(choice==1) System.out.println(obj.f1(str));
        if(choice==2) System.out.println(obj.f2(str));
    }
}
