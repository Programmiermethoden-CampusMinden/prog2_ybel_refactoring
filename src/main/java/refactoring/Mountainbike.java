package refactoring;

public class Mountainbike extends Bike {

    public int maxSpeed;

    public Mountainbike(String pn, double p, int ms, int rgc, int fgc) {
        super(pn, p, rgc, fgc);
        maxSpeed = ms;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
