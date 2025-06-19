package refactoring;

/**
 * Die Klasse Article repräsentiert einen Artikel, der ein Fahrrad und eine Kaufmenge enthält.
 */
public class Article {

    private Bike bike;
    private int purchaseAmount;

    /**
     * Erstellt einen neuen Artikel.
     * @param bike Das zugehörige Fahrrad
     * @param purchaseAmount Die gekaufte Menge
     */
    public Article(Bike bike, int purchaseAmount) {
        this.bike = bike;
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * Gibt das zugehörige Fahrrad zurück.
     * @return Fahrrad
     */
    public Bike getBike() {
        return this.bike;
    }

    /**
     * Gibt die gekaufte Menge zurück.
     * @return Kaufmenge
     */
    public int getPurchaseAmount() {
        return this.purchaseAmount;
    }
}
