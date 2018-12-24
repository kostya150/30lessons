package lesson19.add;

public class Phone {
    long id;
    String model;
    double price;
    String countryMade;

    public Phone(long id, String model, double price, String countryMade) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.countryMade = countryMade;
    }

    long getId() {
        return id;
    }

    String getModel() {
        return model;
    }

    double getPrice() {
        return price;
    }

    String getCountryMade() {
        return countryMade;
    }
}
