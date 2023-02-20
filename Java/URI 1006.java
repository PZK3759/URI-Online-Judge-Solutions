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
        
        double A, B, C, m;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        A = A*2;
        B = B*3;
        C = C*5;
        
        m = (A+B+C)/10;
       
       System.out.printf("MEDIA = %.1f\n", m);
 
    }
 
}
