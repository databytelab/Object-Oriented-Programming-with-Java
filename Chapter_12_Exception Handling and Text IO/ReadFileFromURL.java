import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;

public class ReadFileFromURL {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String URLString = input1.next();
        input1.close();
        // Create a URL object
        try {
            URL url = new URL(URLString);
            int count = 0;
            // Scanner object to read from URL
            Scanner input2 = new Scanner(url.openStream());
            while (input2.hasNext()) {
                // Read a line
                String line = input2.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        }
        // MalformedURLException
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        // IOException
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
