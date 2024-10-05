/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class TestPerson {
   public static void main(String[] args) {
      // Test 1: Create a Student and print details
      Student s1 = new Student("Alice", 20, "S12345", 3.8);
      System.out.println(s1.getDetails());  // Expected Output: Name: Alice, Age: 20, Student ID: S12345, Average Grade: 3.8

      // Test 2: Create a Teacher and print details
      Teacher t1 = new Teacher("Mr. Brown", 40, "Physics", "Science Department");
      System.out.println(t1.getDetails());  // Expected Output: Name: Mr. Brown, Age: 40, Subject: Physics, Department: Science Department
   }
}
