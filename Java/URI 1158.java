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
        
        int i, N = sc.nextInt();
        for(i=0; i<N; i++){
            
            int  X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X%2 == 0){
                X+=1;
                int k, sum=0;
                for(k=0; k<Y; k++){
                    sum += X;
                    X +=2;
                }
                System.out.println(sum);
            }
            else{
                int k, sum=0;
                for(k=0; k<Y; k++){
                    sum += X;
                    X +=2;
            }
            System.out.println(sum);
           
            }
        
        
        }
 
    }
 
}
