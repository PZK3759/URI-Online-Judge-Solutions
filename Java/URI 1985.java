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
        double totalprice=0;
        
        for (int i = 0; i < n; i++) {
            
            int p = sc.nextInt();
            int qn = sc.nextInt();
            double price = 0;
            
            if(p == 1001){
                price = 1.50*qn;
            }
            if(p == 1002){
                price = 2.50*qn;
            }
            if(p == 1003){
                price = 3.50*qn;
            }
            if(p == 1004){
                price = 4.50*qn;
            }
            if(p == 1005){
                price = 5.50*qn;
            }
            totalprice += price;
            
        }
        
        System.out.printf("%.2f\n", totalprice);
 
    }
 
}
