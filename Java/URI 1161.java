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
        
        int m, n;
        
        while(sc.hasNext()){
            m = sc.nextInt();
            n = sc.nextInt();
            
            long factm=1, factn=1;
            
            for(int i = m; i > 0; i--){
            
            factm = factm*i;
            
            }
            for (int j = n; j > 0; j--) {
                factn = factn*j;
            }
            
            System.out.println(factm+factn);
            
        }
 
    }
 
}
