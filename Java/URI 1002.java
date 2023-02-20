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
        
        double A, R, pi;
        pi = 3.14159;
        R = sc.nextDouble();
        A = pi*R*R;
        
        System.out.printf("A=%.4f\n", A);
 
    }
 
}
