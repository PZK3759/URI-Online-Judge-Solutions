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
        int p;
        for(int i = 1; i<=N; i++){
            if(i%2 == 0){
                p = i*i;
                System.out.println(i+"^2 = "+p);
            }
        }
 
    }
 
}
