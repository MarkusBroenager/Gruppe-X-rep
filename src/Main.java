import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";

        //Programmet kører et loop der fungerer som startmenuen.
        while (input != "1" || input != "2" || input != "3" || input != "4") {
            System.out.println("Welcome to Mario's Pizza System");
            System.out.println("What would you like to do?");

            System.out.println("Type 1 to see the menu.");
            System.out.println("Type 2 to manage orders.");
            System.out.println("Type 3 to see current orders.");
            System.out.println("Type 4 to see the order history.");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            //Metoderne for de forskellige menuer bliver fremkaldt inde i Switch-Casen.
            switch (input) {
                case "1":
                    //displayMenu();
                    break;
                case "2":
                    //manageOrder();
                    break;
                case "3":
                    Order.showOrderList(orders);
                    break;
                case "4":
                    //showOrderHistory();
                    break;
                //Hvis ingen af mulighederne bliver valgt giver den fejlbesked og genstarter loopet.
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}