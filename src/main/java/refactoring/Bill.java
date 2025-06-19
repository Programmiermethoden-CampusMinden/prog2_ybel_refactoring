package refactoring;

import java.util.ArrayList;
import java.util.Date;

public class Bill {

    public String customerName;
    public String nickname;
    public Date birthday;
    public String email;
    public String street;
    public String streetNumber;
    public int postalCode;
    public String city;
    public ArrayList<Article> articles;

    public Bill(String cn, String n, String s, String sn, int pc, Date b, String e, String c) {
        customerName = cn;
        nickname = n;
        street = s;
        streetNumber = sn;
        postalCode = pc;
        birthday = b;
        email = e;
        city = c;
        articles = new ArrayList<>();
    }

    public boolean addArticle(Article a) {
        return articles.add(a);
    }

    public String getDetails() {
        double total = 0;

        String result = "Details for \"" + customerName + "\"\n";
        result += street + " " + streetNumber + "\n";
        result += postalCode + " " + city + "\n";
        result += "Geburtstag: " + birthday + "\n";
        result += "Email: " + email + "\n\n";
        result += "refactoring.Article: \n";
        for (Article article : articles) {
            double price = 0;
            if (article.getBike() instanceof Brompton) {
                if (article.getPurchaseAmount() > 1) {
                    price += (article.getPurchaseAmount() - 1) * article.getBike().price / 2;
                }
                price += article.getBike().price * article.getPurchaseAmount();
            } else if (article.getBike() instanceof EBike) {
                price += article.getBike().price * article.getPurchaseAmount();
            } else if (article.getBike() instanceof Mountainbike) {
                if (article.getPurchaseAmount() > 2) {
                    price += article.getPurchaseAmount() * article.getBike().price * 9 / 10;
                } else {
                    price += article.getBike().price * article.getPurchaseAmount();
                }
            }
            if (price > 1000f || price == 1000.0) {
                price = price * 0.8;
            }

            result +=
                    "\t"
                            + article.getBike().productName
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
