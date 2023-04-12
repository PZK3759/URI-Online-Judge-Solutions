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

        String quote = "LIFE IS NOT A PROBLEM TO BE SOLVED, BUT A REALITY TO BE EXPERIENCED";
        int n = sc.nextInt();
        System.out.println(quote.substring(0, n));
 
    }
 
}
