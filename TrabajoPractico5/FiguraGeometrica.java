/**
 * Implementación de la clase abstracta FiguraGeometrica.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

public abstract class FiguraGeometrica
{

    private Punto origen;

    /**
     * Constructor de FiguraGeometrica con coordenadas
     * @param p_x coordenada eje x
     * @param p_y coordenada eje y
     */
    public FiguraGeometrica(double p_x, double p_y)
    {
        this.setOrigen(new Punto(p_x, p_y));
    }
    //Mutadores
    /**
     * Mutador para setear el punto de origen
     * @param p_origen corresponde a un objeto Punto
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    };
    //Observadores
    /**
     * Observador que obtiene el punto de origen
     * @return un objeto Punto que representa el origen
     */
    public Punto getOrigen(){
        return this.origen;
    }
    
    //Métodos abstractos
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    /**
     * Muestra por pantalla la superficie de la figura
     */
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println("\tSuperficie: " + this.superficie());
    }
}