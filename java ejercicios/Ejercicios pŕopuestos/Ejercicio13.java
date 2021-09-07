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
        
        int decenasMil = numero / 10000;
        int residuo = numero % 10000;
        
        int miles = residuo / 1000;
        residuo = residuo % 1000;
        
        int cientos = residuo / 100;
        residuo = residuo % 100;
        
        int decenas = residuo / 10;
        residuo = residuo % 10;
        
        System.out.println("Decenas de miles: " + decenasMil * 10000);
        System.out.println("Miles: " + miles * 1000);
        System.out.println("Cientos: " + cientos * 100);
        System.out.println("Decenas: " + decenas * 10);
        System.out.println("Unidades: " + residuo);
        
    }
}
