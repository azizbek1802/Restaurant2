import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> items = new ArrayList<>();
    double total = 0;

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.price;
    }

    public void displayOrder() {
        System.out.println("\nSizning buyurtmangiz:");
        for (MenuItem item : items) {
            item.display();
        }
        System.out.println("Jami narx: " + total + "$ ");
    }
}
