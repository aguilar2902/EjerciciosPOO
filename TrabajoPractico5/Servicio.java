
/**
 * Implementación de Servicio
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Servicio
{
    private String descripcion;
    private double precio;
    
    /**
     * Constructor de Servicio
     * @param p_desc descripción del servicio
     * @param p_precio costo del servicio
     */
    public Servicio(String p_desc, double p_precio){
        this.setDescripcion(p_desc);
        this.setPrecio(p_precio);
    }
    //Mutadores
    /**
     * Setea la descripción del servicio
     * @param p_desc descripción a agregar
     */
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    //Observadores
    /**
     * Obtiene la descripción
     * @return descripción del servicio
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
}