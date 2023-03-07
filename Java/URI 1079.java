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
        
        int N = sc.nextInt();
        int i = 1;
        float a,b,c, ave;
        
        while(i<=N){
            
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            
            a = a*2;
            b = b*3;
            c = c*5;
            ave = (a+b+c)/10;
            System.out.printf("%.1f\n",ave);
            i++;
        }
 
    }
 
}
