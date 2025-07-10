import dao.MenuDAO;
import dao.OrderDAO;
import models.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDAO menuDAO = new MenuDAO();
        OrderDAO orderDAO = new OrderDAO();

        while (true) {
            System.out.println("\n--- Cafe Management ---");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View Menu");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    menuDAO.addItem(name, price);
                    System.out.println("Item added.");
                    break;
                case 2:
                    List<MenuItem> items = menuDAO.getAllItems();
                    for (MenuItem item : items)
                        System.out.println(item.getId() + " - " + item.getName() + " - ₹" + item.getPrice());
                    break;
                case 3:
                    System.out.print("Enter item ID: ");
                    int itemId = sc.nextInt();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    orderDAO.placeOrder(itemId, qty);
                    System.out.println("Order placed.");
                    break;
                case 4:
                    orderDAO.viewOrders();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
