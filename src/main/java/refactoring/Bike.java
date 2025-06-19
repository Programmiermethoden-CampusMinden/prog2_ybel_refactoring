package refactoring;

public class Bike {

    public String productName;
    public double price;
    private int rearGearsCount;
    private int frontGearsCount;

    public Bike(String productName, double price, int rearGearsCount, int frontGearsCount) {
        this.productName = productName;
        this.price = price;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }

    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
