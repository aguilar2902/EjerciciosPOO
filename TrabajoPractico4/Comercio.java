
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }
    
    public Comercio(String p_nombre, HashMap p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap p_empleados){
        this.empleados = p_empleados;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    //Otros metodos
    public void altaEmpleadoo(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    public Empleado bajaEmpleado(long p_cuil){
        Empleado aux = this.getEmpleados().get(p_cuil);
        this.getEmpleados().remove(p_cuil);
        
        return aux;
    }
    
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    public void sueldoNeto(long p_cuil){
        System.out.println("$" + this.getEmpleados().get(p_cuil).sueldoNeto());
    }
    
    public void nomina(){
        System.out.println("\t****Nomina de empleados de " + this.getNombre() + " ****");
        for(Long clave: this.getEmpleados().keySet()){
            Empleado emp = this.buscarEmpleado(clave);
            System.out.print("\n\t" + emp.getCuil() + " " + emp.nomYApe() + "-----");
            this.sueldoNeto(clave);
        }
    }
}