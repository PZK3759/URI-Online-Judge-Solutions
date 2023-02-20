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
        
        int x = sc.nextInt();
        double m = sc.nextDouble();
        double txp;
        while(x != 0 && m != 0){
            
            
            txp = x*m;
            System.out.println(String.format("%.0f", txp)); // String.format() method is used to convert the double type variable "txp" to string
            
            x = sc.nextInt();
            m = sc.nextDouble();
            
        }
 
    }
 
}
