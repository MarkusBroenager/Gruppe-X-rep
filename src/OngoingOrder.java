
// tilføj en ordre
    public static void addOrder(ArrayList<Order> orders, Scanner scanner) {
        System.out.println("Indtast kundens navn:");
        String customerName = scanner.nextLine();
        System.out.println("Indtast pizza-type (1-4):");
        int pizzaType = scanner.nextInt();
        System.out.println("Indtast afhentningstid (fx 14:30):");
        String pickupTime = scanner.next();

        Order newOrder = new Order(customerName, pizzaType, pickupTime); // Opret ny ordre
        orders.add(newOrder); // Tilføj ordren til listen
        System.out.println("Ordren er tilføjet!");
    }

    // fjern en ordre
    public static void removeOrder(ArrayList<Order> orders, Scanner scanner) {
        System.out.println("Indtast ordre-ID for at fjerne ordren:");
        int orderID = scanner.nextInt();

        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                orders.remove(order); // Fjern ordren
                System.out.println("Ordren er fjernet!");
                return;
            }
        }
        System.out.println("Ordren blev ikke fundet.");
    }

    //  vis alle aktuelle ordre
    public static void showOrderList(ArrayList<Order> orders) {
        if (orders.isEmpty()) {
            System.out.println("Der er ingen aktuelle ordre.");
        } else {
            System.out.println("--- Aktuelle Ordre ---");
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("Ordre #" + i + ": " + orders.get(i)); // Udskriv hver ordre
            }
        }
    }

// opdatere ordrestatus

public static void updateStatus(ArrayList<Order> orders, Scanner scanner) {
        System.out.println("Indtast ordre-ID for at opdatere status:");
        int orderID = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Indtast ny status (fx 'I gang', 'Klar til afhentning', 'Afsluttet'):");
        String newStatus = scanner.nextLine();

        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                order.setOrderStatus(newStatus); // Opdater status
                System.out.println("Ordrestatus opdateret!");
                return;
            }
        }
        System.out.println("Ordren blev ikke fundet.");
    }
}
 
