public class Dog extends Animal {
    // Datafields of Dog class
    private String name;

    // Constructor from superclass
    Dog(int age, String food, String name){
        super(age, food);
        this.name = name;
    }
    // Methods of Dog class
    public void name(){
        System.out.println("Name: " + name);
    }
    public void bark(){
        System.out.println("Sound: Barking");
    }
}
