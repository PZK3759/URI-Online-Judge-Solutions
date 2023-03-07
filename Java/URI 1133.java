import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 *  @author Abdullah Al Zahin
 *
 */
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int Xa = Math.max(X, Y);
        int Ya = Math.min(X, Y);
        
        for(int i = Ya+1; i < Xa; i++){
            
            if(i%5 == 2 || i%5 == 3){
                System.out.println(i);
            }
            
        }
 
    }
 
}
