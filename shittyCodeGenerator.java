import java.io.File;
import java.io.IOException;

public class shittyCodeGenerator {
    public static void main(String[] args) throws IOException {
        File file = new File("rbq.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}