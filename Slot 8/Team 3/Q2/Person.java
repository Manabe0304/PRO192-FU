/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Person {
   // TODO: Define fields: name (String), age (int)
   private String name;
   private int age;
   // TODO: Define constructor Person(String name, int age)
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }
   // TODO: Define getDetails() method
   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }
   
   public String getDetails() {
      return "Name: " + getName() + ", Age: " + getAge();
   }
   // Leave this class empty for now
}
