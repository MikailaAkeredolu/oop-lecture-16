package umldemo;

public class Entrepreneur  extends Person{

    private double revenue;
    private double expense;


    protected final double DISCOUNT = .05;

    public Entrepreneur(String name) {
        super(name);
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void calculatePay() {

    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
