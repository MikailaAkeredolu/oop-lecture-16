package zoo;

public class Tiger extends Feline{

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
}
