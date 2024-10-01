package zoo;
//A dog is-A animal
public class Dog extends Canine {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String food) {
        super(name, food);
    }

    @Override
    public void makeNoise() {
        System.out.println("woof woof");
    }

    public void fetch(){
        System.out.println("fetch a toy ball like a " + sex);
    }

    @Override
    public String toString(){
        return " -> Name:  " + this.getName() + " -> Food:  " + this.getName() + " Sex " + this.sex ;

    }
}
