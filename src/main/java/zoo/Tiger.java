package zoo;

public class Tiger extends Feline implements IPet, Endangered{

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, String food) {
        super(name, food);
    }

    @Override
    public void makeNoise() {
        System.out.println("rooar in tiger style...36 chambers");
    }

    @Override
    public void greetOwner() {
        System.out.println("greets in tiger style");
    }

    @Override
    public boolean isEndangered() {
        return true;
    }
}
