
/**
 * Write a description of class CuartaPractica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuartaPractica 
{
    // instance variables - replace the example below with your own
    protected int x;
    public String nombre = "Jesus";

    /**
     * Constructor for objects of class CuartaPractica
     */
    public CuartaPractica(int x)
    {
        // initialise instance variables
        this.x = x;
    }
    
    public static void main() {
        TerceraPractica.main();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int funcionSuma(int y)
    {
        // put your code here
        return x + y;
    }
}
