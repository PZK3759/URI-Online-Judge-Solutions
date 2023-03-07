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
        int k = 1;
        for(int i = 1; i <= N; i++){
            
            for(int j = 0; j<3; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.print("PUM\n");
            k+=1;
            
        }
 
    }
 
}
