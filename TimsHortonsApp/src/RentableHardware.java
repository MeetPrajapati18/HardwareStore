public class RentableHardware extends TimsProducts {
    private boolean rented;

    public RentableHardware(String name, double cost, double price) {
        super(name, cost, price);
        this.rented = false; // Initialize as not rented
    }

    // Method to rent the hardware
    public void rent() {
        this.rented = true;
    }

    // Method to check if the hardware is currently rented or not
    public boolean isRented() {
        return rented;
    }

    // Method to return the hardware
    public void returnHardware() {
        this.rented = false;
    }

    // Optional: Override toString() to include rental status
    @Override
    public String toString() {
        return super.toString() + ", rented=" + rented;
    }
}
