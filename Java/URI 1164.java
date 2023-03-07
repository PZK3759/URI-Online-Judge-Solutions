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
        
        for(int i = 0; i < n; i++){
            
            int x = sc.nextInt();
            int sum = 0;
            for(int j = 1; j < x; j++){
                
                if(x%j == 0){
                    
                    sum +=j;
                }
                
            }
            
            if(sum == x){
                
                System.out.println(x+" eh perfeito");
                
            }
            else{
                System.out.println(x+" nao eh perfeito");
            }
        }
 
    }
 
}
