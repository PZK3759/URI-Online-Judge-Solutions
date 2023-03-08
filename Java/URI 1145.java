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
        int x = sc.nextInt();
        
        if (n<x) {
            for (int i = 1; i <= x; i++) {
                if(i != x){
                    System.out.print(i);
                    if(i%n == 0){
                        System.out.println();
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.println(i);
                }
            }
        }
 
    }
 
}
