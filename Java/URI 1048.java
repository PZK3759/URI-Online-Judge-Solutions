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
        
        float A = sc.nextFloat();
        
        if( A>=0 && A <= 400 ){
            float p = (A*15)/100;
            float newA = p+A;
            System.out.printf("Novo salario: %.2f\n",newA);
            System.out.printf("Reajuste ganho: %.2f\n", p);
            System.out.println("Em percentual: "+15+" %");
        }
        if(A > 400 && A<=800){
            float p = (A*12)/100;
            float newA = p+A;
            System.out.printf("Novo salario: %.2f\n",newA);
            System.out.printf("Reajuste ganho: %.2f\n", p);
            System.out.println("Em percentual: "+12+" %");
        }
        if(A>800 && A <=1200){
            float p = (A*10)/100;
            float newA = p+A;
            System.out.printf("Novo salario: %.2f\n",newA);
            System.out.printf("Reajuste ganho: %.2f\n", p);
            System.out.println("Em percentual: "+10+" %");
        }
        if(A>1200 && A<=2000){
            float p = (A*7)/100;
            float newA = p+A;
            System.out.printf("Novo salario: %.2f\n",newA);
            System.out.printf("Reajuste ganho: %.2f\n", p);
            System.out.println("Em percentual: "+7+" %");
        }
        if(A>2000){
            float p = (A*4)/100;
            float newA = p+A;
            System.out.printf("Novo salario: %.2f\n",newA);
            System.out.printf("Reajuste ganho: %.2f\n", p);
            System.out.println("Em percentual: "+4+" %");
        }
 
    }
 
}
