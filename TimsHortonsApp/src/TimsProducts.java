import java.util.Locale;

/**
 * Represents a product available at Tim's Hardware Store.
 * Implements the Commodity interface.
 * @author Meetkumar Prajapati
 * @version
 */
public class TimsProducts implements Commodity {
    private String name;
    private double cost;
    private double price;

    /**
     * Constructs a TimsProducts object with the specified name, cost, and price.
     * @param n The name of the product.
     * @param c The cost of the product.
     * @param p The price of the product.
     */
    public TimsProducts(String n, double c, double p) {
        name = n;
        cost = c;
        price = p;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double calculateProfitMargin() {
        return getPrice() - getCost();
    }

    /**
     * Returns the name of the product.
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    // Optional: Rename method to match interface method name
    public double getProductionCost() {
        return getCost();
    }

    // Optional: Rename method to match interface method name
    public double getRetailPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "TimsProduct{name='" + name + "', cost=" + cost + ", price=" + price + "}";
    }
}
