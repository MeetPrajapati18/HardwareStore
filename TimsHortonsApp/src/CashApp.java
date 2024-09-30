import java.util.Scanner;

public class CashApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimOrders t = TimOrders.create();

        System.out.println("Welcome to Tim's Hardware Store!");

        // Display menu options
        System.out.println("Choose an option:");
        System.out.println("1. Rentable products");
        System.out.println("2. Purchase products");

        // Get user choice
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Handle user choice
        switch (choice) {
            case 1:
                addRentableProducts(t);
                break;
            case 2:
                addPurchaseProducts(t);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

        // Print the order and total price
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }

    private static void addRentableProducts(TimOrders order) {
        // Add rentable products to the order
        order.addRentableProduct(new Nuts("Nuts", 5.00, 10.00, "Steel"));
        order.addRentableProduct(new Bolts("Bolts", 0.10, 0.20, "Steel", 20));
    }

    private static void addPurchaseProducts(TimOrders order) {
        // Add purchase products to the order
        order.addProduct(new BoxOfNails("Box of Nails", 1.5, 50, 2.34, 5.99));
        // Add other purchase products as needed
        order.addProduct(new HammerDrill("Hammer Drill", 80.00, 150.00, 1100, 10));
    }
}
