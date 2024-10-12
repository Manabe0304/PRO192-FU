/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        CoffeeCatalog catalog = new CoffeeCatalog();
        
        // Adding SpecCoffees
        SpecCoffee coffee1 = new SpecCoffee("Espresso", 2, 5);
        SpecCoffee coffee2 = new SpecCoffee("Latte", 12, 10);
        
        // Add coffees to the catalog
        catalog.addSpecCoffee(coffee1);
        catalog.addSpecCoffee(coffee2);
        
        // Sorting SpecCoffees alphabetically by name
        catalog.sortSpecCoffeesByName();
        System.out.println("Coffees sorted by name:");
        for (SpecCoffee coffee : catalog.getCoffees()) {
            System.out.println(coffee.getName() + " - " + coffee.getSize() + "oz, $" + coffee.getPrice());
        }
        
        // Updating a SpecCoffee's price by index
        catalog.updatePriceByIndex(0, 7);
        System.out.println("Updated Espresso price:");
        
        // Finding a SpecCoffee by partial name match
        SpecCoffee foundCoffee = catalog.findSpecCoffeeByNamePartial("Espresso");
        if (foundCoffee != null) {
            System.out.println("Found: " + foundCoffee.getName() + " - $" + foundCoffee.getPrice());
        }
        
        // Removing a SpecCoffee by index
        catalog.removeSpecCoffeeByIndex(1);
        System.out.println("Coffees after removing Latte:");
        for (SpecCoffee coffee : catalog.getCoffees()) {
            System.out.println(coffee.getName() + " - " + coffee.getSize() + "oz, $" + coffee.getPrice());
        }
    }
}
