package umloop;

public class Main {
    public static void main(String[] args) {

        Cloth cloth1 = new Cloth("Jeans", 20.0, Size.S); //element 1 - located at index position 0
        Cloth clothingItem2 = new Cloth("T-shirt", 8.0, Size.M); //element 2 - located at index position 1
        Cloth clothingItem3 = new Cloth("Hat", 2.0, Size.L); // element 3 -  located at index position 2
  //object
        //Creating an array of clothing items
        Cloth[] shoppingBag = {cloth1, clothingItem2, clothingItem3}; // Array Literal
        //Cloth[] shoppingBag = new Cloth[3];

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex", Size.S, shoppingBag );
        double returnedVale = hourlyEmployee.printPriceAfterDiscount(cloth1);
       // System.out.println(returnedVale);

       // checkFitting(Customer customer, Cloth clothingItem)
     UtilityMethods.checkFitting( hourlyEmployee, clothingItem3); //
        //ClassName.methodName() // they belong to the class
        System.out.println(
                UtilityMethods.checkFitting( hourlyEmployee, clothingItem3)
        );

        Manager manager = new Manager("Terrance", Size.L, shoppingBag);
        Manager assitantManager = new Manager("tj", Size.L, shoppingBag, 10000.0);
//        System.out.println(manager.getClass().getSimpleName());

        Business business = new Business("Acme", 10000, 20);



        //create an array of payable entities
        Payable[] payables = {hourlyEmployee, manager, business};

        UtilityMethods.printClassNamesOfPayableEntities(payables); //HourlyEmployee, Manager, Business




    }
}
