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
        
        
        int N = sc.nextInt();
        int num;
        String ch;
        int coel =0, rato = 0, sapo = 0, total = 0;
        
        for(int i = 1;i<=N;i++){
           num = sc.nextInt();
           ch = sc.next();
           
           if(ch.equals("C")){
                
                coel = coel + num;
                total = num+total;
            }
            if(ch.equals("R")){
                
                rato = rato+num;
                total = total+num;
                
            }
            if(ch.equals("S")){
                
                sapo = sapo+num;
                total = total+num;
            }
           
           
        }
        
        
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+coel);
        System.out.println("Total de ratos: "+rato);
        System.out.println("Total de sapos: "+sapo);
      
        float total_C_parcent = 0,total_R_parcent = 0, total_S_parcent = 0;
        total_C_parcent = (float)((coel * 100.00) /total);
        total_R_parcent = (float)((rato * 100.00) /total);
        total_S_parcent = (float)((sapo * 100.00) /total);
      
        System.out.printf("Percentual de coelhos: %.2f",total_C_parcent);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f",total_R_parcent);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f",total_S_parcent);
        System.out.print(" %\n");
 
    }
 
}
