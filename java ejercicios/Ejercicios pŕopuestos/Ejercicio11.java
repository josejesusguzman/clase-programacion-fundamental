import java.util.*;

/**
 * Write a description of class Ejercicio11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio11
{
     public static void main() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de X: ");
        int x = scanner.nextInt();
        System.out.println("Introduce el valor de Y: ");
        int y = scanner.nextInt();
        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
        
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("El nuevo valor de X es: " + x);
        System.out.println("El nuevo valor de Y es: " + y);
        
    }
}
