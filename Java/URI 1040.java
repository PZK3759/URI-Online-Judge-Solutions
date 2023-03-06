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
        
        float N1,N2,N3,N4;
        
        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        
        N1 = N1*2;
        N2 = N2*3;
        N3 = N3*4;
        N4 = N4*1;
        
        float media = (N1+N2+N3+N4)/10;
        
        
        
        if(media>=7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            
            float ne = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", ne);
            
            double media2 = (media+ne)/2.0;
            
            if(media2 >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",media2);
        }
        else if(media < 5.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
 
    }
 
}
