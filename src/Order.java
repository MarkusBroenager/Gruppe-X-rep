import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private String customerName;
    private String pickupTime;
    private boolean status;

    public Order(Product pizzas, String customerName, String pickupTime, boolean status ) {

    }

    ArrayList<Order> orders = new ArrayList<>();
    Menu menu = new Menu("", 0);
    ArrayList<Product> pizzas = menu.getPizza();

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCostumerName(String costumerName) {
        return costumerName;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupTime(String pickupTime) {
        return pickupTime;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(boolean status) {
        return status;
    }

    public ArrayList<Order> addOrder(ArrayList<Order> orders) {
        Order order = new Order(null, "", "", false);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast kundens navn:");
        customerName = scanner.nextLine();
        System.out.println("Indtast pizza-type (1-30):");
        int pizzaType = Integer.parseInt(scanner.nextLine());
        System.out.println("Indtast afhentningstid (fx 14:30):");
        setPickupTime(scanner.nextLine());
        setStatus(true);

        Order newOrder = new Order(pizzas.get(pizzaType), getCostumerName(customerName), getPickupTime(pickupTime), getStatus(status)); // Opret ny ordre
        orders.add(newOrder); // Tilføj ordren til listen
        System.out.println("Ordren er tilføjet!");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i).menu.getPizzaName() + orders.get(i).getCostumerName(customerName) + " " + orders.get(i).getPickupTime(pickupTime) + orders.get(i).getStatus(status));
        }
        return orders;
    }


    // fjern en ordre
    public void removeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast ordre-ID for at fjerne ordren:");
        int orderID = scanner.nextInt();

        for (int i = 0; i < orders.size(); i++) {
            if (i == orderID) {
                orders.remove(i); // Fjern ordren
                System.out.println("Ordren er fjernet!");
                return;
            }
        }
        System.out.println("Ordren blev ikke fundet.");
    }

    //  vis alle aktuelle ordre
    public void showOrderList(ArrayList<Order> orders) {
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

    public void updateStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast ordre-ID for at angive at ordren er færdig:");
        int orderID = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < orders.size(); i++) {
            if (i == orderID) {
                orders.get(i).setStatus(false); // Opdater status
                System.out.println("Ordrestatus opdateret!");
                return;
            }
        }
        System.out.println("Ordren blev ikke fundet.");
    }

    public void manageOrders() {
        System.out.println("Hvordan vil du tilpasse dine ordre");
        System.out.println("Indtast 1 for at se de nuværende ordre");
        System.out.println("Indtast 2 for at tilføje en ordre");
        System.out.println("Indtast 3 for at slette en ordre");
        System.out.println("Indtast 4 for at mærkere en ordre som færdig");
        System.out.println("Indtast andet for at gå tilbage til den forrige menu");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Order order = new Order(null, "", "", false);

        switch (input) {
            case "1":
                showOrderList(orders);
                break;
                case "2":
                    addOrder(orders);
                    break;
                case "3":
                    removeOrder();
                    break;
                case "4":
                    updateStatus();
                    break;
                default:
                    System.out.println("Du gik tilbage til hovedmenuen");
            }
        }
    }

