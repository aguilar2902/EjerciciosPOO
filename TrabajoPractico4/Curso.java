
/**
 * Ejercicio 5: Implementación de la clase Curso
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Curso
{
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    
    /**
     * Constructor de Curso (sin alumnos)
     * @param p_nombre nombre del curso
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }
    
    /**
     * Constructor de Curso con alumnos
     * @param p_nombre nombre del curso
     * @param p_alumno lista de alumnos (hashmap del Objeto Alumno <lu, Alumno>)
     */
    public Curso(String p_nombre,HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    /**
     * Mutado privado de nombre de curso
     * @param p_nombre nombre del curso a crear/modificar
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    /**
     * Observador de nombre de curso
     * 
     * @return nombre del curso
     */
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    //Otros métodos
    /**
     * Método para agregar un alumno a la colección
     * @param p_alumnos datos del alumno (objeto)
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
    /**
     * Método para quitar un alumno de la colección
     * @p_lu clave del elemento alumno (libreta universitaria)
     * 
     * @return alumno que fue eliminado de la colección (Objeto)
     */
    public Alumno quitarAlumno(int p_lu){
        Alumno aux = this.getAlumnos().get(p_lu);
        this.getAlumnos().remove(p_lu);
        return aux;
    }
    
    /**
     * Método que suma la cantidad de alumnos que tiene el curso
     * 
     * @return cantidad de alumnos
     */
    public int cantidadDeAlumnos(){
        int i = 0;
        for(Integer lu:this.getAlumnos().keySet()){
            i++;
        }
        return i;
        //return this.getAlumnos().size();
        
    }
    
    /**
     * Método que comprueba la existencia de un alumno en el curso (por clave)
     * @param p_lu lu del alumno (clave)
     * 
     * @return Verdadero si lo encontró en la colección
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Método que comprueba la existencia de un alumno en el curso (por valor)
     * @param p_alumno alumno a buscar (objeto)
     * 
     * @return Verdadero si lo encontró en la colección
     */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     * Método que busca un alumno dentro de la colección
     * @param p_lu lu del alumno a buscar (clave)
     * 
     * @return datos del alumno buscado (objeto)
     */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
    /**
     * Método que imprime el promedio del alumno
     * @param p_lu libreta universitaria del alumno a mostrar (clave)
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("****__Mostrar promedio del alumno " + this.buscarAlumno(p_lu).getLu() +
            "__****");
        System.out.println("Promedio: " + this.buscarAlumno(p_lu).promedio()); 
    }
    
    /**
     * Método para informar la cantdad de inscriptos en el curso
     */
    public void mostrarInscriptos(){
        for(Integer lu : this.getAlumnos().keySet()){
            Alumno alumno = this.getAlumnos().get(lu);
            System.out.println(alumno.getLu() + " " + alumno.nomYApe());
            
        }
        System.out.println();
    }
}