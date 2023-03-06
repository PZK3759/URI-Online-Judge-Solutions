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
        
        float A,B,C;
        
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        
        if(A+B > C && B+C > A && A+C > B){
            float para = A+B+C;
            System.out.printf("Perimetro = %.1f\n",para);
        }
        else{
            float area = ((A+B)/2)*C;
            System.out.printf("Area = %.1f\n",area);
        }
 
    }
 
}
