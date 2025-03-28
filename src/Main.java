import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String name = scanner.nextLine();
        User user = new User(name);


        Manager manager = new Manager("Gulasal");
        Menu menu = new Menu();
        Order order = new Order();
        System.out.println("========================================");
        System.out.println("\nXush kelibsiz, " + user.name + "!");
        System.out.println("Sizning menejeringiz: " + manager.managerName);
        System.out.println("========================================");
        menu.displayMenu();

        while (true) {
            System.out.print("Buyurtma berish uchun taom nomini yozing yoki 'exit' deb yozing: ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("exit")) break;

            boolean found = false;
            for (MenuItem item : menu.uzbekDishes) {
                if (item.name.equalsIgnoreCase(choice)) {
                    order.addItem(item);
                    found = true;
                    break;
                }
            }

            if (!found) {
                for (MenuItem item : menu.euroDishes) {
                    if (item.name.equalsIgnoreCase(choice)) {
                        order.addItem(item);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Bunday taom menyuda yo'q!");
            }
        }

        order.displayOrder();
        System.out.println("Rahmat! Yana tashrif buyuring.");
        System.out.println("================================================");
    }
}