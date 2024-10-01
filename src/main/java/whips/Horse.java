package whips;

public class Horse extends Vehicle{
    public Horse(String name, int speed ) {
        super(name, speed);
    }

    @Override
    public void printSpeedOfVehicle() {
        System.out.println(this.getSpeed());
    }
}
