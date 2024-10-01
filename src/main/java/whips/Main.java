package whips;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Bmw" );
        car.price = 30.0;

        Airplane airplane = new Airplane("Boeign747");
        airplane.price = 100.0;

        Horse horse = new Horse("Horsey");
        horse.price = 10.0;
        System.out.println(car);

    }
}
