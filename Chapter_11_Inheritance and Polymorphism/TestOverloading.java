public class TestOverloading {
    //  Main class
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

// Superclass B
class B {
    public void p(double i) {
        System.out.println("class B method: " + i*2);
    }
}
// Subclass A
class A extends B {
    // This method overloads the method in B
    public void p(int i){
        System.out.println("class A method: " + i);
    }
}
