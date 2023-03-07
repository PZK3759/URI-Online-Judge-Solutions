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
        
        int n = sc.nextInt();
        int fact=1;
        
        for(int i = n; i > 0; i--){
            
            fact = fact*i;
            
        }
        
        System.out.println(fact);
 
    }
 
}
