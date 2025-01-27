package classpart.ex3;

public class Phone {

    private String model;
    private double price;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }
}
