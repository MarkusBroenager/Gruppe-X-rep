public class Orderline {
    private Pizza pizza;
    private int quantity;
    private double price;

    public Orderline(Pizza pizza, int quantity) {
        this.pizza = pizza;
        this.quantity = quantity;
        this.price = pizza.getPrice();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return quantity + " x " + pizza.getName() + " - " + getTotalPrice() + " DKK";
    }
}

