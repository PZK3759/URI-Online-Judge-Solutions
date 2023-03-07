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
      
        int c1, c2, c3, c4;
        
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        c4 = sc.nextInt();
        
        if(c1 == 1){
            System.out.println("1");
        }
        else if(c2 == 1){
            System.out.println("2");
        }
        else if(c3 == 1){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
 
    }
 
}
