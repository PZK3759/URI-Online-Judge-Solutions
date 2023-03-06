import java.io.IOException;
import java.util.Scanner;


/**
 *
 *  @author Abdullah Al Zahin
 *
 */
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int X;
        float Y;
        
        X = sc.nextInt();
        Y = sc.nextFloat();
        
        System.out.printf("%.3f km/l\n", X/Y);
 
    }
 
}
