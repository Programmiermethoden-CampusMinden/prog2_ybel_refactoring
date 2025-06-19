package refactoring;

public class Brompton extends Bike {

    public int maxSpeed;

    public Brompton(String pn, double p, int ms, int rgc, int fgc) {
        super(pn, p, rgc, fgc);
        maxSpeed = ms;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
