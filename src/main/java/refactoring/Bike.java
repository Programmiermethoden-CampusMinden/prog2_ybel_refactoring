package refactoring;

public class Bike {

    private String productName;
    private double price;
    private int rearGearsCount;
    private int frontGearsCount;
    private int maxSpeed;

    public Bike(String productName, double price, int rearGearsCount, int frontGearsCount, int maxSpeed) {
        this.productName = productName;
        this.price = price;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
        this.maxSpeed = maxSpeed;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getGearsCount() {
        return this.rearGearsCount * this.frontGearsCount;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
