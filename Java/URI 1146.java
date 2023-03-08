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
        
        int x; 
        
        while ((x = sc.nextInt()) != 0) {
            
            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.println(i);
                }
                else{
                    System.out.print(i+" ");
                }
            }
            
        }
 
    }
 
}
