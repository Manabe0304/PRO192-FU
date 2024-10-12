package Team1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    // Attributes
    private String name;
    private LocalDate birthDate;
    private String email;
    
    // Constructor
    public Person(String name, LocalDate birthDate, String email) {
        // Your code here
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }
    
    // Method to calculate age
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (birthDate != null && !birthDate.isAfter(currentDate)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }    
    }
    
    // Method to check if email is valid
    public boolean isValidEmail() {
        // Your code here
        if (email != null && email.contains("@")) {
            String[] parts = email.split("@");
            if (parts.length == 2 && parts[1].contains(".")) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Create an object of Person class
        Person person1 = new Person("John Doe", LocalDate.of(1990, 5, 15), "john.doe@example.com");
        
        // Print the person's age
        System.out.println("Age: " + person1.getAge());
        
        // Check if the email is valid
        System.out.println("Is email valid? " + person1.isValidEmail());
    }
}
