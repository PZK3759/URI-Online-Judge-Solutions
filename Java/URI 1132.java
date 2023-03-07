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
        int Y = sc.nextInt();
        int sum = 0;
        int temX = Math.max(X, Y);
        int temY = Math.min(X, Y);
        
        for(int i = temY; i<=temX; i++){
            
            if(i%13 != 0){
                sum +=i;
            }
            
        }
        
        System.out.println(sum);
 
    }
 
}
