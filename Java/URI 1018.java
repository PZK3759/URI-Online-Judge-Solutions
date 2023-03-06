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
        
        if(n > 0 && n < 1000000){
            
            int values[] = {100,50,20,10,5,2,1}; 
            
            System.out.println(n);
            
            for (int i = 0; i < values.length; i++) {
                
                System.out.println(n/ values[i]+" nota(s) de R$ "+values[i]+",00");
                n = n % values[i];
                
            }
        }
 
    }
 
}
