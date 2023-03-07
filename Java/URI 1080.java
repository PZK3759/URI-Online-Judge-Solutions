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
        int N, i = 1;
        int pos = 0, high = 0;
        
        while(i<=100){
            
            N = sc.nextInt();
            if(N>high){
                pos = i;
                high = N;
            }else{
                pos = pos;
                high = high;
            }
            i++;
        }
        
        System.out.print(high+"\n"+pos+"\n");
 
    }
 
}
