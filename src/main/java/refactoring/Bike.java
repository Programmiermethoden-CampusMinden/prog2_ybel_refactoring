package refactoring;

public class Bike {

    public String productName;
    public double price;

    public Bike(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public int getGearsCount() {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
