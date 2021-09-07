
import java.util.*;

/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static void main() {
        System.out.println("Introduce el tamaño del lado del cuadrado");
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        
        System.out.println("Área del cuadrado: " + ( lado * lado ));
        System.out.println("Perímetro del cuadrado: " + ( lado * 4 ));
    }
}
