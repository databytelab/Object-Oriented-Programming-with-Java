public class Animal {
    // Data fields of the animal class
    private int age;
    private String food;

    // Default Constructor of the animal class
    public Animal() {
    }
    // Constructor with arguments of the animal class
    public Animal(int age, String food) {
        this.age = age;
        this.food = food;
    }

    // Methods of the animal class
    public void age() {
        System.out.println("Age: " + age);
    }

    public void food() {
        System.out.println("Eat: " + food);
    }
}
