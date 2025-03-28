import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> uzbekDishes = new ArrayList<>();
    ArrayList<MenuItem> euroDishes = new ArrayList<>();

    public Menu() {
        // O‘zbek taomlarini qo‘shish
        addUzbekDish("Osh", 5.0);
        addUzbekDish("Somsa", 2.0);
        addUzbekDish("Manti", 4.0);
        System.out.println("===========================================");
        // Yevropa taomlarini qo‘shish
        addEuroDish("Pizza", 7.0);
        addEuroDish("Steak", 12.0);
        addEuroDish("Pasta", 6.0);
        System.out.println("===========================================");
    }

    public void addUzbekDish(String name, double price) {
        uzbekDishes.add(new MenuItem(name, price));
    }

    public void addEuroDish(String name, double price) {
        euroDishes.add(new MenuItem(name, price));
    }

    public void displayMenu() {
        System.out.println("\nO‘zbek taomlari:");
        for (MenuItem dish : uzbekDishes) {
            dish.display();
            System.out.println("========================================");
        }
        System.out.println("\nYevropa taomlari:");
        for (MenuItem dish : euroDishes) {
            dish.display();
            System.out.println("=========================================");
        }
    }
}
