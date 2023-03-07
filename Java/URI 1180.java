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
        
        int a[] = new int[n];
        int smol = 100, index = 0;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
            if (a[i]<smol) {
                smol = a[i];
                index = i;
            }
            
        }
        
        System.out.println("Menor valor: "+smol);
        System.out.println("Posicao: "+index);
 
    }
 
}
