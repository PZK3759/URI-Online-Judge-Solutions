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
        
        int t, va;
        float f, dis;
        
        t = sc.nextInt();
        va = sc.nextInt();
        
        dis = t*va; // average speed*time = total distance traveled
        f = dis/12; // distance/12 = total fuel, cause the car can go 12km per liter 
        
        System.out.printf("%.3f" ,f);
 
    }
 
}
