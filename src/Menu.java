import java.util.ArrayList;
import java.util.List;

public class Menu {

    private ArrayList<Pizza> pizzas;

    //constructor der laver liste over 30 forskellige pizzaer
    public Menu(){
        pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Margherita", 79.00));
        pizzas.add(new Pizza("Vesuvio", 89.00));
        pizzas.add(new Pizza("Pepperoni", 89.00));
        pizzas.add(new Pizza("Hawaii", 94.00));
        pizzas.add(new Pizza("Capricciosa", 94.00));
        pizzas.add(new Pizza("Oriental", 89.00));
        pizzas.add(new Pizza("Pizza Kebab", 89.00));
        pizzas.add(new Pizza("Shawarma Pizza", 94.00));
        pizzas.add(new Pizza("Napoli", 89.00));
        pizzas.add(new Pizza("Vegetariana", 94.00));
        pizzas.add(new Pizza("Pesto Chicken", 89.00));
        pizzas.add(new Pizza("La Luna Pizza", 99.00));
        pizzas.add(new Pizza("La Fiesta Pizza", 94.00));
        pizzas.add(new Pizza("Sisko Pizza", 94.00));
        pizzas.add(new Pizza("Mexicana Pizza", 94.00));
        pizzas.add(new Pizza("Napoli Pizza", 89.00));
        pizzas.add(new Pizza("Quattro Stagioni Pizza", 99.00));
        pizzas.add(new Pizza("Quattro Formaggi Pizza", 99.00));
        pizzas.add(new Pizza("Americano Pizza", 99.00));
        pizzas.add(new Pizza("Diavola", 94.00));
        pizzas.add(new Pizza("Frutti di Mare", 99.00));
        pizzas.add(new Pizza("Caprese", 94.00));
        pizzas.add(new Pizza("Al Funghi", 94.00));
        pizzas.add(new Pizza("Calzone", 99.00));
        pizzas.add(new Pizza("Boscaiola", 99.00));
        pizzas.add(new Pizza("Carbonara", 99.00));
        pizzas.add(new Pizza("Prosciutto e Rucola", 94.00));
        pizzas.add(new Pizza("Puttanesca", 99.00));
        pizzas.add(new Pizza("Francesca", 94.00));
        pizzas.add(new Pizza("Marinara", 99.00));
    }
    // metode der viser menukortet med pizzaerne
    public void displayMenu(){
        System.out.println(" --- Marios Pizza Menu ---");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i+1)+ ". " +pizzas.get(i).getName()+ " - " +pizzas.get(i).getPrice() + " DKK");
        }
    }


}
