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
        
        int N[] = new int [10];
        int pos;
        
        int n = sc.nextInt();
        int a = n;
        N[0] = n;
        int b;
        
        for(int i = 1; i < N.length ; i++){
            
            b = a*2;
            
            N[i] = b;
            
            a=b;
            
        }
        
        for(int i = 0; i < N.length ; i++){
            
            System.out.println("N["+i+"] = "+N[i]);  
            
        }
 
    }
 
}
