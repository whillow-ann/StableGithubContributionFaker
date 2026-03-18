import java.io.File;
import java.io.IOException;

public class shittyFileGenerator {
    public static File run() throws IOException {
        File file = new File("rbq.java");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
        return file;
    }
}