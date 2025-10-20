
/**
 * Implementación de Cabaña.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class Cabaña extends Alojamiento
{
    private int nroHabitaciones;
    
    /**
     * Constructor para Cabaña sin servicios
     * @param p_nombre nombre de la cabaña
     * @param p_precio precio de la cabaña
     * @param p_dias cantidad de dias de alquiler
     * @param p_nroHab cantidad de habitaciones de la cabaña
     */    
    public Cabaña(String p_nombre, double p_precio, int p_dias, int p_nroHab){
        super(p_nombre, p_precio, p_dias);
        this.setNroHabitaciones(p_nroHab);
    }
     /**
     * Constructor para Cabaña con servicios
     * @param p_nombre nombre de la cabaña
     * @param p_precio precio de la cabaña
     * @param p_dias cantidad de dias de alquiler
     * @param p_servicios lista de servicios incluidos
     * @param p_nroHab cantidad de habitaciones de la cabaña
     */    
    public Cabaña(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios, int p_nroHab){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setNroHabitaciones(p_nroHab);
    }
    //Mutadores
    /**
     * Setea el nro de habitaciones de la Cabaña
     * @param p_nroHab cantidad de habitaciones
     */
    private void setNroHabitaciones(int p_nroHab){
        this.nroHabitaciones = p_nroHab;
    }
    /**
     * Obtiene el número de habitaciones de la Cabaña
     * @return nro de habitaciones
     */
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    /**
     * Obtiene el costo de una Cabaña
     * @return costo calculado de acuerdo a habitaciones y días de alquiler
     */
    public double costo(){
        return super.costo() + (this.getNroHabitaciones() * 30.0 * this.getDiasAlquiler());
    }
    /**
     * @return 1 o 0,  según si detecta que el alojamiento es del tipo Cabaña o no
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
            return 1;
        }
        return 0;
    }
    
    /**
     * Muestra los detalles de la liquidación de una Cabaña
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("\tCosto por " + this.getDiasAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
        System.out.println("\n\tTotal: ------> $" + (this.costo() + this.costoServicios()));
    }
}