/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Teacher extends Person {
   // TODO: Define fields: subject (String), department (String)
   private String subject;
   private String department;
   // TODO: Define constructor Teacher(String name, int age, String subject, String department)
   public Teacher(String name, int age, String subject, String department) {
      super(name, age);
      this.subject = subject;
      this.department = department;
   }
   // TODO: Override getDetails() method
   public String getSubject() {
      return subject;
   }

   public String getDepartment() {
      return department;
   }
   
   @Override
   public String getDetails() {
      return super.getDetails() + ", Subject: " + subject + ", Department: " + department;
   }
   // Leave this class empty for now
}
