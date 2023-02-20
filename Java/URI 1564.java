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
        
        int n;
        
        while(sc.hasNext()){
            
            n = sc.nextInt();
            if(n == 0){
                System.out.println("vai ter copa!");
            }
            else{
                System.out.println("vai ter duas!");
            }
            
        }
 
    }
 
}
