package whips;

public abstract class Vehicle extends Product {

    private int speed;
    protected Double price; //

    public Vehicle(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    // Two different ways to create vehicles in my program
    public Vehicle(String name, Double price) {
        super(name);
        this.price = price;
    }

    public abstract void printSpeedOfVehicle();

    // a way to print the speed of any vehicle
    public int getSpeed() {
        return speed;
    }

    //a way to print all the speeds of all vehicles
    public void printAllSpeeds (Vehicle[] vehicles){
        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.getSpeed());
        }
    }

    //A String representation of a vehicle object

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }



    //Make a bunch of classes:
    // One named Car, another named Horse, AirPlane
    //create an instance of each class (object)

}
