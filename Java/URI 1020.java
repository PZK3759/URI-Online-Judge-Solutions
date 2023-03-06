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
        
        int days = sc.nextInt();
        
        
        int year = days/365;
        days = days%365;
        
        int mon = days/30;
        days = days%30;
        
        
        System.out.println(year+" ano(s)");
        System.out.println(mon+" mes(es)");
        System.out.println(days+" dia(s)");
 
    }
 
}
