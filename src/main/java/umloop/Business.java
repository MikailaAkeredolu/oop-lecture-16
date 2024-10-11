package umloop;

public class Business implements Payable{

    private String name;
    private int productQtySupplied;
    private double productPrice;
//
    public Business(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }



    @Override
    public boolean payTaxOnEarnings() {
        //check if a manger makes over $100k
        //return calculatePay() > 100000.0;

        if(calculatePay() > 100000.0){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public double calculatePay() {
        return  this.productPrice * productQtySupplied;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        this.productQtySupplied = productQtySupplied;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
