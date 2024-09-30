import java.util.ArrayList;
import java.util.Scanner;

public class TimOrders {
    private String customerName;
    private ArrayList<TimsProducts> items;

    private TimOrders(String n) {
        customerName = n;
        items = new ArrayList<>();
    }

    public static TimOrders create() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String customerName = scan.nextLine();
        return new TimOrders(customerName);
    }

    public void addProduct(TimsProducts product) {
        items.add(product);
    }

    public void addRentableProduct(RentableHardware product) {
        items.add(product);
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Receipt\n");
        for (int i = 0; i < items.size(); i++) {
            TimsProducts item = items.get(i);
            str.append(String.format("%s- %-20s $%.2f\n", i + 1, item.getName(), item.getRetailPrice()));
        }
        return str.toString();
    }

    public double getAmountDue() {
        double total = 0;
        for (TimsProducts p : items) {
            total += p.getRetailPrice();
        }
        return total;
    }
}
