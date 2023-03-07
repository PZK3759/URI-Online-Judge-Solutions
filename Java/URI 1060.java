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
      
        float n1,n2,n3,n4,n5,n6;
        int num;
        
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        n5 = sc.nextFloat();
        n6 = sc.nextFloat();
        num = 0;
        
        if(n1>0){
            num = num+1;
        }
        if(n2>0){
            num = num+1;
        }
        if(n3>0){
            num = num+1;
        }
        if(n4>0){
            num = num+1;
        }
        if(n5>0){
            num = num+1;
        }
        if(n6>0){
            num = num+1;
        }
        
        System.out.println(num+" valores positivos");
 
    }
 
}
