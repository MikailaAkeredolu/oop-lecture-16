package tutoring;

import zoo.Animal;
import zoo.Dog;

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

       // House singleToMultiFamily  = new MultiFamily(3, 2);  // solution 1

        MultiFamily multiFamily = new MultiFamily(6,6);
        multiFamily.propertyLength = 30;
        multiFamily.propertyWidth = 20;
//        System.out.println(
//                multiFamily.getAddress()
//                        + " square footage is "
//                        + multiFamily.calcSquareFootage()
//        );


      //

        House singleToMultiFamily  = new SingeFamilyHouse(3, 2);  // upcasted

        singleToMultiFamily = multiFamily; //solution 2


        boolean result =  ((MultiFamily)singleToMultiFamily).canHoldMultipleFamilies(); //downcasted
        System.out.println(result);


//        System.out.println(dogToCat instanceof Animal);









    }
}
