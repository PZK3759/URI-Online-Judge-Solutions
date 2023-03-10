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
        
        int n = sc.nextInt();
        int minimum = 100;
        int posmini = 0;
        
        for (int i = 1; i <= n; i++) {
            
            int t = sc.nextInt();
            if(t<minimum){
                minimum = t;
                posmini = i;
            }
        }
        System.out.println(posmini);
 
    }
 
}
