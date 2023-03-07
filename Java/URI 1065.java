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
        int n,num=0;
        
        for(int i = 1; i<=5; i++){
            n = sc.nextInt();
            if(n%2 == 0){
                num +=1;
            }
        }
        System.out.println(num+" valores pares");
 
    }
 
}
