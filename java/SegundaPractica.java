import java.util.*;
/**
 * Write a description of class SegundaPractica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SegundaPractica
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SegundaPractica
     */
    public SegundaPractica()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void main() {
        
        
        /*Scanner scanner = new Scanner(System.in);
        int numero = 0;
        numero = scanner.nextInt();
        
        // Condición
        if (numero == 5) {
            System.out.println("Es el número cinco");
        } else if (numero == 7) {
            System.out.println("Es el número siete");
        } else if (numero == 10) {
            System.out.println("Es el número diez");
        } else {
            System.out.println("No me esperaba este número");         
        }
        
        //Condición
        switch (numero) {
            case 5:
                System.out.println("Es el número cinco. Desde un switch");
                break;
            case 7: 
                System.out.println("Es el número siete. Desde un switch");
                break;
            case 10: 
                System.out.println("Es el número diez. Desde un switch");
                break;
            default:
                System.out.println("Error!!!!");
                // Se reinicia esta función
                main();
        }*/
        
        String[] nombresPaises = new String[]{"Ecuador", "México", "Peru", "Venezuela"};
        //                                        0         1         2         3
        System.out.println("_____________________________________________");
        /* for (int i = 0 ; i  < nombresPaises.length ; i++) {
            System.out.println(nombresPaises[i]);
        }*/
        
        int i = 0;
        while (i  < nombresPaises.length) {
            System.out.println(nombresPaises[i]);
            i++;
        }
        System.out.println(".");
        i = 0;
        do {
            System.out.println(nombresPaises[i]);
            i++;
        } while(i  <= nombresPaises.length);

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
