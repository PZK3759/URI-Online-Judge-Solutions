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
        
        int A, B, SOMA;
        
        A = sc.nextInt();
        B = sc.nextInt();
        SOMA = A+B;
        
        System.out.println("SOMA = " +SOMA);
 
    }
 
}
