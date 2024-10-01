package zoo;
//Every object has - id,state,behavior

public abstract class Animal {
    //State
    private String name;
    private String food;
    private int age;  //access Modifier
    protected char sex;

    //default constructor
    public Animal(){}

    //parameterized constructor
    public Animal(String name){
           this.name = name;
    }
    //overload the constructor
    public Animal(String name, String food){
        this.name = name;
        this.food = food;
    }

    //getter
    public int getAge(){
        return this.age;
    }

    //setter
    public void setAge(int age){
        if(age > 0 ){
            this.age = age;
        }else{
            System.out.println("Error.Age must be greater than 0");
        }

    }

    //Method - Behavior
    public void eat(){
        System.out.println(this.food);
    }


    public abstract void makeNoise();     //abstract method - signature - it has no body

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    //String representation of an object
    @Override
     public String toString(){
        return " -> Name:  " + this.name + " -> Food:  " + this.food ;

     }

}
