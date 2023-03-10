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
        
        for (int i = 0, j = 1; i < n; i++, j++) {
            System.out.print("Ho");
            if(j<n){
                System.out.print(" ");
            }
            else if(j == n){
                System.out.print("!\n");
            }
        }
 
    }
 
}
