package umloop;

public class UtilityMethods {


    public static boolean checkFitting(Customer customer, Cloth clothingItem){
        if(customer.getSize() == clothingItem.getSize()){
            return true;
        }else{
            return false;
        }

    }

    public static double calculateSubTotal(Cloth[] clothingItems){
        //a container that represesnt our subtotal , intitialize it to zerop to start with
        double currentSubTotal = 0.0;
        //loop through the clothings items
        for(int x = 0; x < clothingItems.length; x++ ){
          currentSubTotal   = currentSubTotal + clothingItems[x].getPrice();
        }
          // i want grab each clothing item's price
        //add the price of each item to the currentSubtotal
        //return current subttotal


        return currentSubTotal;
    }

    public static void printClassNamesOfPayableEntities(Payable[] anArrayOfPayableEntities){
        for(int x = 0; x < anArrayOfPayableEntities.length; x= x + 1 ){
            System.out.println(
                    anArrayOfPayableEntities[x].getClass().getSimpleName()
            );
        }



    }

    //Polymorphic - polymorphism
    public  static void checkCustomerDiscount(Customer customer){

        //check type of customer
        if(customer instanceof HourlyEmployee){
            System.out.println( customer.getClass().getSimpleName() + " qualifies for  a discount of " + ((HourlyEmployee) customer).DISCOUNT * 100 + "%" );
        }

        if(customer instanceof Manager){
            double managerDiscount = ((Manager) customer).getManagerDiscount() * 100;
            String result = String.format("%.2f", managerDiscount);
            System.out.println( customer.getClass().getSimpleName() + " qualifies for  a discount of " +  result + "%");
        }

        if(customer instanceof Student){

            System.out.println( customer.getClass().getSimpleName() + " qualifies for  a discount of " + ((Student) customer).getDISCOUNT() * 100 + "%");
        }




    }



}
