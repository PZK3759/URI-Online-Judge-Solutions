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
        
        int i = 0;
        int N,M;
        
        
        while(((M = sc.nextInt()) > 0) && ((N = sc.nextInt()) > 0)){
            int sum = 0;
            if(M>N){
                
                for(N = N; N<=M; N++){
                    sum += N;
                    System.out.print(N+" ");
                }
                
            }
            else{
                for(M = M; M<=N; M++){
                    sum += M;
                    System.out.print(M+" ");
                }
            }
            System.out.print("Sum="+sum+"\n");
            
        }
 
    }
 
}
