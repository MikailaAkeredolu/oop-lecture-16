package zoo;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Catty", "Milk");
        cat.scratch();
        cat.setAge(4);
        //System.out.println(cat);

        Dog dog = new Dog("Bingo", "Bones");
        dog.fetch();
        dog.setAge(67);
        dog.sex = 'F';

        Wolf wolf = new Wolf("Ralph", "Deer");
        //System.out.println(wolf);

        Tiger tiger = new Tiger("Jessy", "gators");
        //System.out.println(tiger);

        Animal[] animals = {dog, cat, wolf, tiger};

        for(Animal animal : animals){
            animal.makeNoise();
        }










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
