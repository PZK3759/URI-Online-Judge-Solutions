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
        
        double x1, x2, y1, y2, dis, tw;
        
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        double x= x2 - x1;
        double y = y2 - y1;
        tw = 2.00;
        
        dis = Math.sqrt(Math.pow(x, tw) + Math.pow(y, tw));
        
        System.out.printf("%.4f\n", dis);
 
    }
 
}
