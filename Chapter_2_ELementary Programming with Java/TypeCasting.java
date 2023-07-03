public class TypeCasting {
    public static void main(String[] args) {
        // int to double automatically
        double d = 3; // type widening (implicit casting)
        System.out.println("d is: "+d);
        
        // double to int manually
        int i = (int) 3.0; // type narrowing (explicit casting)
        System.out.println("i is: " + i);
        
        // effect of casting
        System.out.println("value of 1/2 in double is: " + (double) 1/2);
        System.out.println("value of 1/2 in int is: " + (int) 1/2);

        //Casting does not change the variable being cast.
        double x = 4.5;
        int y = (int)x;
        System.out.println("value of x: " + x);
        System.out.println("value of y: " + y);
    }
}




