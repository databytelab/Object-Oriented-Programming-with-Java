public class FutureTution {
    public static void main(String[] args) {
        double tution = 10000;
        int year = 0;
        while (tution < 20000) {
            tution = tution * 1.07;
            year++;
        }
        System.out.println("Tution will be doubled in " + year + " year ");
        System.out.printf("Tution will be $%.2f in %1d year ", tution, year );
    }  
}
