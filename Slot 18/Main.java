/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Main {
   public static void main(String[] var0) {
      byte var2 = 10;
      Point var3 = new Point(0.0F, 0.0F);
      Point var4 = new Point(2.0F, 0.0F);
      Point[] var5 = new Point[var2];

      for(int var6 = 0; var6 < var2; ++var6) {
         var5[var6] = new Point((float)var6, 1.0F);
      }

      Col var8 = new Col();
      var8.setListOfPoints(var5);
      var8.setSetOfPAs(var3, var4);
      var8.setMapOfCenters(var3, var4);
      Scanner var7 = new Scanner(System.in);
      System.out.println();
      System.out.println(" 1. Test list Of points: ");
      System.out.println(" 2. Test set of triangle perimeter and area: ");
      System.out.println(" 3. Test map of triangle centers: ");
      System.out.print("    Your selection (1 -> 3): ");
      int var1 = var7.nextInt();
      var7.nextLine();
      switch(var1) {
      case 1:
         System.out.println("List of point: ");
         var8.displayListOfPoints();
         break;
      case 2:
         System.out.println("Set of triangle perimeters and areas:");
         var8.displaySetOfPAs();
         break;
      case 3:
         System.out.println("Map of triangle centers:");
         var8.displayMapOfCenters();
         break;
      default:
         System.out.println("Wrong selection");
      }

      System.out.println();
   }
}
    
