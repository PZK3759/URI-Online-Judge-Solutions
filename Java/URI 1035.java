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
        
        int A, B, C, D;
       
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        if(A%2 ==0){
            
            if(B>C && D>A){
                
                if(C+D > A+B){
                    
                    if(D>0 && C>0){
                        
                        System.out.println("Valores aceitos");
                        
                    }
                    else{
                        
                        System.out.println("Valores nao aceitos");
                        
                    }
                    
                }
                else {
                    
                    System.out.println("Valores nao aceitos");
                    
                }
                
                
            }
            else{
                   System.out.println("Valores nao aceitos");
            }
            
        }
        else{
            
            System.out.println("Valores nao aceitos");
        }
 
    }
 
}
