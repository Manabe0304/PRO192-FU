public class Player {
    // Attributes for name and age
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display player information
    public void displayPlayerInfo() {
        System.out.println("Player Name: " + name + " | Age: " + age);
    }

    // Getters (optional, if needed)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
