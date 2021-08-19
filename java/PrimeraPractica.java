
import java.util.*;

/*
 * public -> Cualquier objeto tiene acceso a esto
 * protected -> Protegido
 * private -> Privado
 */
public class PrimeraPractica {
    
    public static void Main() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa un número que corresponda a días: ");
        
        int días = 0;
        
        // Validar si el usuario introduce un número 
        try  {
            días = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Debes poner un entero.");
            return;
        }
        
        //Validar si el usuario introduce un valor mayor a cero
        if (días > 0) {
            System.out.print("El número de horas es: " + días * 24 + " \n");
            System.out.print("El número de minutos es: " + días * 24 * 60 );
        } else {
            System.out.print("Debes de meter número mayor a cero.");
        }
        
    }
}
