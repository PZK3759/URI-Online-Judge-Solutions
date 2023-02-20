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
        
        double A[] = new double [10];
        
        for(int i=0; i < A.length; i++){
            
            A[i] = sc.nextDouble();
            
            
            if(A[i] <= 10){
                
                System.out.println("A["+i+"] = "+A[i]);
                
            }
                
        }
      
 
    }
 
}
