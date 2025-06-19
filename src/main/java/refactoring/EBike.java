package refactoring;

public class EBike extends Bike {

    public int maxSpeed;
    public int rearGearsCount;
    public int frontGearsCount;
    public Integer batteryCapacity;

    public EBike(String pn, double p, int ms, int rgc, int fgc, int bc) {
        super(pn, p);
        maxSpeed = ms;
        rearGearsCount = rgc;
        frontGearsCount = fgc;
        batteryCapacity = bc;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
