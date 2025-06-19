package refactoring;

/**
 * Die Klasse Mountainbike repräsentiert ein spezielles Mountainbike und erweitert Bike.
 */
public class Mountainbike extends Bike {
    /**
     * Erstellt ein neues Mountainbike.
     * @param productName Name des Produkts
     * @param price Preis
     * @param maxSpeed Maximale Geschwindigkeit
     * @param rearGearCount Hintere Gänge
     * @param frontGearCount Vordere Gänge
     */
    public Mountainbike(
            String productName, double price, int maxSpeed, int rearGearCount, int frontGearCount) {
        super(productName, price, rearGearCount, frontGearCount, maxSpeed);
    }
}
