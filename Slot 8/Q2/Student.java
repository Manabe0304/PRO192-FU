/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Student extends Person {
   // TODO: Define fields: studentID (String), averageGrade (double)
   private String studentID;
   private double averageGrade;
   // TODO: Define constructor Student(String name, int age, String studentID, double averageGrade)
   public Student(String name, int age, String studentID, double averageGrade) {
      super(name, age); 
      this.studentID = studentID;
      this.averageGrade = averageGrade;
   }
   // TODO: Override getDetails() method
    public String getStudentID() {
        return studentID;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
    
    @Override
    public String getDetails() {
      return super.getDetails() + ", Student ID: " + getStudentID() + ", Average Grade: " + getAverageGrade();
   }
   // Leave this class empty for now
}
