package refactoring;

public class Bike {

    public String productName;
    public double price;
    public Integer batteryCapacity;

    public Bike(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getGearsCount() {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
