
/**
 * Implementacion de la clase de Delegacion (Hereda de Visitante)
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;
import java.time.*;

public class Delegacion extends Visitante
{
    ArrayList<Individuo> integrantes;
    
    /**
     * Constructor de Delegacion
     * 
     * @param p_nombre nombre de la delegacion
     * @param p_fecha fecha de la visita
     * @p_integrante dato del individuo que integra la delegacion
     */
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_integrante){
        super(p_nombre, p_fecha);
        
        ArrayList<Individuo> lista = new ArrayList<Individuo>();
        lista.add(p_integrante);
        this.setIntegrantes(lista);
    }
    
    /**
     * Constructor de Delegacion
     * 
     * @param p_nombre nombre de la delegacion
     * @param p_fecha fecha de la visita
     * @p_integrantes lista de individuos
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes){
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    
    /**
     * Mutador de integrantes
     * 
     * @param p_integrantes lista de individuos
     */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    /**
     * Observador de integrantes
     * 
     * @return lista de integrantes de la delegacion
     */
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    /**
     * @return nombre de la clase
     */
    public String tipoVisitante(){
        return this.getClass().getSimpleName();
    }
    /**
     * Agrega un individuo a la lista de integrantes
     * @param p_individuo individuo a agregar
     */
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    /**
     * Quita un individuo de la lista de integrantes
     * @param p_individuo a quitar
     * @return confirmación de la operación (booleano)
     */
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    /**
     * @return la cantidad de integrantes de la delegación
     */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    /**
     * Muestra los detalles de cada individuo
     */
    public void mostrar(){
        for(Individuo individuo: this.getIntegrantes()){
            individuo.mostrar();
            System.out.println();
        }
    }
    /**
     * @return el costo de la entrada
     */
    public double entrada(){
        double aux = 0.0;
        for(Individuo lista: this.getIntegrantes()){
            aux += lista.entrada();
        }
        
        return aux * (1 - 0.1);
    }
    /**
     * Muestra los visitantes por fecha y tipo
     * @param p_fecha fecha
     * @param p_visitante tipo de visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if((this.tipoVisitante().equalsIgnoreCase(p_visitante)) && this.getFechaVisita().equals(p_fecha)){
            System.out.println(super.getNombre());
            System.out.println();
        }
        
    }
    /**
     * @return lista de individuos de la delegación, sin repetir
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> lista = new HashSet<Persona>();
        
        for(Individuo individuo: this.getIntegrantes()){
            lista.addAll(individuo.listarPersonas());
        }
        
        return lista;
    }
}