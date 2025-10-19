
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
     * Metodo que retorna
     */
    public String tipoVisitante(){
        return "Delegacion";
    }
    
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    public void mostrar(){
        for(Individuo lista: this.getIntegrantes()){
            lista.mostrar();
            System.out.println();
        }
    }
    
    public double entrada(){
        double aux = 0.0;
        for(Individuo lista: this.getIntegrantes()){
            aux += lista.entrada();
        }
        
        return aux * (1 - 0.1);
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if((this.tipoVisitante().equalsIgnoreCase(p_visitante)) && this.getFechaVisita().equals(p_fecha)){
            System.out.println(super.getNombre());
            System.out.println();
        }
        
    }
    
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> lista = new HashSet<Persona>();
        
        for(Individuo a: this.getIntegrantes()){
            lista.addAll(a.listarPersonas());
        }
        
        return lista;
    }
}