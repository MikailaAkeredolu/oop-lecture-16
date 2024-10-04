package umldemo;

import java.util.ArrayList;

public class ShopAppUtility  {


    public static boolean isAFit(Person person, ClothingItem clothingItem){

        //if the person's size is equal to the size of the clothing item return tru else return false


        return false;
    }











  public static double calculateSubTotal(ClothingItem[] clothingItems){
                //set current total to zero
                double currentTotal = 0;
            //Loop to access each element in the array
                for(int x = 0; x < clothingItems.length; x++ ){
                    currentTotal =  currentTotal + clothingItems[x].getPrice();
                    System.out.println(currentTotal);
                }

      return currentTotal;
  }







}
