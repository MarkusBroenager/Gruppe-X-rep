import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Orderline> orderLines;
    private int orderId;
    private static int orderCounter = 1;

    // Tilføjer ordre id
    public Order() {
        this.orderLines = new ArrayList<>();
        this.orderId = orderCounter++;
    }

    // Tilføjer Orderlinen
    public void addOrderLine(Orderline orderLine) {
        orderLines.add(orderLine);
    }

    // Beregner den samlede pris
    public double getTotalPrice() {
        double total = 0;
        for (Orderline orderLine : orderLines) {
            total += orderLine.getTotalPrice();
        }
        return total;
    }

    // Printer Orderlines
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Orderline orderLine : orderLines) {
            System.out.println(orderLine);
        }
        System.out.println("Total: " + getTotalPrice() + " DKK");
    }
}

