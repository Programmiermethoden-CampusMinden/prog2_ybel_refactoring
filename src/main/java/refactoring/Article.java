package refactoring;

public class Article {

    private Bike bike;
    private int purchaseAmount;

    public Article(Bike bike, int purchaseAmount) {
        this.bike = bike;
        this.purchaseAmount = purchaseAmount;
    }

    public Bike getBike() {
        return this.bike;
    }

    public int getPurchaseAmount() {
        return this.purchaseAmount;
    }
}
