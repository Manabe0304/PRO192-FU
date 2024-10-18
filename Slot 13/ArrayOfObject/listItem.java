import java.util.ArrayList;

class listItem {
    private ArrayList<A> items = new ArrayList<>();

    public void addItem(A item) {
        items.add(item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            for (A item : items) {
                System.out.println(item);
            }
        }
    }

    public void editItem(int id, String newName) {
        for (A item : items) {
            if (item.getId() == id) {
                item.setName(newName);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void deleteItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public void updateItem(int id, String newName) {
        for (A item : items) {
            if (item.getId() == id) {
                item.setName(newName);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void removeItem(int id) {
        deleteItem(id);
    }
}