
/**
 * Write a description of class DeTresEnTres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeTresEnTres implements SerieNumeros
{
    int iniciar;
    int valor;
    
    DeTresEnTres() {
        iniciar = 0;
        valor = 0;
    }
    
    public int getSiguiente() {
        valor += 3; // valor = valor + 2
        return valor;
    }
    
    public void reiniciar() {
        valor = iniciar;
    }
    
    public void setComenzar(int x) {
        iniciar = x;
        valor = x;
    }
}
