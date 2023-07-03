public class TestOverriding {
    // Main class
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

// Superclass B
class B {
    public void p(double i){
        System.out.println("Method of class B: " + i * 2);
    }
}
// Subclass A
class A extends B {
    // This method overrides the method in B.
    @Override  // writting @override is optional
    public void p(double i){
        System.out.println("Method of class A: " + i);
    }
}
