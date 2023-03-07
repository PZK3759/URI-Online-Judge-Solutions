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
        
        int a = 0,b = 1,sum = 0;
        int N = sc.nextInt();
        
        if(N<46){
            
            System.out.print(a+" "+b);
            
            for(int i = 1; i <= N-2; i++){
                
                sum = a+b;
                System.out.print(" "+sum);
                
                a=b;
                b=sum;
                
                
            }
            
        }
        System.out.print("\n");
 
    }
 
}
