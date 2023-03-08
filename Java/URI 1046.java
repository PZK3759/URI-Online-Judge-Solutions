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
        
        int start_time = sc.nextInt();
        int end_time = sc.nextInt();
        int duration = 24;
      
        if(start_time > end_time){
            duration = 24 + (end_time - start_time);
        }
        else if(start_time < end_time){
            duration = end_time - start_time;
        }
      
        /*else if(start_time == end_time){
            duration = 24; 
        } */
        
        System.out.println("O JOGO DUROU "+duration+" HORA(S)");
 
    }
 
}
