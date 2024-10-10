package umloop;
// is-A
public class HourlyEmployee extends Employee{

    private double hourlyWage;
    private float hoursWorked;


    public HourlyEmployee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public double printPriceAfterDiscount(Cloth cloth) {
        //we need a way to get the price of the cloth we are trying to buy
         double priceOfCloth = cloth.getPrice();
        //we also need to find a way to get the discount amount
        double discountAmount = cloth.getPrice() * DISCOUNT; //discount = Multiply the price of the clothing item by the employee discount
        //Return the subtraction of the discount from the price
       // double priceAfterDiscount = priceOfCloth - discountAmount;
        return priceOfCloth - discountAmount ;
    }


    @Override
    public void printInfo() {

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
