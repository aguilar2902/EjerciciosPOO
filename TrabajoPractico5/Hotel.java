
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Hotel extends Alojamiento
{
    private String tipoHabitacion;
    
    public Hotel(String p_nombre, double p_precio, int p_dias, String p_tipo){
        super(p_nombre, p_precio, p_dias);
        this.setTipoHabitacion(p_tipo);
    }
    
    public Hotel(String p_nombre, double p_precio, int p_dias,  ArrayList<Servicio> p_servicios, String p_tipo){
         super(p_nombre, p_precio, p_dias, p_servicios);
        this.setTipoHabitacion(p_tipo);
    }
    
    private void setTipoHabitacion(String p_tipo){
        this.tipoHabitacion = p_tipo;
    }
    
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    
    public double costo(){
        if(this.getTipoHabitacion().equalsIgnoreCase("Doble")){
            return super.costo() + (35.0 * this.getDiasAlquiler());
        }
        
        //dejo 20.0 como opcion si no es doble, por si escriben cualquier cosa, que funcione como "single"
        return super.costo() + (20.0 * this.getDiasAlquiler()); 
    }
    
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
            return 1;
        }
        return 0;
    }
    
    public void liquidar(){
        super.liquidar();
        System.out.println("\tcosto por " + this.getDiasAlquiler() + " dias: " + this.costo());
        this.listarServicios();
        System.out.println("\n\tTotal: ------> $" + (this.costo() + this.costoServicios()));
    }
}