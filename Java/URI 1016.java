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
        
        int k, m;
        k = sc.nextInt();
        
        m = k*2; // cause the car takes 2 minutes to get 1km of distance
        
        System.out.println(m+" minutos");
 
    }
 
}
