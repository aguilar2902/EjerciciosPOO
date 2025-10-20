
/**
 * Implementación de Zoologico
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Zoologico
{
    private String nombre;
    private ArrayList<Visitante> visitantes;
    
    /**
     * Constructor de Zoologico sin visitantes
     * @param p_nombre nombre del zoológico
     */
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }
    /**
     * Constructor de Zoologico con una lista de visitantes
     * @param p_nombre nombre del zoológico
     * @param p_visitantes lista de visitantes
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>(p_visitantes));
    }
    //Mutadores
    /**
     * Setea el nombre
     * @param p_nombre nombre del zoológico
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    /**
     * Obtiene el nombre
     * @return nombre del zoológico
     */
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    //Otros métodos
    /**
     * Agrega un visitante a la lista
     * @param p_visitante visitante a agregar
     */
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    /**
     * Quita un visitante de la lista
     * @param p_visitante visitante a quitar
     * @return confirmación de la operación(booleano)
     */
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    /**
     * Muestra los visitantes por tipo y fecha ingresados por parámetro
     * @param p_fecha fecha de la visita
     * @param p_visitante tipo de visitante
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_visitante){
        for(Visitante visitante: this.getVisitantes()){
            visitante.listarPorFecha(p_fecha, p_visitante);
        }
    }
    /**
     * Muestra los visitantes por fecha
     * @param p_fecha fecha elegida
     */
    public void listarVisitantePorFecha(Calendar p_fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("lista visitantes del dia: " + formato.format(p_fecha.getTime()));
        for(Visitante visitante: this.getVisitantes()){
            if(visitante.getFechaVisita().equals(p_fecha)){
                visitante.mostrar();
                System.out.println();
            }
        }
    }
    /**
     * Obtiene la recaudación
     * @param p_fechaDesde fecha origen
     * @param p_fechaHasta fecha limite
     * @return lo recaudado entre esas fechas
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double aux = 0.0;
        
        for(Visitante a: this.getVisitantes()){
            //quizas debas controlar la condicion del if.. no estoy seguro
            if(!a.getFechaVisita().before(p_fechaDesde) && !a.getFechaVisita().after(p_fechaHasta)){
                aux += a.entrada();
            }
        }
        
        return aux;
    }
    /**
     * Obtiene la lista de visitantes
     * @return lista de visitantes (sin repetir)
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> lista = new HashSet<Persona>();
        
        for(Visitante visitante: this.getVisitantes()){
            lista.addAll(visitante.listarPersonas());
        }
        
        return lista;
    }
}