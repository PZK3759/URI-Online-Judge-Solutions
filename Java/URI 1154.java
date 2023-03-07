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
      
       int age;
       float  avr = 0,sum = 0,k=0;
       int i = 0;
       while(i < 2){
           
           age = sc.nextInt();
           
           if(age>0){
               
               sum = age+sum;
               k++;
           }
           else{
               break;
           }
           
       }
       
       avr = sum/k;
       System.out.printf("%.2f\n", avr);
 
    }
 
}
