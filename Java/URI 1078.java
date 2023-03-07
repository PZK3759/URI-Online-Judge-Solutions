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
        int i = 1;
        while(i<=10){
            System.out.println(i+" x "+N+" = "+N*i);
            i++;
        }
 
    }
 
}
