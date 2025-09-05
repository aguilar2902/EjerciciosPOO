
/**
 * Write a description of class Localidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    public String mostrar(){
        return "\tLocalidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}