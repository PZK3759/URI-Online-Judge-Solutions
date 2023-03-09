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
        
        double N [] = new double [100];
        double x = sc.nextDouble();
        
        for (int i = 0; i < N.length; i++) {
            
            N[i] = x;
            x = x/2.0000;
            
            System.out.print("N["+i+"] = ");
            System.out.printf("%.4f\n", N[i]);
        }
 
    }
 
}
