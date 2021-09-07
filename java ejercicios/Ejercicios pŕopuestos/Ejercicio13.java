import java.util.*;

/**
 * Write a description of class Ejercicio13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio13
{
    public static void main() {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Introduce un entero de cinco cifras");
        
        try  {
            numero = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Debes introducir un valor entero");
            main();
        }
        
    }
}
