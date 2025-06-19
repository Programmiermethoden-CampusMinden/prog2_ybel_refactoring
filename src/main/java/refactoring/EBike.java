/**
 * Die Klasse EBike repräsentiert ein E-Bike und erweitert Bike um eine Batterie-Kapazität.
 */
package refactoring;

public class EBike extends Bike {
    /**
     * Die Kapazität der Batterie in Wh.
     */
    public Integer batteryCapacity;

    /**
     * Erstellt ein neues E-Bike.
     * @param productNumber Produktnummer
     * @param price Preis
     * @param maxSpeed Maximale Geschwindigkeit
     * @param rearGearCount Hintere Gänge
     * @param frontGearCount Vordere Gänge
     * @param batteryCapacity Batterie-Kapazität in Wh
     */
    public EBike(
            String productNumber,
            double price,
            int maxSpeed,
            int rearGearCount,
            int frontGearCount,
            int batteryCapacity) {
        super(productNumber, price, rearGearCount, frontGearCount, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    /**
     * Gibt die Batterie-Kapazität zurück.
     * @return Batterie-Kapazität in Wh
     */
    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }
}
