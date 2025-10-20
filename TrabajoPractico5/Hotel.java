
/**
 * Implementación de Hotel.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class Hotel extends Alojamiento
{
    private String tipoHabitacion;
    
    /**
     * Constructor de Hotel sin servicios
     * @param p_nombre nombre del hotel
     * @param p_precio precio del hotel
     * @param p_dias cantidad de dias de alquiler
     * @param p_tipo tipo de habitación
     */
    public Hotel(String p_nombre, double p_precio, int p_dias, String p_tipo){
        super(p_nombre, p_precio, p_dias);
        this.setTipoHabitacion(p_tipo);
    }
    /**
     * Constructor de Hotel con servicios
     * @param p_nombre nombre del hotel
     * @param p_precio precio del hotel
     * @param p_dias cantidad de dias de alquiler
     * @param p_servicios lista de servicios
     * @param p_tipo tipo de habitación
     */
    public Hotel(String p_nombre, double p_precio, int p_dias,  ArrayList<Servicio> p_servicios, String p_tipo){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setTipoHabitacion(p_tipo);
    }
    //Mutadores
    /**
     * Setea el tipo de habitación
     * @param cadena de texto que representa al tipo de habitación
     */
    private void setTipoHabitacion(String p_tipo){
        this.tipoHabitacion = p_tipo;
    }
    //Observadores
    /**
     * Obtiene el tipo de habitación
     * @return tipo de habitación
     */
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    //Otros métodos
    /**
     * Obtiene el costo
     * @return el costo final del alquiler
     */
    public double costo(){
        if(this.getTipoHabitacion().equalsIgnoreCase("Doble")){
            return super.costo() + (35.0 * this.getDiasAlquiler());
        }
        
        //dejo 20.0 como opcion si no es doble, por si escriben cualquier cosa, que funcione como "single"
        return super.costo() + (20.0 * this.getDiasAlquiler()); 
    }
    /**
     * Devuelve 1 si corresponde al tipo de alojamiento hotel
     * @return 1 o 0 según confirma o no el tipo Hotel
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
            return 1;
        }
        return 0;
    }
    /**
     * Muestra los detalles de la liquidación del hotel
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("\tCosto por " + this.getDiasAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
        System.out.println("\n\tTotal: ------> $" + (this.costo() + this.costoServicios()));
    }
}