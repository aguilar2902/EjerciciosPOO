
/**
 * Implementacion de la clase Abstracta Visitante
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;
    
    /**
     * Constructor de Visitante
     * 
     * @param p_nombre nombre del visitante
     * @param p_fecha fecha de la visita
     */
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    //Mutadores
    /**
     * Mutador de nombre
     * 
     * @param p_nombre nombre del visitante
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    //Observadores
    /**
     * Observador de nombre
     * 
     * @return nombre del visitante
     */
    public String getNombre(){
        return this.nombre;
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    
    //Métodos abstractos
    public abstract void mostrar();
    
    public abstract double entrada();
    
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    public abstract String tipoVisitante();
    
    public abstract HashSet<Persona> listarPersonas();
}