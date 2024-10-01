package zoo;
//id, state, behavior
public class Zoo {

    public static void main(String[] args) {


        Cat cat = new Cat("Catty", "Milk"); // created on the heap
       // System.out.println(cat);
        //cat.scratch();
        cat.setAge(4);
        //System.out.println(cat);
        //System.out.println( cat.getId() );

       // System.out.println("total animals created");


        Dog dog = new Dog("Bingo", "Bones");

        Animal dogToCat = new Dog("Dog_ah_Cat", "noodles");  // upcasted
//        dogToCat.eat();
//        System.out.println(dogToCat instanceof Animal);

        //((Dog)dogToCat).fetch(); //down casted


        //System.out.println(dog);
        //dog.fetch();
        dog.setAge(67);
        dog.sex = 'F';
        //System.out.println( dog.getId() );

        Wolf wolf = new Wolf("Ralph", "Deer");
        //System.out.println(wolf);
        //System.out.println( wolf.getId() );

        Tiger tiger = new Tiger("Jessy", "gators");
        //System.out.println(tiger);
        //System.out.println( tiger.getId() );

        //System.out.println(Animal.getAnimalCount());
        //Animal.printUniqueAnimalMethod(cat);
        RoboticDog roboticDog = new RoboticDog();

        Animal[] animals = {dog, cat, wolf, tiger };


        System.out.println("======================");

        IPet[] pets = {roboticDog, dog, cat};
        IPet.printPetGreetings(pets);













        //ClassName referenceVariableName = new ClassName();
        //Animal animal1 = new Animal("Cow", "Grass");
        //referenceVariableName.property;
        //animal1.food = "Grass";
        //animal1.age = 12;
        //System.out.println(animal1);
        //referenceVariableName.method();
        //animal1.eat();

        //Animal animal2 = new Animal();
        //animal2.name = "Dog";
        //animal2.food = "Bones";
        //animal2.age = -99;
        //Animal animal2 = new Animal("Dog", "bones");
        //animal2.setAge(-99); //setAge(int age)
        //animal2.eat();
        //System.out.println(animal2.getAge());
        //System.out.println(animal2.getName());





    }
}
