package refactoring;

public class Article {

    private Bike bike;
    private int purchaseAmount;

    public Article(Bike b, int pa) {
        bike = b;
        purchaseAmount = pa;
    }

    public Bike getBike() {
        return this.bike;
    }

    public int getPurchaseAmount() {
        return this.purchaseAmount;
    }
}
