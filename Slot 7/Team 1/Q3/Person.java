public class Person {
    // Attributes for name and age
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Person Name: " + name + " | Age: " + age);
    }

    // Getters (optional, if needed)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
