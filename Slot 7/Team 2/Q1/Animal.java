public class Animal {
    // Add attributes for name and age
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Animal(String name, int age) {
        // Constructor body
        this.name = name;
        this.age = age;
    }

    // Method to make the animal sound
    public void makeSound() {
        // Method to be completed
        System.out.println("Animal: " + name + ", Age: " + age + ", is making a sound.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
