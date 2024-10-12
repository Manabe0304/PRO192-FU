import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        
        // **Adding coffees**
        Coffee coffee1 = new Coffee("Espresso", 2, 10);
        Coffee coffee2 = new Coffee("Latte", 12, 15);
        Coffee.addCoffee(coffees, coffee1);
        Coffee.addCoffee(coffees, coffee2);
        
        // **Sorting coffees by price**
        Coffee.sortCoffeesByPrice(coffees);
        System.out.println("Sorted Coffees by Price:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Price: " + coffee.getPrice());
        }
        
        // **Updating a coffee's price**
        Coffee.updatePrice(coffees, "Espresso", 12);
        System.out.println("Updated Espresso price:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Price: " + coffee.getPrice());
        }
        
        // **Removing a coffee**
        Coffee.removeCoffee(coffees, "Latte");
        System.out.println("After removing Latte:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Price: " + coffee.getPrice());
        }
        
        // **Finding a coffee**
        Coffee foundCoffee = Coffee.findCoffeeByName(coffees, "Espresso");
        if (foundCoffee != null) {
            System.out.println("Found Coffee: " + foundCoffee.getName() + " - Price: " + foundCoffee.getPrice());
        } else {
            System.out.println("Coffee not found!");
        }
    }
}
