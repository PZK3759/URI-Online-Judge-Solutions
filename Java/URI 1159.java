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
        
       int n;
       while((n = sc.nextInt()) != 0){
           int sum =0;
           
           for(int i = n,k = 1; k <= 5; i++){
               if(i%2 == 0){
                   sum += i;
                   k+=1;
               }
               
           }
           System.out.print(sum+"\n");
       }
 
    }
 
}
