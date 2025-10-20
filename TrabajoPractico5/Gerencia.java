
/**
 * Implementación de la clase Gerencia
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Gerencia
{
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    //CONSTRUCTORES
    /**
     * Constructor para Gerencia sin alojamiento alquilado
     * @param p_nombre nombre de la gerencia
     */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }
    /**
     * Constructor para Gerencia con alojamientos
     * @param p_nombre nombre de la gerencia
     * @param p_alojamientos lista de alojamientos
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientos);
    }
    
    //SETTERS
    /**
     * Mutador para el nombre de la gerencia
     * @param p_nombre nombre a asignar a la gerencia
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientos){
        this.alojamientosAlquilados = p_alojamientos;
    }
    
    //GETTERS
    /**
     * Obtiene el nombre de la gerencia
     * @return el nombre asignado
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    
    //OTROS METODOS
    /**
     * Método para agregar un alojamiento a la lista
     * @param p_alojamiento alojamiento a agregar
     * @return confirmación de la operación (booleano)
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    /**
     * Método para quitar un alojamiento a la lista
     * @param p_alojamiento alojamiento a quitar
     * @return confirmación de la operación (booleano)
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    /**
     * Cuenta la cantidad total de alojamientos por tipo
     * @param p_alojamiento el tipo de alojamiento a contar
     * @return la cantidad encontrada del tipo de alojamiento ingresado por parámetro
     */
    public int contarAlojamiento(String p_alojamiento){
        int aux = 0;
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            aux += alojamiento.contar(p_alojamiento);
        }
        return aux;
    }
    /**
     * Muestra la liquidación de todos los alojamientos de la lista
     * 
     */
    public void liquidar(){
        for(Alojamiento alojamiento: this.getAlojamientosAlquilados()){
            alojamiento.liquidar();
            System.out.println();
        }
    }
    
    /**
     * Muestra los detalles de la gerencia
     */
    public void mostrarLiquidacion(){
        System.out.println("\tGerencia " + this.getNombre());
        System.out.println("\tLiquidacion---------------------------\n");
        this.liquidar();
        System.out.println("\n\tAlojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("\n\tAlojamiento tipo Hotel ----->" + this.contarAlojamiento("Hotel"));
    }
}