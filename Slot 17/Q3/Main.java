import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void dispList(List<Car> t) {
      Iterator var1 = t.iterator();

      while(var1.hasNext()) {
         Car x = (Car)var1.next();
         System.out.printf("(%s,%d) ", x.getMaker(), x.getRate());
      }

      System.out.printf("\r\n");
   }

   public static void addToList(List<Car> t, String[] a, int[] b) {
      int n = a.length;

      for(int i = 0; i < n; ++i) {
         t.add(new Car(a[i], b[i]));
      }

   }

   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      List<Car> t = new ArrayList();
      String[] a1 = new String[]{"A", "B", "C", "D", "E"};
      int[] b1 = new int[]{3, 7, 6, 7, 6};
      String[] a2 = new String[]{"A", "B", "C", "D", "E", "F", "G"};
      int[] b2 = new int[]{6, 2, 9, 17, 8, 17, 2};
      String[] a3 = new String[]{"H", "G", "E", "F", "E", "C", "B", "A"};
      int[] b3 = new int[]{1, 2, 3, 4, 15, 6, 7, 8};
      System.out.print("Add how many elements: ");
      int n = sc.nextInt();
      sc.nextLine();
      String xMaker = "";
      int xRate = false;

      int tc;
      for(tc = 0; tc < n; ++tc) {
         System.out.print("Enter maker: ");
         xMaker = sc.nextLine();
         System.out.print("Enter rate: ");
         int xRate = sc.nextInt();
         sc.nextLine();
         t.add(new Car(xMaker, xRate));
      }

      System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
      tc = sc.nextInt();
      sc.nextLine();
      ICar u = new MyCar();
      switch(tc) {
      case 1:
         addToList(t, a1, b1);
         System.out.println("The list before running f1:");
         dispList(t);
         break;
      case 2:
         addToList(t, a2, b2);
         System.out.println("The list before running f2:");
         dispList(t);
         break;
      case 3:
         addToList(t, a3, b3);
         System.out.println("The list before running f3:");
         dispList(t);
      }

      System.out.printf("OUTPUT:\r\n");
      switch(tc) {
      case 1:
         int count = u.f1(t);
         System.out.printf("%d\r\n", count);
         break;
      case 2:
         u.f2(t);
         dispList(t);
         break;
      case 3:
         u.f3(t);
         dispList(t);
      }

      System.out.println();
   }
}
