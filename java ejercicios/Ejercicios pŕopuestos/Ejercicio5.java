import java.util.*;

/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{
   public static void main() {
        
        Scanner scanner = new Scanner(System.in);
        
        int dias = 0;
        
        System.out.println("Introduce el número de días");
        
        try  {
            dias = scanner.nextInt();
        } catch(Exception e) {
            System.out.println("Debes introducir un valor entero");
            main();
        }
        
        System.out.println("El número de horas es:  " + dias * 24);
        System.out.println("El número de minutos es:  " + dias * 24 * 60);
        
        return;
    }
}
