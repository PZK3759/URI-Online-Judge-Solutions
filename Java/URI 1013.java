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
        
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int abs1 = Math.abs(a-b); // getting absulute value of (a-b)
        int lar1 = (a+b+abs1)/2;
        
        int abs2 = Math.abs(lar1-c);
        int lar = (lar1+c+abs2)/2;
        
        System.out.println(lar+ " eh o maior");
 
    }
 
}
