import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class shittyCodeGenerator {

    static String[] randomWords1 = {"Skibidi ", "Omega ", "Gigachad ", "Cringe ", "sigma ", "bussin' ","SYBAU ","UWU ",
    "Zesty ", "goofy ahh ", "Rizz "};
    static String[] randomWords2 = {"67 ", "bussi ", "toliet ", "drip ", "aura ", "fire ", "dih ", "GOAT ", "gyatt ", 
    "sussy baka ","balls "};
    static String[] randomWords3 = {"be yappin' ", "fanum taxed ", "is joever ", "jestermaxxing ", "slaps", "sus ",
    "locked in ", "looksmaxxing ", " lowkirksixsevenuinely moged ", "moged ","rage-baiting ", "SDIYBTing ", "simp ",
    "touching grass ", "tweaking ","vibe check ","washed ","gooning "
    };
    static String[] randomWords4 = {"frfr", "no shit", "L", "W", "no cap", "twin","ratio", "KYS", "cooked", "moged ",
    "caught in 4K", "bruh"
    };
    
    public static void shittyCodeGenerator(String filename, int lines) throws IOException {
        FileWriter fw = new FileWriter(filename);

        fw.write("import java.io.File;\nimport java.io.FileWriter;\nimport java.io.IOException;\n\npublic class rbq{\n    public static void main() {\n");

        for (int i = 0; i < lines; i++) {
            String line = randomWords1[(int)(Math.random() * randomWords1.length)];
            line = line + randomWords2[(int)(Math.random() * randomWords2.length)];
            line = line + randomWords3[(int)(Math.random() * randomWords3.length)];
            line = line + randomWords4[(int)(Math.random() * randomWords4.length)];
            fw.write("      System.out.println(\"" + line + "\");\n");
        }

        fw.write("  }\n}");

        fw.close();
    }

    public void main() throws IOException {
        shittyCodeGenerator("rbq.java",5);
    }
}