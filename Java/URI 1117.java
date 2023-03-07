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
      
        int i = 0;
        float a, sum=0, media = 0;
        
        while(i != 2 ){
            
            a = sc.nextFloat();
            
            if(a >= 0.0 && a <= 10.0){
                
               sum = sum+a;
                i++;
                
            }
            else{
                 System.out.println("nota invalida");
            }
            
        }
        media = sum/2;
        System.out.printf("media = %.2f\n" ,media);
 
    }
 
}
