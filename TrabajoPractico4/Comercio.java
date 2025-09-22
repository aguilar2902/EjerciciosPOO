
/**
 * Ejercicio 6: Implementación de la clase Comercio.
 * 
 * @author Bengochea Marcelo José De Jesús 
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Constructor de Comercio sin empleados
     * @param p_nombre nombre del comercio
     */
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }
    
    /**
     * Constructor de Comercio con empleados
     * @param p_nombre nombre del comercio
     * @param p_empleados lista de empleados (hashmap del Objeto Empleado <cuil, empleado>)
     */
    public Comercio(String p_nombre, HashMap p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    
    /**
     * Mutador privado del nombre de comercio
     * @param nombre del comercio a agregar/modificar
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap p_empleados){
        this.empleados = p_empleados;
    }
    
    /**
     * Observador del nombre de comercio
     * 
     * @return nombre del comercio
     */
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    //Otros metodos
    /**
     * Método para agregar un empleado a la colección
     * @p_empleado Datos del empleado (Objeto)
     */
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    /**
     * Método para dar de baja un empleado
     * @param p_cuil cuil del empleado (clave)
     * 
     * @return datos del empleado eliminado (Objeto)
     */
    public Empleado bajaEmpleado(long p_cuil){
        Empleado aux = this.getEmpleados().get(p_cuil);
        this.getEmpleados().remove(p_cuil);
        
        return aux;
    }
    
    /**
     * Metodo que calcula la cantidad de empleados del comercio
     * 
     * @return cantidad de empleados
     */
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    /**
     * Método para comprobar si un empleado es parte del comercio
     * @param p_cuil cuil del empleado (clave)
     * 
     * @return Verdadero si el empleado es encontrado
     */
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    /**
     * Método para buscar un empleado en la colección
     * @param p_cuil cuil del empleado (clave)
     * 
     * @return Datos del empleado (Objeto)
     */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    /**
     * Muestra en pantalla el sueldo del empleado elegido
     * @param p_cuil cuil del empleado (clave)
     */
    public void sueldoNeto(long p_cuil){
        System.out.println("$" + this.getEmpleados().get(p_cuil).sueldoNeto());
    }
    
    /**
     * Muestra la lista de empleados con el siguiente formato (cuil - nomYApe - sueldo neto)
     */
    public void nomina(){
        System.out.println("\t**** Nomina de empleados de " + this.getNombre() + " ****");
        for(Long clave: this.getEmpleados().keySet()){
            Empleado emp = this.buscarEmpleado(clave);
            System.out.print("\t" + emp.getCuil() + " " + emp.nomYApe() + "-----");
            this.sueldoNeto(clave);
        }
    }
}