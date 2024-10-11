package umloop;

public class Manager extends Employee {

    private double salary;
    protected final double EXTRA_DISCOUNT = .05;

    public Manager(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    //overloaded
    public Manager(String name, Size size, Cloth[] clothingItems, double salary) {
        super(name, size, clothingItems);
        this.salary = salary;
    }




    @Override
    public double printPriceAfterDiscount(Cloth cloth) {
        //we need a way to get the price of the cloth we are trying to buy
        double priceOfCloth = cloth.getPrice();
        //we also need to find a way to get the discount amount

        double discountAmount = cloth.getPrice() * getManagerDiscount(); //discount = Multiply the price of the clothing item by the employee discount
        //Return the subtraction of the discount from the price
        // double priceAfterDiscount = priceOfCloth - discountAmount;
        return priceOfCloth - discountAmount ;
    }

    @Override
    public void printInfo() {
        System.out.print(this.getName() + " makes " + salary + " and his shopping bag consist of the following clothing items: ");
        for(Cloth cloth: getClothingItems() ){
            System.out.print(cloth.getName() + " ");

        }
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    public double getManagerDiscount(){
        return DISCOUNT + EXTRA_DISCOUNT;
    }

    public void somethingnewfoooool(){

    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }
}
