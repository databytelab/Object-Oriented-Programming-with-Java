public class toStringMethod2 {
    // Main class
    public static void main(String[] args) {
        Student student = new Student("Irfan");
        // With overridding to_String method
        System.out.println(student.toString());
    }
}

class Student {
    private String name;

    // Constructor with arguments
    Student(String name) {
        this.name = name;
    }
    // return name
    public String getName() {
        return name;
    }
    // to_String method is overriden
    public String toString() {
        return ("The name of the student is " + name);
    }
}
