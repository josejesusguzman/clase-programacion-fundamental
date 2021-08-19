import java.util.*;
/**
 * Write a description of class TerceraPractica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TerceraPractica
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main() {
        
        // Operadores aritmeticos
        System.out.println(5 + 10);
        System.out.println("Hola" + " adios");
        System.out.println(5 - 10);
        System.out.println(5 * 10);
        System.out.println(5 / 10.0);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        if ((valor % 2) == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        // Operadores relacionales o comparativos
        /**
         * == igual a....
         * != no es igual a....
         * < menor que
         * <= menor o igual que
         * > mayor que
         * >= mayor o igual que
         */
        if (valor > 10) {
            System.out.println("El valor es mayor a 10");
        } else if (valor == 10) {
            System.out.println("El valor es igual a 10");
        } else {
            System.out.println("El valor es menor que 10");
        }
        
        valor += 5;
        System.out.println("Nuevo valor: " + valor);
        valor -= 5;
        System.out.println("Valor original: " + valor);
        
        //Operadores unitarios
        /**
         * - Hacer negativo un valor
         * + Hacer posivo un valor
         * ++ Incrementar en uno
         * -- Decrementar en uno
         * ! Negación
         */
        
        System.out.println("Valor original: " + -valor);
        System.out.println("Valor antes de ++: " + ++valor);
        System.out.println("Valor después de ++: " + valor++);
        System.out.println("Valor después de ++: " + valor);
        System.out.println("Valor antes de --: " + --valor);
        System.out.println("Negacion: " + !true);
        
        int valor2 = scanner.nextInt();
        
        //Operadores logicos
        /**
         * && AND y - Se deben de cumplir las dos condiciones para que me de TRUE
         * || OR o - Si se cumple una codición o las dos me da TRUE
         */
        if (valor < 10 || valor2 > 10) {
            System.out.println("CONDICIÓN OR");
        }
        
        if (valor < 10 && valor2 > 10) {
            System.out.println("CONDICIÓN AND");
        }
        
        String resultado = (valor < valor2) ? "Valor 1 es menor a valor 2" : "Valor 1 es mayor a valor 2";
        System.out.println(resultado);
        
        System.out.println(resultado instanceof String);
    }
}
