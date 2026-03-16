import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class shittyRandomGenerator {
    
    static Random random = new Random();
    static double Power_1 = 3.0;
    static double Power_2 = 1.5;

    public static int generate() {

        double r = random.nextDouble();
        int value = -1;

        if (random.nextInt(2) == 1) {
            value = (int)(30 + Math.pow(r, Power_1) * 269);
        }else{
            value = (int)(50 - Math.pow(r, Power_2) * 40);
        }

        return value;
    }

    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(generate());
        }
    }
    
}