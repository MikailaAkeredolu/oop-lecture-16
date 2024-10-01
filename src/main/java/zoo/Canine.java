package zoo;

public abstract class Canine extends Animal {
    public Canine() {
    }

    public Canine(String name) {
        super(name);
    }

    public Canine(String name, String food) {
        super(name, food);
    }
}
