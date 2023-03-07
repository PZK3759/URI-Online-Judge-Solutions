import java.io.IOException;


/**
 *
 *  @author Abdullah Al Zahin
 *
 */
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float a, b;
        float S = 1;
        
        for(a = 3, b = 2; a <= 39; a+=2, b*=2){
            
            S = S + (a/b);
        }
        
        System.out.printf("%.2f\n", S);
 
    }
 
}
