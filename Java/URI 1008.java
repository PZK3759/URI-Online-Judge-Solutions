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
      
      int n,wh;
      float sh, sal;
      
      n = sc.nextInt();
      wh = sc.nextInt();
      sh = sc.nextFloat();
      
      sal = wh*sh;
      
      System.out.println("NUMBER = "+n);
      System.out.printf("SALARY = U$ %.2f\n" ,sal);
 
    }
 
}
