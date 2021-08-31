
/**
 * Write a description of class DeDosEnDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeDosEnDos implements SerieNumeros
{
    int iniciar;
    int valor;
    
    DeDosEnDos() {
        iniciar = 0;
        valor = 0;
    }
    
    public int getSiguiente() {
        valor += 2; // valor = valor + 2
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
