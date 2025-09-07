/**
 * Ejercicio 6: Implementación de la clase Docente
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Docente
{
    //atributos
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * Constructor de Docente
     * @param p_nombre nombre y apellido del docente
     * @param p_grado grado del docente
     * @param p_sueldo es el sueldo básico asignado al docente
     * @param p_asigFamiliar asignación familiar que le corresponde al docente
     */
    public Docente(String p_nombre, String p_grado, double p_sueldo, double p_asigFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldo);
        this.setAsignacionFamiliar(p_asigFamiliar);
    }
    //Mutadores
    /**
     * @param p_nombre el nombre y apellido del docente
     */
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
    //Observadores
    /**
     * @return el nombre y apellido del docente
     */
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
    /**
     * Calcula el sueldo del docente resultante de adicionar al sueldo básico
     * la asignación familiar del docente.
     * @return el sueldo final que percibe el docente.
     */
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}