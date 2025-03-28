import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Opretter menuen med pizzaer
        Orderhistory orderHistory = new Orderhistory(); // Opretter en ordrehistorik
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Lav en ny ordre");
            System.out.println("2. Se ordrehistorik");
            System.out.println("3. Afslut");
            System.out.print("Vælg en handling (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Lav en ny ordre
                Order order = new Order(); // Opretter en ny ordre
                boolean ordering = true;

                while (ordering) {
                    menu.displayMenu();  // Viser menukortet under bestilling

                    System.out.print("Vælg en pizza ved at indtaste nummeret (1-30), eller 0 for at afslutte ordren: ");
                    int pizzaChoice = scanner.nextInt();

                    if (pizzaChoice == 0) { // Afslutter ordren
                        ordering = false;
                    } else if (pizzaChoice >= 1 && pizzaChoice <= 30) { // Spørger efter mængde
                        System.out.print("Indtast mængde for " + menu.getPizzas().get(pizzaChoice - 1).getName() + ": ");
                        int quantity = scanner.nextInt();

                        // Opretter en Orderline
                        Pizza selectedPizza = menu.getPizzas().get(pizzaChoice - 1);
                        Orderline orderLine = new Orderline(selectedPizza, quantity);
                        order.addOrderLine(orderLine);
                    } else {
                        System.out.println("Ugyldigt valg, prøv igen.");
                    }
                }

                // Tilføjer den nye ordre til ordrehistorikken
                orderHistory.addOrder(order);
                System.out.println("Ordre oprettet og gemt.");
                order.displayOrder(); // Vis ordren
            } else if (choice == 2) {
                // Viser ordrehistorik
                orderHistory.displayHistory();
            } else if (choice == 3) {
                // Afslut programmet
                System.out.println("Afslutter programmet...");
                running = false;
            } else {
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
    }
}

