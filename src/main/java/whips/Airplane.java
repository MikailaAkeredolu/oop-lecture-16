package whips;

public class Airplane extends Vehicle{

    public Airplane(String name) {
        super(name);
    }

    @Override
    public void printSpeedOfVehicle() {
        System.out.println(this.getSpeed());
    }
}
