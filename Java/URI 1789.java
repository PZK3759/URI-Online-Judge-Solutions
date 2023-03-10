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
        
        while (sc.hasNext()) {
            
            int n = sc.nextInt();
            int slug [] = new int[n];
            int max = 0;
            for (int i = 0; i < slug.length; i++) {
            
                slug[i] = sc.nextInt();
            
                if(max<slug[i]){
                    max = slug[i];
                }
            }
          
            if(max<10){
                System.out.println("1");
            }
            else if(10<= max && max < 20){
                System.out.println("2");
            }
            else if(20 <= max){
                System.out.println("3");
            }
            
        }
 
    }
 
}
