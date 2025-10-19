

/**
 * Write a description of class Alojamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

abstract class Alojamiento
{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    
    public Alojamiento(String p_nombre, double p_precio, int p_dias){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList<Servicio>());
    }
    
    public Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(p_servicios);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setPrecioBase(double p_precio){
        this.precioBase = p_precio;
    }
    
    private void setDiasAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }
    
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecioBase(){
        return this.precioBase;
    }
    
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    public abstract int contar(String p_alojamiento);
    
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
    
    public void listarServicios(){
        for(Servicio ser: servicios){
            System.out.println("\t\t" + ser.getDescripcion() + ": " + ser.getPrecio());
        }
    }
    
    public double costoServicios(){
        double aux = 0;
        
        for(Servicio ser: this.getServicios()){
            aux += ser.getPrecio();
        }
        return aux;
    }
    
    public void liquidar(){
        System.out.println("\tAlojamiento: " + this.getNombre());
    };
    
}