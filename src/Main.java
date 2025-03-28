import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        Menu pizzaMenu;

        while (input != "1" || input != "2" || input != "3" || input != "4") {
            System.out.println("Welcome to Mario's Pizza System");
            System.out.println("What would you like to do?");

            System.out.println("Type 1 to see the menu.");
            System.out.println("Type 2 to manage orders.");
            System.out.println("Type 3 to see current orders.");
            System.out.println("Type 4 to see the order history.");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    Menu menu = new Menu("", 0);
                    menu.displayMenu();
                    break;
                case "2":
                    Order order = new Order(null, "", "", true);
                    order.manageOrders();
                    break;
                case "3":
                    //OrderHistory.manageFinishedOrders();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}