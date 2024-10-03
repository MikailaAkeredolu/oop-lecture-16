package umldemo;
//A person HAs_A ClothingItem
public abstract class Person implements Payable {
    private int id;
    private static int idCounter;
    private String name;
    private ClothingItem[] clothingItems;


    public Person(String name){
        this.name = name;
    }

    //overloaded constructor
    public Person(String name, ClothingItem[] clothingItems) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.clothingItems = clothingItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Person.idCounter = idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClothingItem[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(ClothingItem[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    //abstract method signature
    public abstract void printInfo();

    //ToString - concrete method

}
