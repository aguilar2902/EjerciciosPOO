
/**
 * Write a description of class Zoologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Zoologico
{
    private String nombre;
    private ArrayList<Visitante> visitantes;
    
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }
    
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_visitante){
        for(Visitante lista: this.getVisitantes()){
            lista.listarPorFecha(p_fecha, p_visitante);
        }
    }
    
    public void listarVisitantePorFecha(Calendar p_fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("lista visitantes del dia: " + formato.format(p_fecha.getTime()));
        for(Visitante lista: this.getVisitantes()){
            if(lista.getFechaVisita().equals(p_fecha)){
                lista.mostrar();
                System.out.println();
            }
        }
    }
    
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
    
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> lista = new HashSet<Persona>();
        
        for(Visitante a: this.getVisitantes()){
            lista.addAll(a.listarPersonas());
        }
        
        return lista;
    }
}