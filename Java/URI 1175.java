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
        
        int n[] = new int [20];
        int m[] = new int [n.length];
        
        for(int i = 0; i<n.length; i++){
            
            n[i] = sc.nextInt();
                
        }
        
        int j = n.length;
        for(int i = 0; i<n.length; i++){
            
            m[i] = n[j-1];
            j--;
            
        }
        
        
        for(int i = 0; i<m.length; i++){
            
            System.out.println("N["+i+"] = "+m[i]);
            
        }
 
    }
 
}
