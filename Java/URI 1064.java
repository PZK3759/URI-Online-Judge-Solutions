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
        
        int num = 0;
        float n, sum = 0;
        
        for(int i =1; i<=6;i++){
            n = sc.nextFloat();
            if(n>0){
                num +=1;
                sum +=n;
            }
        }
        
        System.out.println(num+" valores positivos");
        System.out.printf("%.1f\n", sum/num);
 
    }
 
}
