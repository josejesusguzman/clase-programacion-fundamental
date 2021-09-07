import java.util.*;
/**
 * Write a description of class EjercicioOperaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjercicioOperaciones
{
    public static void main() {
        
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;        
        
        try  {
            System.out.println("Introduce el valor del primer número: ");
            numero1 = scanner.nextInt();
            System.out.println("Introduce el valor del segundo número: ");
            numero2 = scanner.nextInt();            
        } catch (Exception e) {
            System.out.println("Debes introducir un número entero.");
            main();
        }
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + 
            " es igual a: " + (numero1 + numero2)
            );
        
        System.out.println("La resta de " + numero1 + " - " + numero2 + 
            " es igual a: " + (numero1 - numero2)
            );
            
        System.out.println("La multiplicación de " + numero1 + " x " + numero2 + 
            " es igual a: " + (numero1 * numero2)
            );
            
        System.out.println("La división de " + numero1 + " / " + numero2 + 
            " es igual a: " + (numero1 / numero2)
            );
            
        System.out.println("El residuo de " + numero1 + " / " + numero2 + 
            " es igual a: " + (numero1 % numero2)
            );
        
    }
}
