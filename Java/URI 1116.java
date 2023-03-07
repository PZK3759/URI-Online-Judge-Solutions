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
        float X, Y, Z;
        
        for(int i = 1; i <= N; i++){
            
            X = sc.nextFloat();
            Y = sc.nextFloat();
            
            if(Y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                Z = X/Y;
                System.out.printf("%.1f\n", Z);
            }
              
        }
 
    }
 
}
