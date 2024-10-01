package zoo;

public interface IPet {

    //abstract method
     void greetOwner();

     //default method
    default void printPetClassName(){
        System.out.println(this.getClass().getSimpleName());
    };

    //static methods
    static  void printPetGreetings(IPet[] pets){
        for(IPet pet : pets){
            pet.printPetClassName();
        }
    }
}
