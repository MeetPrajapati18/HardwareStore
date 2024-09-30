public class BoxOfNails extends RentableHardware {
    private double size;
    private int quantity;

    BoxOfNails(String name, double size, int quantity, double cost, double price) {
        super(name, cost, price); // Call constructor of RentableHardware
        this.size = size;
        this.quantity = quantity;
    }

    public double getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    // Override toString() to provide customized string representation
    @Override
    public String toString() {
        return super.toString() + ", size=" + size + ", quantity=" + quantity;
    }

    // Static factory method to create an instance of BoxOfNails
    public static BoxOfNails create() {
        String name = "Box of Nails";
        double size = 1;
        int quantity = 1;
        double cost = 10.00;
        double price = 13.00;
        return new BoxOfNails(name, size, quantity, cost, price);
    }
}
