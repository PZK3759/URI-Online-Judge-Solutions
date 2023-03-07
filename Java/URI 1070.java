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
        
        int X = sc.nextInt();
        int i, count=0;
        
        while(count<6){
            if(X%2 !=0){
                count ++;
                System.out.println(X);
            }
            X++;
        }
 
    }
 
}
