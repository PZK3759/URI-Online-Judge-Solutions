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
        
        double w,m, A, B;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        
        A = A * 3.5;
        B = B * 7.5;
        
        w = A+B;
        m = w/11;
        
        System.out.printf("MEDIA = %.5f\n", m);
 
    }
 
}
