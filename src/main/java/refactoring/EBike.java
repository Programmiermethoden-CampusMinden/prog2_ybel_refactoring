package refactoring;

public class EBike extends Bike {

    public Integer batteryCapacity;

    public EBike(String productNumber, double price, int maxSpeed, int rearGearCount, int frontGearCount, int batteryCapacity) {
        super(productNumber, price, rearGearCount, frontGearCount, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
}
