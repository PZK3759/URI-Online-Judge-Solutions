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
        
        String [] input;
        
        input = sc.nextLine().split(" ");
        
        int code, unit;
        double price;
        
        code = Integer.parseInt(input[0]);
        unit = Integer.parseInt(input[1]);
        
        switch(code){
            case 1:
                price = 4.00*unit;
                System.out.printf("Total: R$ %.2f\n", price);
                break;
                
            case 2:
                price = 4.50*unit;
                System.out.printf("Total: R$ %.2f\n", price);
                break;
                
            case 3:
                price = 5.00*unit;
                System.out.printf("Total: R$ %.2f\n", price);
                break;
                
            case 4:
                price = 2.00*unit;
                System.out.printf("Total: R$ %.2f\n", price);
                break;
                
            case 5:
                price = 1.50*unit;
                System.out.printf("Total: R$ %.2f\n", price);
                break;
             
            default:
                break;
                
        }
 
    }
 
}
