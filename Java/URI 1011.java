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
        
        double area, pi, R;
        pi = 3.14159;
        R = sc.nextDouble();
        area = (4/3.0)*pi*R*R*R;
        System.out.printf("VOLUME = %.3f\n" ,area);
 
    }
 
}
