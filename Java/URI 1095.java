import java.io.IOException;


/**
 *
 *  @author Abdullah Al Zahin
 *
 */
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int i =1, j ;
        
        for(j=60; j>=0; j-=5){
            
            System.out.print("I="+i+" ");
            i += 3;
            
            System.out.println("J="+j);
        }
 
    }
 
}
