/**
 * Die Klasse Bike repräsentiert ein Fahrrad mit Produktname, Preis, Ganganzahl und Maximalgeschwindigkeit.
 */
package refactoring;

public class Bike {

    private String productName;
    private double price;
    private int rearGearsCount;
    private int frontGearsCount;
    private int maxSpeed;

    /**
     * Erstellt ein neues Bike-Objekt.
     * @param productName Name des Produkts
     * @param price Preis des Fahrrads
     * @param rearGearsCount Anzahl der hinteren Gänge
     * @param frontGearsCount Anzahl der vorderen Gänge
     * @param maxSpeed Maximale Geschwindigkeit
     */
    public Bike(
            String productName,
            double price,
            int rearGearsCount,
            int frontGearsCount,
            int maxSpeed) {
        this.productName = productName;
        this.price = price;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gibt den Produktnamen zurück.
     * @return Produktname
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * Gibt den Preis zurück.
     * @return Preis
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gibt die Gesamtanzahl der Gänge zurück.
     * @return Anzahl der Gänge
     */
    public int getGearsCount() {
        return this.rearGearsCount * this.frontGearsCount;
    }

    /**
     * Gibt die maximale Geschwindigkeit zurück.
     * @return Maximale Geschwindigkeit
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
