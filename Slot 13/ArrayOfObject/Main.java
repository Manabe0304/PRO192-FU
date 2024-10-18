import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        listItem listManager = new listItem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Add item");
            System.out.println("3. Edit item");
            System.out.println("4. Delete item");
            System.out.println("5. Update item");
            System.out.println("6. Remove item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listManager.displayItems();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter type (B/C): ");
                    String type = scanner.nextLine();
                    if (type.equalsIgnoreCase("B")) {
                        System.out.print("Enter Extra Info: ");
                        String extraInfo = scanner.nextLine();
                        listManager.addItem(new B(id, name, extraInfo));
                    } else if (type.equalsIgnoreCase("C")) {
                        System.out.print("Enter Additional Info: ");
                        String additionalInfo = scanner.nextLine();
                        listManager.addItem(new C(id, name, additionalInfo));
                    } else {
                        System.out.println("Invalid type. Adding as A.");
                        listManager.addItem(new A(id, name));
                    }
                    break;
                case 3:
                    System.out.print("Enter ID of item to edit: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    listManager.editItem(id, name);
                    break;
                case 4:
                    System.out.print("Enter ID of item to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    listManager.deleteItem(id);
                    break;
                case 5:
                    System.out.print("Enter ID of item to update: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    listManager.updateItem(id, name);
                    break;
                case 6:
                    System.out.print("Enter ID of item to remove: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    listManager.removeItem(id);
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}