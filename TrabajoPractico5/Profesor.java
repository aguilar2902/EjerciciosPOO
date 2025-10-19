/**
 * Implementación de la clase Profesor.
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 */

import java.util.*;

public class Profesor extends Persona{
    
    private String titulo;
    ArrayList<Cargo> cargos;

    /**
     * Constructor de Profesor con un cargo
     * @param p_dni el DNI del profesor
     * @param p_nombre nombre del docente
     * @param p_apellido apellido del docente
     * @param p_fecha fecha de nacimiento
     * @param p_titulo titulo del profesor
     * @param p_cargo cargo asignado
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha, String p_titulo, Cargo p_cargo)
    {
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<Cargo>());
        this.agregarCargo(p_cargo);
        
    }
    /**
     * Constructor de Profesor con varios cargos
     * @param p_dni el DNI del profesor
     * @param p_nombre nombre del docente
     * @param p_apellido apellido del docente
     * @param p_fecha fecha de nacimiento
     * @param p_titulo titulo del profesor
     * @param p_cargos lista de cargos asignados
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha, String p_titulo, ArrayList<Cargo> p_cargos)
    {
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<Cargo>(p_cargos));
    }
    //Mutadores
    /**
     * Asigna el titulo del profesor
     * @param p_titulo titulo a agregar
     */
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setCargos(ArrayList<Cargo> p_cargo){
        this.cargos = p_cargo;
    }
    //Observadores
    /**
     * Obtiene el titulo asignado al profesor
     * @return el titulo del profesor
     */
    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    //Otros métodos
    /**
     * Asigna nuevo cargo al profesor
     * @param p_cargo cargo que se desea agregar
     * @return un booleando confirmando la operación
     * (true si el profesor tenía menos de 3 cargos antes de la misma).
     */
    public boolean agregarCargo(Cargo p_cargo){
        if(this.getCargos().size() < 3){
            return this.getCargos().add(p_cargo);
        }
        
        return false;
    }
    /**
     * Quita un cargo al docente, siempre que no sea el último que posee
     * @param p_cargo cargo a quitar
     * @return un booleano confirmando la operación
     */
    public boolean quitarCargo(Cargo p_cargo){
        if(this.getCargos().size() == 1){
            return false;
        }
        
        return this.getCargos().remove(p_cargo);
    }
    /**
     * Muestra por pantalla datos básicos del docente, incluidos los cargos
     * que posee y el sueldo total que le corresponde
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("\tTitulo: " + this.getTitulo());
        System.out.println();
        this.listarCargos();
        System.out.println("\n\t** Sueldo Total: $" + this.sueldoTotal() + " **");
    }
    /**
     * Imprime todos los cargos del profesor
     */
    public void listarCargos(){
        System.out.println("\t_***** Cargos Asignados *****_");
        System.out.println("\t______________________________");
        for(Cargo car: this.getCargos()){
            car.mostrarCargo();
            System.out.println();
        }
    }
    /**
     * Halla el sueldo total del docente en base a los cargos asignados
     * @return el acumulado de sueldos 
     */
    public double sueldoTotal(){
        double aux = 0.0;
        
        for(Cargo car: this.getCargos()){
            aux += car.sueldoDelCargo();
        }
        
        return aux;
    }
    /**
     * @return una cadena de texto con datos básicos del docente
     */
    public String mostrarLinea(){
        String s = "\tDNI: " + super.getDni() + " Nombre: " + super.nomYApe() + " Sueldo Total: $" + this.sueldoTotal();
        return s;
    }
}