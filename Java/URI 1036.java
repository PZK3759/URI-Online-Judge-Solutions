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
        
        double a, b, c, d, x1, x2;
        double t = 2.0;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        d = Math.pow(b, t) - 4*a*c;
        
        if(a!=0 && b!=0 && c!=0 && d > 0){
        
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);
            
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
            
        }
        else{
            
            System.out.println("Impossivel calcular");
            
        }
 
    }
 
}
