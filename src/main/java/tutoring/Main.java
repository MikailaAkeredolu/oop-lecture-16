package tutoring;

public class Main {
    public static void main(String[] args) {
        //ble

     SingeFamilyHouse singeFamilyHouse = new SingeFamilyHouse(3, 2);
     singeFamilyHouse.propertyLength = 20;
     singeFamilyHouse.propertyWidth = 10;
//     System.out.println(
//             singeFamilyHouse.getAddress()
//                     + " square footage is "
//                     + singeFamilyHouse.calcSquareFootage()
//     );

        House singleToMultiFamily  = new SingeFamilyHouse(3, 2);  // upcasted




        MultiFamily multiFamily = new MultiFamily(6,6);
        multiFamily.propertyLength = 30;
        multiFamily.propertyWidth = 20;
//        System.out.println(
//                multiFamily.getAddress()
//                        + " square footage is "
//                        + multiFamily.calcSquareFootage()
//        );


      //

        //cast back down to a multifamily
        ((MultiFamily)singleToMultiFamily).canHoldMultipleFamilies();

       boolean result =  ((MultiFamily)singleToMultiFamily).canHoldMultipleFamilies(); //downcasted
        System.out.println(result);
//        System.out.println(dogToCat instanceof Animal);







//     Skyscraper skyscraper = new Skyscraper(30, 30);
//        System.out.println(skyscraper.getAddress());
//        int inventory =  House.getHouseCounter();
//        System.out.println(inventory);


        //House house1 = new House();
//        house1.setDoor(2);
//        System.out.println(house1.getDoor());
//
//        House house2 = new House();

        //print number of houses created so far


//        House house1 = new House(-3, -2, -1, 1.5);
//        House house2 = new House(4, 4, 2, 5);
//        int numberOfBedroomsForHouse1 = house1.getBedrooms();
//        System.out.println(numberOfBedroomsForHouse1);

    }
}
