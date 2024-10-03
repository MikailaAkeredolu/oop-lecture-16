package zoo;
//A dog is-A animal
public class Dog extends Canine implements HouseHoldPet {

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

    //unique to dogs
    public void fetch(){
        System.out.println("fetch a toy ball like a " + sex);
    }

    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void greetOwner() {
        System.out.println("wag tail and lick feet");
    }

//    @Override
//    public String toString(){
//        return " -> Name:  " + this.getName() + " -> Food:  " + this.getName() + " Sex " + this.sex ;
//
//    }
}
