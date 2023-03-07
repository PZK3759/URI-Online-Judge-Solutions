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
        
        
        for(int i = 1; i<=X; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
 
    }
 
}
