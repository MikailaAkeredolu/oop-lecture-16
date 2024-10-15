package umloop;

public class Main {
    public static void main(String[] args) {

        //Create an array named shoppingBag that contains the 3 clothing items below:
        Cloth cloth1 = new Cloth("Jeans", 20.0, Size.S); //element 1 - located at index position 0
        Cloth clothingItem2 = new Cloth("T-shirt", 8.0, Size.M); //element 2 - located at index position 1
        Cloth clothingItem3 = new Cloth("Hat", 2.0, Size.L); // element 3 -  located at index position 2
  //object
        //Creating an array of clothing items
        Cloth[] shoppingBag = {cloth1, clothingItem2, clothingItem3}; // Array Literal

        //Leverage the calculateSubTotal method to print out the subtotal of the clothing items in the shoppingBag.
         double subTotal= UtilityMethods.calculateSubTotal(shoppingBag);
         //Sample Expected output Subtotal of clothing items: $30.0
        System.out.println("Subtotal of clothing items: $" + subTotal);
        //Cloth[] shoppingBag = new Cloth[3];

        //Create 2 different student objects with the info below:
        //String name, Size size, Cloth[] clothingItems)
        Student student1 = new Student("Mike", Size.L, shoppingBag);
        Student student2 = new Student("Jane", Size.S, shoppingBag);

        Student[] students = {student1, student2};
        for(Student student : students){
            System.out.println("printing students info");
            student.printInfo();
        }
        System.out.println();

        Student.printStudentCounter();

       // HourlyEmployee hourlyEmployeew = new HourlyEmployee("Alex", Size.S, shoppingBag );
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex", Size.S, shoppingBag , 20.00, 40 );
        double returnedVale = hourlyEmployee.printPriceAfterDiscount(cloth1);
        System.out.println(returnedVale);
        hourlyEmployee.setHoursWorked(-100);
       // System.out.println(returnedVale);

       // checkFitting(Customer customer, Cloth clothingItem)
        boolean value =  UtilityMethods.checkFitting( hourlyEmployee, clothingItem3); //
        System.out.println(value);
        //ClassName.methodName() // they belong to the class
        System.out.println(
                UtilityMethods.checkFitting( hourlyEmployee, clothingItem3)
        );



        Manager manager = new Manager("Terrance", Size.L, shoppingBag);
        Manager assitantManager = new Manager("tj", Size.L, shoppingBag, 10000.0);
//        System.out.println(manager.getClass().getSimpleName());
        assitantManager.printInfo();

        System.out.println();

        Business business = new Business("Acme", 10000, 20);
        System.out.println("Is this biz taxable? : " + business.payTaxOnEarnings());




        //create an array of payable entities
        Payable[] payables = {hourlyEmployee, manager, business};

        UtilityMethods.printClassNamesOfPayableEntities(payables); //HourlyEmployee, Manager, Business

        UtilityMethods.checkCustomerDiscount(student1);
        UtilityMethods.checkCustomerDiscount(hourlyEmployee);
        UtilityMethods.checkCustomerDiscount(manager);

        Customer customerToEmployee = new Manager("Rick", Size.S, shoppingBag); // Polymorphism , Upcasting
        ((Manager)customerToEmployee).managerDiscount(); // down-casting



        System.out.println(((Manager)customerToEmployee).canGetFired());







    }
}
