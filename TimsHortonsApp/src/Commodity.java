public interface Commodity {
    // Method to get the cost of the commodity
    double getCost();

    // Method to get the price of the commodity
    double getPrice();

    // Method to calculate the profit margin of the commodity
    default double calculateProfitMargin() {
        return getPrice() - getCost();
    }
}
