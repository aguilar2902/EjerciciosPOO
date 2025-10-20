
/**
 * Implementacion de la clase Individuo (Hereda de Visitante)
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
import java.time.*;

public class Individuo extends Visitante
{
    private Persona persona;
    
    /**
     * Constructor de Individuo
     * 
     * @param p_nombre nombre del visitante
     * @param p_fecha fecha de la visita
     * @param p_persona datos de la persona
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }
    
    /**
     * Mutador de Persona
     * 
     * @param p_persona datos de la persona
     */
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    /**
     * Observador de Persona
     * 
     * @return datos de la persona (objeto)
     */
    public Persona getPersona(){
        return this.persona;
    }
    
    /**
     * Metodo que obtiene el tipo de visitante
     * 
     * @return tipo de visitante
     */
    
    public String tipoVisitante(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Metodo que imprime lista filtrada por visitante y la fecha deseada
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        //armar lista
        if((this.tipoVisitante().equalsIgnoreCase(p_visitante)) && this.getFechaVisita().equals(p_fecha)){
            this.mostrar();
            System.out.println();
        }
    }
    
    /**
     * Metodo que devuelve los datos de la persona
     */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    /**
     * Metodo que devuelve el precio que paga de la entrada
     * 
     * @return monto que debe pagar cada individuo
     */
    public double entrada(){
        return 10.0;
    }
    
    /**
     * Metodo que devuelve una lista de personas sin repetir
     * 
     * @return lista de personas sin repetir
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> lista = new HashSet<Persona>();
        lista.add(this.persona);
        
        return lista;
    }
}