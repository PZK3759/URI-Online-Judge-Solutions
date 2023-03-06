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
        
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        int temA = Math.min(A, Math.min(C, B));
        int temB = 0;
        int temC = 0;
        
        if(temA == A){
            temB = Math.min(C, B);
            temC = Math.max(C, B);
        }
        if(temA == B){
            temB = Math.min(A, C);
            temC = Math.max(A, C);
        }
        if(temA == C){
            temB = Math.min(A, B);
            temC = Math.max(A, B);
        }
        
        System.out.print(temA+"\n"+temB+"\n"+temC+"\n");
        System.out.println();
        System.out.print(A+"\n"+B+"\n"+C+"\n");
 
    }
 
}
