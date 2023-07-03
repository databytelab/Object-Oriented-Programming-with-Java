class Animal2 {
    public void animalSound(){
        System.out.println("The animals makes a sound");
    }  
}

class Dog extends Animal2 {
    public void animalSound(){
        System.out.println("The dog bark.");
    }
}

class Cat extends Animal2{
    public void animalSound(){
        System.out.println("The cat says meow meow");
    }
}

