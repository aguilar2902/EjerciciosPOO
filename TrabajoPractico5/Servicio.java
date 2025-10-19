
/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio
{
    private String descripcion;
    private double precio;
    
    public Servicio(String p_desc, double p_precio){
        this.setDescripcion(p_desc);
        this.setPrecio(p_precio);
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}