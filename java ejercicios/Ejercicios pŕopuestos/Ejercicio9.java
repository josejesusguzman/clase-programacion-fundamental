import java.util.*;

/**
 * Write a description of class Ejercicio9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio9
{
    public static void main() {
        // En lineas separadas poner valores, raiz cuadrada y valor al cuadrado
        
        Scanner scanner = new Scanner(System.in);
        
        float a = 0;
        float b = 0;
        
        System.out.println("Introduce el valor de A:");
        try  {
            a = scanner.nextFloat();
        } catch(Exception e) {
            System.out.println("Debes introducir un valor númerico");
            main();
        }
        
        System.out.println("Introduce el valor de B:");
        try  {
            b = scanner.nextFloat();
        } catch(Exception e) {
            System.out.println("Debes introducir un valor númerico");
            main();
        }
        
        System.out.println(
            "Valor de A: " + a + 
            " - Al cuadrado: " + a * a + 
            " - Raiz cuadrada: " + Math.sqrt(a)
        );
        System.out.println("________________________");
        System.out.println(
            "Valor de B: " + b + 
            " - Al cuadrado: " + b * b + 
            " - Raiz cuadrada: " + Math.sqrt(b)
        );        
        
        return;
    }
}
