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
        
        for(int i=1; i<= n; i++){
            int sum = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x>y){
                
                for(y = y+1; y < x; y++){
                    
                    if(y%2!=0){
                        sum +=y;
                    }
                    
                }
                System.out.println(sum);
            }
            else{
                
                for(x=x+1; x<y;x++){
                    
                    if(x%2!=0){
                        sum += x;
                    }
                    
                }
                System.out.println(sum);
            }
            
        }
 
    }
 
}
