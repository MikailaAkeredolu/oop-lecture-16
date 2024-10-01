package whips;

public class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void printSpeedOfVehicle() {
        System.out.println(this.getSpeed());
    }
}
