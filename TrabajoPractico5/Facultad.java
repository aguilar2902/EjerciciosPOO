/**
 * Implementación de Facultad.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 */
import java.util.*;

public class Facultad
{
    
    private String nombre;
    private ArrayList<Profesor> profesores;

    /**
     * Constructor de Facultad con un profesor
     * @param p_nombre nombre de la facultad
     * @param p_profesor primer Profesor a cargar
     */
    public Facultad(String p_nombre, Profesor p_profesor)
    {
        this.setNombre(p_nombre);
        
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
    /**
     * Constructor que Facultad que recibe una lista de profesores
     * @param p_nombre nombre de la facultad
     * @param p_profesores lista de profesores
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores)
    {
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>(p_profesores));
    }
    //Mutadores
    /**
     * Mutador para el nombre de la facultad
     * @param p_nombre nombre que se desea asignar
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesor){
        this.profesores = p_profesor;
    }
    //Observadores
    /**
     * Observador para el nombre de la facultad
     * @return el nombre de la facultad
     */
    public String getNombre(){
        return this.nombre;
    }    
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    /**
     * Agrega un profesor a la lista
     * @param p_profesor objeto de tipo Profesor a ser agregado
     * @return un booleando confirmando o no la operación
     */
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    /**
     * Quita un profesor de la lista siempre que quede por lo menos uno 
     * luego de quitarlo.
     * @param p_profesor profesor a quitar
     * @return un booleano que confirma el resultado de la operación
     */
    public boolean quitarProfesor(Profesor p_profesor){
        if(this.getProfesores().size() > 1){
            return this.getProfesores().remove(p_profesor);
        } else {
            return false;
        }
        
    }
    /**
     * Imprime la nomina de profesores de la facultad, incluyendo el
     * total de los sueldos
     */
    public void nominaProfesores(){
        System.out.println("\t*************** Nómina Facultad: FaCENA");
        System.out.println("\t-------------------------------------------------------");
        for(Profesor prof: this.getProfesores()){
            System.out.println(prof.mostrarLinea());
        }
        System.out.println("\t-------------------------------------------------------");
        System.out.println("\tTotal a pagar: $" + this.totalAPagar());
    }
    /**
     * Obtiene el total de sueldos a abonar
     * @return el acumulado de sueldos que la facultad debe abonar
     */
    public double totalAPagar(){
        double aux = 0.0;
        
        for(Profesor prof: this.getProfesores()){
            aux += prof.sueldoTotal();
        }
        
        return aux;
    }
    /**
     * Muestra por pantalla todos los docentes con sus cargos asignados
     */
    public void listarProfesorCargos(){
        int cont = 0;
        System.out.println("\t***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
        System.out.println("\t--------------------------------------------------------------");
        for(Profesor prof: this.getProfesores()){
            prof.mostrar();
            cont++;
            System.out.println("\n\t------------------ **** -------------------");
        }

        System.out.println("\tHay " + cont + " profesores");
    }
}