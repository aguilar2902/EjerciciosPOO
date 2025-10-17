/**
 * Implementación de la clase abstracta FiguraGeometrica.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

abstract class FiguraGeometrica
{

    private Punto origen;

    /**
     * Constructor for objects of class FiguraGeometrica
     */
    public FiguraGeometrica(double p_x, double p_y)
    {
        this.setOrigen(new Punto(p_x, p_y));
    }

    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    };
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    public abstract void mostrarSuperficie();
}