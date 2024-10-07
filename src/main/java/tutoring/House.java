package tutoring;
//blueprint - template for constructing houses in a development
public abstract class House implements Sellable{
    //Encapsulation
    private int address;
    private static int houseCounter;
    private int bedrooms;
    private int door;
    private int kitchen;
    private double bathrooms;
    protected boolean hasRoof;
    protected double propertyLength, propertyWidth;

    public House(int bedrooms, int bathrooms){
        houseCounter++;
        this.address = houseCounter;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

//abstract method - method signature ..no {body}
    public abstract double calcSquareFootage();

    public int getAddress() {
        return address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public static int getHouseCounter() {
        return houseCounter;
    }

    public int getDoor() {
        return door;
    }

    //set the number of doors
    public void setDoor(int someNumberOfDoors){

        if(someNumberOfDoors > 0 ){
            this.door = someNumberOfDoors;
        }else{
            System.out.println("Error. Doors must be greater than 0");
        }

    }

    public int getKitchen() {
        return kitchen;
    }

    public double getBathrooms() {
        return bathrooms;
    }
}
