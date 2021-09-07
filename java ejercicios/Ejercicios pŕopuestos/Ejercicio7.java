import java.util.*;

/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7
{
    public static void main() {
        // F = (9/5) C + 32
        
        Scanner scanner = new Scanner(System.in);
        
        float gradosC = 0;
        
        System.out.println("Introduce la temperatura en grados Centigrados: ");
        try {
            gradosC = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Debes introducir un número");
            main();
        }
        
        float gradosF = ( 9 * gradosC ) / 5 + 32;
        
        System.out.println("La temperatura en grados Fahrenheit es: " + gradosF + " F");
        return;
        
    }
}
