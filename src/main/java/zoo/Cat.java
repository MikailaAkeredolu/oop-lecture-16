package zoo;

public class Cat extends Feline implements IPet{

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

    //unique to cats
    public void scratch(){

        System.out.println("I scratch things");
    }

    @Override
    public void greetOwner() {
        System.out.println("lick face");
    }
}
