import java.util.ArrayList;

public class Menu extends Product {

    private ArrayList<Product> pizzas;
    //constructor der laver liste over 30 forskellige pizzaer
    public Menu(String pizzaName, double price) {
        super(pizzaName, price);

        pizzas = new ArrayList<>();
        pizzas.add(new Product("Margherita", 79.00));
        pizzas.add(new Product("Vesuvio", 89.00));
        pizzas.add(new Product("Pepperoni", 89.00));
        pizzas.add(new Product("Hawaii", 94.00));
        pizzas.add(new Product("Capricciosa", 94.00));
        pizzas.add(new Product("Oriental", 89.00));
        pizzas.add(new Product("Pizza Kebab", 89.00));
        pizzas.add(new Product("Shawarma Pizza", 94.00));
        pizzas.add(new Product("Napoli", 89.00));
        pizzas.add(new Product("Vegetariana", 94.00));
        pizzas.add(new Product("Pesto Chicken", 89.00));
        pizzas.add(new Product("La Luna Pizza", 99.00));
        pizzas.add(new Product("La Fiesta Pizza", 94.00));
        pizzas.add(new Product("Sisko Pizza", 94.00));
        pizzas.add(new Product("Mexicana Pizza", 94.00));
        pizzas.add(new Product("Napoli Pizza", 89.00));
        pizzas.add(new Product("Quattro Stagioni Pizza", 99.00));
        pizzas.add(new Product("Quattro Formaggi Pizza", 99.00));
        pizzas.add(new Product("Americano Pizza", 99.00));
        pizzas.add(new Product("Diavola", 94.00));
        pizzas.add(new Product("Frutti di Mare", 99.00));
        pizzas.add(new Product("Caprese", 94.00));
        pizzas.add(new Product("Al Funghi", 94.00));
        pizzas.add(new Product("Calzone", 99.00));
        pizzas.add(new Product("Boscaiola", 99.00));
        pizzas.add(new Product("Carbonara", 99.00));
        pizzas.add(new Product("Prosciutto e Rucola", 94.00));
        pizzas.add(new Product("Puttanesca", 99.00));
        pizzas.add(new Product("Francesca", 94.00));
        pizzas.add(new Product("Marinara", 99.00));
    }
    // metode der viser menukortet med pizzaerne
    public void displayMenu(){
        System.out.println(" --- Marios Pizza Menu ---");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i+1)+ ". " +pizzas.get(i).getPizzaName()+ " - " +pizzas.get(i).getPrice() + " DKK");
        }
    }

    public ArrayList<Product> getPizza(){
        return pizzas;
    }

}