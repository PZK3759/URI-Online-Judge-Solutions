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
      
        int code1, unit1;
        float price1;
        
        int code2, unit2;
        float price2;
        
        code1 = sc.nextInt();
        unit1 = sc.nextInt();
        price1 = sc.nextFloat();
        
        code2 = sc.nextInt();
        unit2 = sc.nextInt();
        price2 = sc.nextFloat();
        
        float tp1 = unit1*price1;
        float tp2 = unit2*price2;
        float totalprice = tp1+tp2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" ,totalprice);
      
 
    }
 
}
