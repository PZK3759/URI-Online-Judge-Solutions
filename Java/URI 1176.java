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
       
       long fib[] = new long[61];
       fib[0] = 0;
       fib[1] = 1;
       
       
       for(int j = 2; j<fib.length; j++){
           
          fib[j] = fib[j-1] + fib[j-2];
           
       }
       
       
       int t = sc.nextInt();
       
       for(int i=0; i<t; i++){
           
           int n = sc.nextInt();
           System.out.print("Fib("+n+") = "+fib[n]+"\n");;
           
       }
 
    }
 
}
