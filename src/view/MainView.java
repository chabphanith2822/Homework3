package view;

import controller.WatchController;
import model.Watch;
import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WatchController controller = new WatchController();

        while (true) {
            System.out.println("===  WATCH MANAGEMENT SYSTEM (MVC) ===");
            System.out.println("1. CREATE WATCH");
            System.out.println("2. VIEW WATCH IN STOCK");
            System.out.println("3. UPDATE WATCH");
            System.out.println("4. DELETE WATCH");
            System.out.println("5. EXIT");
            System.out.print("CHOICE OPTION (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("CODE: "); String code = scanner.nextLine();
                System.out.print("BRAND: "); String brand = scanner.nextLine();
                System.out.print("MODEL: "); String model = scanner.nextLine();
                System.out.print("PRICE ($): "); double price = scanner.nextDouble();
                System.out.print("QTY: "); int stock = scanner.nextInt();

                Watch newWatch = new Watch(code, brand, model, price, stock);
                if (controller.addWatch(newWatch)) {
                    System.out.println(" ADDED SUCCESSFULLY!\n");
                }

            } else if (choice == 2) {
                List<Watch> watches = controller.getAllWatches();
                System.out.println("\n---  LIST ALL WATCHES ---");
                for (Watch w : watches) {
                    System.out.println("ID: " + w.getId() + " | CODE: " + w.getCode() +
                            " | BRAND: " + w.getBrand() + " | MODEL: " + w.getModel() +
                            " | PRICE: $" + w.getPrice() + " | QTY: " + w.getStock());
                }
                System.out.println("-----------------------------------------\n");

            } else if (choice == 3) {
                System.out.print("ENTER WATCH ID TO UPDATE: "); int id = scanner.nextInt(); scanner.nextLine();
                System.out.print("NEW CODE: "); String code = scanner.nextLine();
                System.out.print("NEW BRAND: "); String brand = scanner.nextLine();
                System.out.print("NEW MODEL: "); String model = scanner.nextLine();
                System.out.print("NEW PRICE ($): "); double price = scanner.nextDouble();
                System.out.print("NEW QTY: "); int stock = scanner.nextInt();

                Watch updatedWatch = new Watch(id, code, brand, model, price, stock);
                if (controller.updateWatch(updatedWatch)) {
                    System.out.println(" UPDATED SUCCESSFULLY!\n");
                } else {
                    System.out.println(" ID NOT FOUND!\n");
                }

            } else if (choice == 4) {
                System.out.print("ENTER ID TO DELETE: "); int id = scanner.nextInt();
                if (controller.deleteWatch(id)) {
                    System.out.println(" DELETED SUCCESSFULLY!\n");
                } else {
                    System.out.println(" ID NOT FOUND!\n");
                }

            } else if (choice == 5) {
                System.out.println(" SYSTEM CLOSED!");
                break;
            }
        }
        scanner.close();
    }
}