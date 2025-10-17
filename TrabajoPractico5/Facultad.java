/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Facultad
{
    
    private String nombre;
    private ArrayList<Profesor> profesores;

    /**
     * Constructor for objects of class Facultad
     */
    public Facultad(String p_nombre, Profesor p_profesor)
    {
        this.setNombre(p_nombre);
        
        ArrayList<Profesor> lista = new ArrayList<Profesor>();
        lista.add(p_profesor);
        this.setProfesores(lista);
    }
    
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesor)
    {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesor);
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProfesores(ArrayList<Profesor> p_profesor){
        this.profesores = p_profesor;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }
    
    public void nominaProfesores(){
        System.out.println("\t*************** Nómina Facultad: FaCENA");
        System.out.println("\t-------------------------------------------------------");
        for(Profesor prof: profesores){
            System.out.println(prof.mostrarLinea());
        }
        System.out.println("\t-------------------------------------------------------");
        System.out.println("\tTotal a pagar: $" + this.totalAPagar());
    }
    
    public double totalAPagar(){
        double aux = 0.0;
        
        for(Profesor prof: profesores){
            aux += prof.sueldoTotal();
        }
        
        return aux;
    }
    
    public void listarProfesorCargos(){
        int cont = 0;
        System.out.println("\t***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
        System.out.println("\t--------------------------------------------------------------");
        for(Profesor prof: profesores){
            prof.mostrar();
            cont++;
            System.out.println("\n\t------------------ **** -------------------");
        }

        System.out.println("\tHay " + cont + " profesores");
    }
}