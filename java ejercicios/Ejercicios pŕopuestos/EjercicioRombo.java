import java.util.*;
/**
 * Write a description of class EjercicioRombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjercicioRombo
{
    public static void main() {
        // Fomula DiagonalMayor * DiagonalMenor / 2 
        
        Scanner scanner = new Scanner(System.in);

        int diagonalMayor = 0;
        int diagonalMenor = 0;        
        
        try  {
            System.out.println("Introduce el valor de la diagonal mayor: ");
            diagonalMayor = scanner.nextInt();
            System.out.println("Introduce el valor de la diagonal menor: ");
            diagonalMenor = scanner.nextInt();            
        } catch (Exception e) {
            System.out.println("Debes introducir un número entero.");
            main();
        }
        
        double area = ( diagonalMayor * diagonalMenor ) / 2.0;
        
        System.out.println("El área del rombo es igual a: " + area);
        
        
    }
}
