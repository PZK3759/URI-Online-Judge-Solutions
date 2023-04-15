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
        
        int N = sc.nextInt();
        
        for(int i = 0; i<N;i++){
            
            int X = sc.nextInt();
            boolean p = true;
            for(int j = 2; j < X; j++){
                if(X % j ==0){
                    p = false;
                    break;
                }
                
            }
            if(p){
                
                System.out.println(X+" eh primo");
            }else{
                System.out.println(X+" nao eh primo");
            }
           
        }
 
    }
 
}
