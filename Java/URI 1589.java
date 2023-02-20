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
        
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
            
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            
            int maxr = r1+r2;
            System.out.println(maxr);
 
    }
 
}
