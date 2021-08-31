
/**
 * Write a description of class SeriesDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeriesDemo extends Triangulo implements Constantes
{
    public static void main() {
        DeTresEnTres serie = new DeTresEnTres();
        
        calculateSerie(serie);
           
        System.out.println("Reiniciando serie...");
        serie.reiniciar();
        
        calculateSerie(serie);
        
        System.out.println("Inicando serie en 1,000");
        serie.setComenzar(1000);
        
        calculateSerie(serie);
        
        System.out.println(mensajeError);
        
        System.out.println("____________________");
        Triangulo triangulo = new Triangulo();
        triangulo.base = 2;
        triangulo.altura = 2;
        
        triangulo.mostrarDimension();
        System.out.println(triangulo.area());
    }
    
    public static void calculateSerie(DeTresEnTres serie) {
        for (int i = 0;  i < 5; i++)
           System.out.println("Sigueinte valor es: " + serie.getSiguiente());
    }
}
