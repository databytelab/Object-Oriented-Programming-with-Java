public class ExtractName {
    public static void main(String[] args) {
        String fullName = "Irfan Ahmad";
        int k = fullName.indexOf(" ");

        String firstName = fullName.substring(0, k);
        String lastName = fullName.substring(k+1);
        System.out.println("The first name is: " + firstName);
        System.out.println("The last name is: " + lastName); 
    }  
}
