package umldemo;

public class Business implements Payable {


    private String name;
    protected double revenue;

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void calculatePay() {
        System.out.println("Biz revenue " + this.revenue);

    }
}
