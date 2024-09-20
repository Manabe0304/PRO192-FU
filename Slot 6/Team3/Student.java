/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Student {

    private String name;
    private String major;
    private double gpa;
    private LocalDate enrollmentDate;

    public Student(String name, String major, double gpa, LocalDate enrollmentDate) {
        this.name = name;
        this.major = major;
        this.enrollmentDate = enrollmentDate;

        updateGPA(gpa);
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public String getDatails() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa + ", Enrollment Date: " + enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public static void main(String[] args) {
        LocalDate enrollmentDate = LocalDate.of(2021, 9, 1);
        Student student = new Student("Alice", "Computer Science", 3.8, enrollmentDate);
        System.out.println(student.getDatails());
        
        student.updateGPA(3.9);
        System.out.println(student.getDatails());
    }
}
