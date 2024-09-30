public class Bolts extends RentableHardware {
    private String material;
    private int length;

    public Bolts(String name, double cost, double price, String material, int length) {
        super(name, cost, price);
        this.material = material;
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString() + ", material=" + material + ", length=" + length;
    }
}
