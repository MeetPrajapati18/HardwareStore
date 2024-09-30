public class Nuts extends RentableHardware {
    private String type;

    public Nuts(String name, double cost, double price, String type) {
        super(name, cost, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type=" + type;
    }
}
