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
        
        long a, b, bitxor;
        
        while(sc.hasNext()){
            
            a = sc.nextLong();
            b = sc.nextLong();
            
            bitxor = a^b; //bitwise XOR operation
            System.out.println(bitxor);
            
        }
 
    }
 
}
