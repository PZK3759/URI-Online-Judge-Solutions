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
        
        int sec = sc.nextInt();
        
        int min = sec/60;
        int h = min/60;
        
        min = min%60;
        sec = sec%60;
      
        System.out.println(h+":"+min+":"+sec);
 
    }
 
}
