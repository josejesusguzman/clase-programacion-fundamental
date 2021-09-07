import java.util.*;

/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
    public static void main() {
        // Ejercicio 3
        // Formula: La suma de las bases, por la altura y todo entre 2
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el valor de la base mayor: ");
        int baseMayor = scanner.nextInt();
        
        System.out.println("Introduce el valor de la base menor: ");
        int baseMenor = scanner.nextInt();
        
        System.out.println("Introduce el valor de la base altura: ");
        int altura = scanner.nextInt();
        
        double area = ( ( baseMayor + baseMenor ) * altura ) / 2.0;
        
        System.out.println("Área del trapecio: " + area);
    }
}
