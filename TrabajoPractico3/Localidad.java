/**
 * Ejercicio 8
 * Implementación de la clase Localidad
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Localidad
{
    //atributos
    private String nombre;
    private String provincia;
    
    /**
     * Constructor de una localidad
     * @param p_nombre nombre de la localidad
     * @param p_provincia nombre de la provincia a la que pertenece
     * la localidad
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    //setters
    /**
     * @para p_nombre el nombre a asignar a la localidad
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    //getters
    /**
     * @return el nombre de la localidad
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getProvincia(){
        return this.provincia;
    }
    //Otros métodos
    /**
     * @return una cadena de texto con el nombre de la localidad y la provincia.
     */
    public String mostrar(){
        return "\tLocalidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}