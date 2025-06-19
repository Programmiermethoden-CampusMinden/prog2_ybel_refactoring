package refactoring;

/**
 * Die Klasse Brompton repräsentiert ein spezielles Faltrad und erweitert Bike.
 */
public class Brompton extends Bike {
    /**
     * Erstellt ein neues Brompton-Fahrrad.
     * @param productName Name des Produkts
     * @param price Preis
     * @param maxSpeed Maximale Geschwindigkeit
     * @param rearGearCount Hintere Gänge
     * @param frontGearCount Vordere Gänge
     */
    public Brompton(
            String productName, double price, int maxSpeed, int rearGearCount, int frontGearCount) {
        super(productName, price, rearGearCount, frontGearCount, maxSpeed);
    }
}
