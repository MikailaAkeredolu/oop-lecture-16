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
        //Todo - figure out how to calculate the total price of all clothing items given to you
        return 0.0;
    }

    public static void printClassNamesOfPayableEntities(Payable[] anArrayOfPayableEntities){
        for(int x = 0; x < anArrayOfPayableEntities.length; x= x + 1 ){
            System.out.println(
                    anArrayOfPayableEntities[x].getClass().getSimpleName()
            );
        }



    }

    public  static void checkCustomerDiscount(Customer customer){
        //todo
    }



}
