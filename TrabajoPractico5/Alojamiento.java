

/**
 * Implementación de Alojamiento
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

abstract class Alojamiento
{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    
    /**
     * Constructor de Alojamiento sin servicios cargados
     * @param p_nombre nombre del alojamiento
     * @param p_precio precio del alojamiento
     * @param p_dias cantidad de dias de alquiler
     */    
    public Alojamiento(String p_nombre, double p_precio, int p_dias){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList<Servicio>());
    }
    /**
     * Constructor de Alojamiento con servicios
     * @param p_nombre nombre del alojamiento
     * @param p_precio precio del alojamiento
     * @param p_dias cantidad de dias de alquiler
     * @param p_servicios lista de servicios incluidos
     */
    public Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiasAlquiler(p_dias);
        this.setServicios(new ArrayList<Servicio>(p_servicios));
    }
    //Mutadores
    /**
     * Setea el nombre del Alojamiento
     * @p_nombre nombre a asignar al alojamiento
     */
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
    //Observadores
    /**
     * Obtiene el nombre del Alojamiento
     * @return nombre del Alojamiento
     */
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
    //Otros métodos
    /**
     * Agrega un servicio a la lista
     * @param p_servicio servicio a incorporar
     * @return confirmación de la operación(booleano)
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    /**
     * Quita un servicio de la lista
     * @param p_servicio servicio a quitar
     * @return confirmación de la operación(booleano)
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    public abstract int contar(String p_alojamiento);
    
    /**
     * Obtiene el costo final del alquiler
     * @return costo final
     */
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
    /**
     * Muestra los detalles de los servicios del Alojamiento
     */
    public void listarServicios(){
        for(Servicio servicio: this.getServicios()){
            System.out.println("\t\t" + servicio.getDescripcion() + ": $" + servicio.getPrecio());
        }
    }
    /**
     * Obtiene el costo de los servicios
     * @return costo final acumulado por los servicios
     */
    public double costoServicios(){
        double aux = 0.00;
        
        for(Servicio servicio: this.getServicios()){
            aux += servicio.getPrecio();
        }
        return aux;
    }
    /**
     * Muestra por pantalla el alojamiento
     */
    public void liquidar(){
        System.out.println("\tAlojamiento: " + this.getNombre());
    };
    
}