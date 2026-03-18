import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.File;

public class mainFunction {
    static int number = 0;
    File file;
    public static void main(String[] args) {
        // try {
        //     file = shittyFileGenerator.run();
        // } catch (IOException e) {
        //     System.out.println("File creation error");
        // }
        
        number = shittyRandomGenerator.generate();
        try {
            shittyCodeGenerator.shittyCodeGenerator("rbq.java",number);
         } catch (IOException e) {
            System.out.println("shittyCodeGenerator error");
         }
         System.out.println("running");

    }
    
}
