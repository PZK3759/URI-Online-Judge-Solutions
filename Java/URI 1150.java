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
        
        int x = sc.nextInt();
        int z = sc.nextInt();
        int sum = 0, t = 0;
                
        while(z<=x){
            z = sc.nextInt();
        }
        
        for (int i = x; sum < z; i++, t++) {
            sum += i;
        }
        System.out.println(t);
 
    }
 
}
