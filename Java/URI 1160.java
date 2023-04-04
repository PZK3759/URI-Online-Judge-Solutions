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
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            
            int pa = sc.nextInt(); // population of city a 
            int pb = sc.nextInt(); // population of city b
            
            double ga = sc.nextDouble(); // population growing rate of city a
            double gb = sc.nextDouble(); // population growing rate of city b
            
            
            int year = 0;
            
            while (pb>=pa) {
                    pa += (pa*ga)/100; //increasing population of city a
                    pb += (pb*gb)/100; // increasing population of city b
                    year++;
                    
                    if(year>100){
                        break;
                    }
                    
                }
            
            if(year>100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(year+" anos.");
            }
            
        }
 
    }
 
}
