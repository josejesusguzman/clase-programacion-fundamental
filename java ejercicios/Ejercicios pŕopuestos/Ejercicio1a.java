import java.util.*;

/**
 * Write a description of class Ejercicio1a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1a
{
    public static void main() {
        // Y = 2X^2 + 4X + 12
        
        System.out.println("Introduce el valor de X");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        double y = (2 * Math.pow(x, 2)) + ( 4 * x ) + 12;
        
        System.out.println("Valor de Y: " + y);
    }
}
