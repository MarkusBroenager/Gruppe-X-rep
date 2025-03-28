import java.util.ArrayList;
import java.util.List;

public class Orderhistory {
    private List<Order> orders;

    public Orderhistory() {
        orders = new ArrayList<>();
    }

    // Tilføjer en ordre til historikken
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Viser ordrehistorikken
    public void displayHistory() {
        if (orders.isEmpty()) {
            System.out.println("Der er ingen ordrer i historikken.");
        } else {
            System.out.println(" --- Ordrehistorik ---");
            for (Order order : orders) {
                order.displayOrder();
                System.out.println("----------------------");
            }
        }
    }
}

