package refactoring;

public class Brompton extends Bike {

    public int maxSpeed;
    public int rearGearsCount;
    public int frontGearsCount;

    public Brompton(String pn, double p, int ms, int rgc, int fgc) {
        super(pn, p);
        maxSpeed = ms;
        rearGearsCount = rgc;
        frontGearsCount = fgc;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
