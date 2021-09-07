import java.util.*;

/**
 * Write a description of class Ejercicio15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio15
{
    public static void main() {
        /*
         * Cantidad solicitada por un cliente debe descomponerse en billetes 
         * de 20 - 10 - 5 - 1
         */
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = 0;
        
        System.out.println("Introduce la cantidad del retiro: ");
        
        try  {
            cantidad = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Debes introducir un valor entero");
            main();
        }
        
        // cantidad = 21
        int billetesVeinte = cantidad / 20; // billetesVeinte = 1
        int residuo = cantidad % 20; // residuo = 1
        
        int billetesDiez = residuo / 10; // billetesDiez = 0
        residuo = residuo % 10; // residuo = 1
        
        int billetesCinco = residuo / 5; // billetesCinco = 0
        residuo = residuo % 5; // residuo = 1
    
        System.out.println("Billetes de 20 dolares: " + billetesVeinte);
        System.out.println("Billetes de 10 dolares: " + billetesDiez);
        System.out.println("Billetes de 5 dolares: " + billetesCinco);
        System.out.println("Billetes de 1 dolares: " + residuo);
        
        
    }
}
