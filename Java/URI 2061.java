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
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String x = "fechou";
        String y = "clicou";
        
        for(int i = 0; i <= m; i++){
            
            String s = sc.nextLine();
            
            if(s.equals(x)){
              
                n+=1;
                
            }
            else if(s.equals(y)){
                n-=1;
            }
            
        }
        System.out.println(n);
 
    }
 
}
