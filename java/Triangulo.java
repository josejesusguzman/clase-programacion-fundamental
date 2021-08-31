
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends DosDimensiones
{
    String estilo;
    
    public Triangulo() {
        System.out.println("Primer constructors");
        estilo = "Isoceles";
    }
    
    public Triangulo(String tipo) {
        System.out.println("Segundo constructor");
        estilo = tipo;
    }
    
    public Triangulo(int numero) {
        System.out.println("Tercer constructor");
        estilo = "El número es: " + numero;
        System.out.println(estilo);
    }
    
    double area() {
        return (base * altura) / 2;
    }
    
    void mostrarEstilo() {
        System.out.println("El triangulo es: " + estilo);
    }
    
    public static void main() {
        
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo("Escaleno");
        Triangulo triangulo3 = new Triangulo(5);
        
        System.out.println(triangulo1.estilo);
        System.out.println(triangulo2.estilo);
        System.out.println(triangulo3.estilo);
        System.out.println("_____________________________________");
        
        /*Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();
        
        triangulo1.base = 4.0;
        triangulo1.altura = 4.0;
        triangulo1.estilo = "Equilatero";
        
        triangulo2.base = 8.0;
        triangulo2.altura = 12.0;
        triangulo2.estilo = "Isoceles";
        
        System.out.println("Este es tu triangulo 1: ");
        triangulo1.mostrarEstilo();
        triangulo1.mostrarDimension();
        System.out.println("Y su área es igual: " + triangulo1.area());
        
        System.out.println("Este es tu triangulo 2: ");
        triangulo2.mostrarEstilo();
        triangulo2.mostrarDimension();
        System.out.println("Y su área es igual: " + triangulo2.area());  */      
    }
    
}
