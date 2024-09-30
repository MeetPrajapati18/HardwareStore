public class HammerDrill extends TimsProducts {
    private double powerRating;
    private int chuckSize;

    public HammerDrill(String n, double c, double p, double powerRating, int chuckSize) {
        super(n, c, p);
        this.powerRating = powerRating;
        this.chuckSize = chuckSize;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public int getChuckSize() {
        return chuckSize;
    }
}
