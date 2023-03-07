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
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            String ff = sc.next();
            int led = 0;
            
            for (int j = 0; j<ff.length() ; j++) {
                if(ff.charAt(j) == '1'){
                    led += 2;
                }
                if(ff.charAt(j) == '7'){
                    led += 3;
                }
                if(ff.charAt(j) == '2' || ff.charAt(j) == '3' || ff.charAt(j) == '5'){
                    led += 5;
                }
                if(ff.charAt(j) == '4'){
                    led += 4;
                }
                if(ff.charAt(j) == '6' || ff.charAt(j) == '9' || ff.charAt(j) == '0'){
                    led += 6;
                }
                if(ff.charAt(j) == '8'){
                    led += 7;
                }
            }
            
            System.out.println(led+" leds");
            
        }
 
    }
 
}
