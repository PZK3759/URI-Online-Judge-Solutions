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
        
        int X[] = new int[10];
        int pos;
        
        for(int i = 0; i<10; i++){
            
            X[i] = sc.nextInt();
            pos = i;
            
            if(X[i]<=0){
                
                X[i] = 1;
                
            }
            
            
            System.out.println("X["+pos+"] = "+X[i]);
            
        }
 
    }
 
}
