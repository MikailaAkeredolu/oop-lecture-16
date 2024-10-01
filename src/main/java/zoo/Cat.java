package zoo;

public class Cat extends Feline{

    public boolean hasNineLives;

    public Cat() {

    }

    public Cat(String name) {
        super(name);

    }

    public Cat(String name, String food) {
        super(name, food);
    }

    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }

    public void scratch(){

        System.out.println("I scratch things");
    }
}
