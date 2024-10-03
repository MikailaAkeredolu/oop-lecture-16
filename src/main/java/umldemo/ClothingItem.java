package umldemo;

public class ClothingItem {
    private String name;
    private double price;

    public ClothingItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
