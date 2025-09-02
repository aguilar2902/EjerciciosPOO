/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente
{
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    public Docente(String p_nombre, String p_grado, double p_sueldo, double p_asigFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldo);
        this.setAsignacionFamiliar(p_asigFamiliar);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAsignacionFamiliar(double p_asigFamiliar){
        this.asignacionFamiliar = p_asigFamiliar;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}