package refactoring;

public class EBike extends Bike {

    public int maxSpeed;
    public Integer batteryCapacity;

    public EBike(String pn, double p, int ms, int rgc, int fgc, int bc) {
        super(pn, p, rgc, fgc);
        maxSpeed = ms;
        batteryCapacity = bc;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
