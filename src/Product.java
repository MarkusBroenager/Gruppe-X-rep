public class Product {
    private String pizzaName;
    private double price;

    public Product(String pizzaName, double price) {
        this.pizzaName = pizzaName;
        this.price = price;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza Name: " + this.getPizzaName() +
                ", Price: " + this.getPrice() + "kr.";
    }

}
