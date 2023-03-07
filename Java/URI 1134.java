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
        
        int a, g, d;
        a=0;
        g = 0;
        d = 0;
        
        for(int i = 1; i<10; ){
            int N = sc.nextInt();
            if(N == 4){
                break;
            }
            if(N == 1){
                a += 1;
            }
            if(N == 2){
                g += 1;
            }
            if(N == 3){
                d += 1;
            }
             
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
 
    }
 
}
