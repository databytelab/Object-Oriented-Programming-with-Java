public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 6;
        int b = a++; // postincrement (same as a = a+1)
        int c = ++a; // preincrement
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
        System.out.println("------------------");

        int x = 6;
        int y = x--; //postdecrement (same as x = x-1)
        int z = --x; //predecrement
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z is: " + z);
    }
}

