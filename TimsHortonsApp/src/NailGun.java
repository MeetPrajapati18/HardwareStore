
/**
 * @author Meetkumar Prajapati
 */

public class NailGun extends TimsProducts {
    private int nailCapacity;
    private String powerSource;
    private double weight;

    public NailGun(String n, double c, double p, int capacity, String power, double w) {
        super(n, c, p);
        nailCapacity = capacity;
        powerSource = power;
        weight = w;
    }

    public int getNailCapacity() {
        return nailCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public double getWeight() {
        return weight;
    }
}
