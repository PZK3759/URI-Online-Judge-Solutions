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
        
        String nm;
        double  fix, sale;
        
        nm = sc.nextLine();
        fix = sc.nextDouble();
        sale = sc.nextDouble();
        
        sale = (sale*15)/100;
        fix = fix+sale;
        
        System.out.printf("TOTAL = R$ %.2f\n", fix);
 
    }
 
}
