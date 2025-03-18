import java.util.ArrayList;

// Jeg tænker at både OrderHistory og CurrentOrder(eller hvad i vælger at kalde den) kan eje fra Order (-II-) klassen.
// Det er i Order klassen hvor vi opretter ordrene.
public class OrderHistory /*extends Order*/ {
    // Man kan bruge getter metoder til at hente de oplysninger vi skal bruge fra superklassen.

    /*getPizzaName();
    getPrize();
    getCustomerName();
    getOrderTime();
    getOrderStatus();*/

    // Man kan oprette en liste af objekter med alle ordrenes oplysninger.
    // ArrayList<Order> finishedOrders = new ArrayList<Order>();

    // Hvis det er muligt kan man hente ordre der er mærkeret som færdige fra den nuværende liste der findes i en anden klasse.
    // Man tilføjer dem til listen med færdige ordre via et loop.
    /*for (int i = 0; 0 < currentOrders.length; i++) {
        if (orderStatus == false) {
            finishedOrders.add([i]);

        }
     }*/
    // Ellers kan man tilføje dem via getter metoderne.

    //Metode til at beregne den samlede indtjening for pizza'er.
    public void sumOfPrice() {

    }
    // Metode til at se hvilke pizza'er der er mest populærer.
    public void showMostPopular() {

    }
}



