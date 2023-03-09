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
        int n [] = new int[1000];
        int j,i;
        
        
        for (i = 0, j = 0; i < n.length; i++) {
            n[i] = j;
            if(n[i] == t-1){
                j = 0;
            }
            else{
                j++;
            }
            System.out.println("N["+i+"] = "+n[i]);
        }
 
    }
 
}
