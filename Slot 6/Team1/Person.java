/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (birthDate.isAfter(currentDate)) {
            return 0;
        }
        
        return Period.between(birthDate, currentDate).getYears();
    }
    
    public String getDetails() {
        return "Name: " + name + ", Age: "  + getAge();
    }
    
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1998, 5, 15);
        Person person = new Person("John", birthDate);
        
        System.out.println(person.getDetails());
        
        LocalDate futureBirthDate = LocalDate.of(2025, 9, 30);
        Person futurePerson = new Person("Future John", futureBirthDate);
        System.out.println(futurePerson.getDetails());
    }
}
