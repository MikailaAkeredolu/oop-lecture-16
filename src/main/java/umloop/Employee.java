package umloop;
//Is -A
public abstract class Employee extends Customer implements Payable{

    protected final double DISCOUNT = .10;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }



}
