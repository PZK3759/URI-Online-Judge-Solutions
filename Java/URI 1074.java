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
        
        for(int i=0; i<N; i++){
            int X = sc.nextInt();
            
            if(X==0){
                System.out.println("NULL");
            }
            else if(X<0 && X%2 == 0){
                
                    System.out.println("EVEN NEGATIVE");
                }
            else if(X<0 && X%2 != 0){
                    System.out.println("ODD NEGATIVE");
                }
            
            else if(X>0 && X%2 == 0){
                
                    System.out.println("EVEN POSITIVE");
                }
            else if(X>0 && X%2 != 0){
                    System.out.println("ODD POSITIVE");
                }
            }
 
    }
 
}
