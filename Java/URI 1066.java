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
        
        int n, even,odd,pos, neg;
        even = 0;
        odd = 0;
        pos = 0;
        neg = 0;
        
        
        for(int i = 1; i<=5; i++){
            
            n = sc.nextInt();
            
            if(n%2 == 0){
                even +=1;
            }
            else if(n%2 != 0){
                odd +=1;
            }
            
            if(n>0){
                pos +=1;
            }
            else if(n<0){
                neg +=1;
            }
        }
        
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");
 
    }
 
}
