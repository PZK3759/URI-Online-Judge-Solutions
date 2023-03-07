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
        
        int A = sc.nextInt();
        int N = sc.nextInt();
        int sum=0;
        
        for(int i = N; i <= 0;){
            
            N = sc.nextInt();
            if(N>0){
                break;
            }
        }
        
        for(int i=0; i<N; i++){
            
            sum = sum+A;
            A++;
            
        }
        
        System.out.println(sum);
 
    }
 
}
