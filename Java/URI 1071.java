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
        
        if(X>Y){
            for(int i = X-1; i>Y; i-- ){
                if(i%2 != 0){
                    sum += i;
                }
            }
            
        }
        else if(Y>X){
            for(int i = Y-1; i>X; i--){
                if(i%2 !=0){
                    sum += i;
                }
            }
        }
        
        
        System.out.println(sum);
 
    }
 
}
