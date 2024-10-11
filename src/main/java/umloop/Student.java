package umloop;

//concrete class
public class Student extends Customer {

    private long studentID;
    private static long studentCounter;
    private final double DISCOUNT = .05;

    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        studentCounter++;
        this.studentID = studentCounter;
    }

    public static void printStudentCounter() {
        System.out.println( studentCounter);
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
        System.out.println("Student ID :" + studentID + "Student Name: " + getName());
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
