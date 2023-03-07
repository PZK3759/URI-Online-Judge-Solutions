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
        
        int given_pass;
        int correct_pass = 2002;
        
        while((given_pass = sc.nextInt()) != correct_pass){
            
            System.out.println("Senha Invalida");
            
        }
        
        System.out.println("Acesso Permitido");
 
    }
 
}
