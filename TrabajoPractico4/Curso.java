
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Curso
{
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }
    
    public Curso(String p_nombre,HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    //Otros métodos
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    public Alumno quitarAlumno(int p_lu){
        Alumno aux = (Alumno)this.getAlumnos().get(p_lu);
        this.getAlumnos().remove(p_lu);
        return aux;
    }
    public int cantidadDeAlumnos(){
        int i = 0;
        for(Integer lu:this.getAlumnos().keySet()){
            i++;
        }
        return i;
        //return this.getAlumnos().size();
        
    }
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    public Alumno buscarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().get(p_lu);
    }
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("****__Mostrar promedio del alumno " + this.buscarAlumno(p_lu).getLu() +
            "__****");
        System.out.println("Promedio: " + this.buscarAlumno(p_lu).promedio()); 
    }
    public void mostrarInscriptos(){
        System.out.println("****__Cantidad de inscriptos: " + this.cantidadDeAlumnos());
        for(Integer lu : this.getAlumnos().keySet()){
            Alumno alumno = this.getAlumnos().get(lu);
            System.out.println(alumno.getLu() + " " + alumno.nomYApe());
            
        }
    }
}