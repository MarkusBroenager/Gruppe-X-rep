import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private double total;

    public Order() {
        pizzas = new ArrayList<>();
        total = 0.0;
    }

    public void setPizzaName(int pizzaIndex, String pizzaName) {
        if (pizzaIndex >= 0 && pizzaIndex < pizzas.size()) {
            pizzas.get(pizzaIndex).setPizzaName(pizzaName);
        }
    }

    public String getPizzaName(int pizzaIndex) {
        if (pizzaIndex >= 0 && pizzaIndex < pizzas.size()) {
            return pizzas.get(pizzaIndex).getPizzaName();
        }
        return null;
    }

    public double calculateTotal() {
        total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPrice();
        }
        return total;
    }

    public void setPrice(int pizzaIndex, double price) {
        if (pizzaIndex >= 0 && pizzaIndex < pizzas.size()) {
            pizzas.get(pizzaIndex).setPrice(price);
        }
    }

    public double getPrice(int pizzaIndex) {
        if (pizzaIndex >= 0 && pizzaIndex < pizzas.size()) {
            return pizzas.get(pizzaIndex).getPrice();
        }
        return 0.0;
    }

    public void displayMenu() {
        System.out.println("Current order:");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + pizzas.get(i).getPizzaName() + " - DKK" + pizzas.get(i).getPrice());
        }
        System.out.println("Total: DKK" + calculateTotal());
    }

    public void confirmOrder() {
        System.out.println("Order confirmed. Your total is: DKK" + calculateTotal());
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void confirmPayment(double amount) {
        if (amount >= calculateTotal()) {
            System.out.println("Payment of DKK" + amount + " has been confirmed. Thank you for your order!");
        } else {
            System.out.println("Payment failed. The amount provided is insufficient.");
        }
    }
}