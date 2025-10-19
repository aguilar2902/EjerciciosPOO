
/**
 * Write a description of class Cabaña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Cabaña extends Alojamiento
{
    private int nroHabitaciones;
    
    public Cabaña(String p_nombre, double p_precio, int p_dias, int p_nroHab){
        super(p_nombre, p_precio, p_dias);
        this.setNroHabitaciones(p_nroHab);
    }
    
    public Cabaña(String p_nombre, double p_precio, int p_dias,  ArrayList<Servicio> p_servicios, int p_nroHab){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setNroHabitaciones(p_nroHab);
    }
    
    private void setNroHabitaciones(int p_nroHab){
        this.nroHabitaciones = p_nroHab;
    }
    
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    
    public double costo(){
        return super.costo() + (this.getNroHabitaciones() * 30.0 * this.getDiasAlquiler());
    }
    
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
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