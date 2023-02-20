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
        
        int t = sc.nextInt();
        int num_cor = 0;
        
        for(int i=0; i<5; i++){
            
            int f = sc.nextInt();
            
            if(f == t){
                
                num_cor += 1;
                
            }
            
        }
        
        System.out.println(num_cor);
 
    }
 
}
