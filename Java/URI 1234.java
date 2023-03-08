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
        
        while(sc.hasNext()){
            
            boolean upper = true;
            
            StringBuilder fr = new StringBuilder(sc.nextLine());
            
            for (int i = 0; i < fr.length(); i++) {
                char f = fr.charAt(i);
                
                if(Character.isAlphabetic(f)){
                    
                    if(upper){
                        fr.setCharAt(i, Character.toUpperCase(f));
                    }
                    else{
                        fr.setCharAt(i, Character.toLowerCase(f));
                    }
                    upper =! upper;
                    
                }
                
            }
            
            System.out.println(fr);
            
        }
 
    }
 
}
