package umldemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("mike");
        studentNames.add("jack");
        System.out.println(studentNames.size());



        //create a clothing item
        ClothingItem clothingItem1 = new ClothingItem("Gucci Loafers", 2000.0);
        ClothingItem clothingItem2 = new ClothingItem("Monaco", 1000.0);

        //Test the clothing
       ClothingItem[] clothingItems = {clothingItem1, clothingItem2};
        ShopAppUtility.calculateSubTotal(clothingItems);

    }
}
