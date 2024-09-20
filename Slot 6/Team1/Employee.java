/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Employee {
    private String name;
    private String position;
    private double salary;
    private LocalDate hireDate;
    
    public Employee(String name, String position, double salary, LocalDate hireDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    
    public double getAnnualSalary() {
        return salary * 12;
    }
    public void giveRaisse(double percentage) {
        if (percentage > 0) {
            this.salary = this.salary * (1 + percentage / 100);
        }
    }
    
    public String getDetails() {
        return "Name: " +name + ", Position: " + position + ", Monthly Salary: "
                                   + salary + ", Hire Date: " + hireDate;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2020, 1, 15);
        Employee employee = new Employee("Alice", "Developer", 5000, hireDate);
        
        System.out.println(employee.getDetails());
        
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        
        employee.giveRaisse(10);
        System.out.println(employee.getDetails());
    }
}
