import java.io.IOException;


/**
 *
 *  @author Abdullah Al Zahin
 *
 */
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double a = 1;
        double S = 0;
        
        for(double i = 1; i <= 100; i++){
            
            S = S + (a/i);
            
        }
        
        System.out.printf("%.2f\n", S);
 
    }
 
}
