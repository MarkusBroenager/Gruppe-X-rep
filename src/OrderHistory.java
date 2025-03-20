import java.util.ArrayList;

// Det er i OngoingOrder klassen hvor vi opretter ordrene.
public class OrderHistory extends OngoingOrder {

    // Man kan oprette en liste af objekter med alle de færdige ordres oplysninger.
    ArrayList<Order> finishedOrders = new ArrayList<>();

    //Hvis vores attributter er public kan man hente konstrukteren via super.
    public OrderHistory(String customerName, int pizzaType, String pickupTime, int orderID, boolean status) {
        super(customerName, pizzaType, pickupTime, orderID, status);
    }
    //Ellers kan man hente dem via getter metoder.

    // Hvis det er muligt kan man hente ordre der er mærkeret som færdige fra den nuværende liste der findes i OngoingOrders.
    // Man tilføjer dem til listen med færdige ordre via et loop.
    public void addToHistory(){
        for (Order Order : orders) {
            //Vi kan oprette en attribut der hedder 'status' til at tjekke om en ordre er fuldført.
            if (!getStatus()) {
                finishedOrders.add(Order);
            }
        }
    }

    //Metode til at vise listen af færdige ordre (taget fra OngoingOrders).
    public static void showOrderHistory(ArrayList<Order> finishedOrders) {
        if (finishedOrders.isEmpty()) {
            System.out.println("Ordrehistorikken er tom.");
        } else {
            System.out.println("--- Færdige Ordre ---");
            for (Order Order : finishedOrders) {
                System.out.println(Order);
            }
        }
    }

    //Metode til at beregne den samlede indtjening for pizza'er.
    //Her vil man blive nødt til at tilføje 'prize' som en attribut når man opretter en ordre.
    public void sumOfPrice() {
        ArrayList<Integer> finishedOrdersPrize = new ArrayList<Integer>();

        for (Order Order : finishedOrders) {
            finishedOrdersPrize.add(prize);
        }

        int sum = 0;
        for (int i = 0; i < finishedOrdersPrize.size(); i++){
            sum += finishedOrdersPrize.get(i);
        }
        System.out.println("Summen for dagens indtjening er: " + sum + "kr.");
    }

    // Metode til at se hvilke pizza'er der er mest populære.
    //Man kan oprette nye lister der gemmer mængden af solgte pizza'er hvor hver pizzatype.
    public void showMostPopular() {

        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        //Man kan tilføje flere afhængig af mængden af pizzatyperne.

        for (Order Order: finishedOrders) {
            if (Order.getPizzaType() == 1) {
                number1.add(Order.getOrderID());
            }

            if (Order.getPizzaType() == 2) {
                number2.add(Order.getOrderID());
            }
        }

        //Man printer antallet af solgte pizza'er for hver pizzatype ud.
        System.out.println("Der blev solgt " + number1.size() + " nr. 1 Pizza'er i dag");
        System.out.println("Der blev solgt " +number2.size() + " nr. 2 Pizza'er i dag");


    }
}



