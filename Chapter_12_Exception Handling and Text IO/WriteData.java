import java.io.File;
import java.util.Date;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("Files/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        // Create a file
        PrintWriter output = new PrintWriter(file);
        // Write formatted output to the file
        output.print("Irfan Ahmad ");
        output.println(90);
        output.print("Natthorn ");
        output.println(85);
        output.close();
        
        // File properties
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));
    }
}
