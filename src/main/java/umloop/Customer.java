package umloop;

public abstract class Customer extends Person {

    private Cloth[] clothingItems;

    public Customer(String name, Size size, Cloth[] clothingItems) {
        super(name, size);
        this.clothingItems = clothingItems;
    }

    public abstract double printPriceAfterDiscount(Cloth cloth);

    public Cloth[] getClothingItems() {
        return clothingItems;
    }
}
