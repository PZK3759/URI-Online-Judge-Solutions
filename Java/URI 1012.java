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
        double A, B, C;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        double tri_area, cir_area, trape_area, sq_area, req_area;
        
        tri_area = (A*C)/2; // area of trianle
        cir_area = 3.14159*C*C; // area of circle
        trape_area = ((A+B)/2)*C; // area of  trapezium
        sq_area = B*B; // area of square
        req_area = A*B; // area of rectangle
        
        System.out.printf("TRIANGULO: %.3f\n", tri_area);
        System.out.printf("CIRCULO: %.3f\n", cir_area);
        System.out.printf("TRAPEZIO: %.3f\n", trape_area);
        System.out.printf("QUADRADO: %.3f\n", sq_area);
        System.out.printf("RETANGULO: %.3f\n", req_area);
 
    }
 
}
