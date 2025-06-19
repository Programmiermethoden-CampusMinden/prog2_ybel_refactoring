/**
 * Die Klasse Bill repräsentiert eine Rechnung für einen Kunden mit einer Artikelliste.
 */
package refactoring;

import java.util.ArrayList;

public class Bill {
    private Customer customer;
    private ArrayList<Article> articles;

    /**
     * Erstellt eine neue Rechnung für einen Kunden.
     * @param customer Der Kunde
     */
    public Bill(Customer customer) {
        this.customer = customer;
        this.articles = new ArrayList<>();
    }

    /**
     * Gibt den Kunden der Rechnung zurück.
     * @return Kunde
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gibt die Artikelliste zurück.
     * @return Liste der Artikel
     */
    public ArrayList<Article> getArticles() {
        return articles;
    }

    /**
     * Fügt einen Artikel zur Rechnung hinzu.
     * @param a Artikel
     * @return true, wenn erfolgreich hinzugefügt
     */
    public boolean addArticle(Article a) {
        return articles.add(a);
    }

    /**
     * Gibt die Rechnungsdetails als String zurück.
     * @return Rechnungsdetails
     */
    public String getDetails() {
        double total = 0;
        String result = "Details for \"" + customer.getName() + "\"\n";
        result += customer.getStreet() + " " + customer.getStreetNumber() + "\n";
        result += customer.getPostalCode() + " " + customer.getCity() + "\n";
        result += "Geburtstag: " + customer.getBirthday() + "\n";
        result += "Email: " + customer.getEmail() + "\n\n";
        result += "refactoring.Article: \n";
        for (Article article : articles) {
            double price = 0;
            if (article.getBike() instanceof Brompton) {
                if (article.getPurchaseAmount() > 1) {
                    price += (article.getPurchaseAmount() - 1) * article.getBike().getPrice() / 2;
                }
                price += article.getBike().getPrice() * article.getPurchaseAmount();
            } else if (article.getBike() instanceof EBike) {
                price += article.getBike().getPrice() * article.getPurchaseAmount();
            } else if (article.getBike() instanceof Mountainbike) {
                if (article.getPurchaseAmount() > 2) {
                    price += article.getPurchaseAmount() * article.getBike().getPrice() * 9 / 10;
                } else {
                    price += article.getBike().getPrice() * article.getPurchaseAmount();
                }
            }
            if (price > 1000f || price == 1000.0) {
                price = price * 0.8;
            }
            result +=
                    "\t"
                            + article.getBike().getProductName()
                            + "\tx\t"
                            + article.getPurchaseAmount()
                            + "\t=\t"
                            + String.valueOf(price)
                            + "\n";
            total += price;
        }
        result += "\nTotal price:\t" + String.valueOf(total) + "\n";
        return result;
    }
}
