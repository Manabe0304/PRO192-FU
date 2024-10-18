/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Objects;

public class Employee {
    // Fields
    private int employeeId;
    private String employeeName;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // toString method to print employee details
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName;
    }

    // Override equals() to prevent duplicate entries
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(employeeName, employee.employeeName);
    }

    // Override hashCode() to ensure unique hashing for each employee
    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName);
    }
}
