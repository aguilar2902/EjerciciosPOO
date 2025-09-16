
/**
 * Ejercicio 3: Implementación de la clase Banco
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Banco
{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        
        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(p_empleado);
        this.setEmpleados(lista);
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);        
    }
    
    //mutadores
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setNroSucursal(int p_sucursal){
        this.nroSucursal = p_sucursal;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    //observadores
    public String getNombre(){
        return this.nombre;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    
    //otros metodos
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() == 1){
            return false;
        }
        return this.getEmpleados().remove(p_empleado);
    }
    
    public void listarSueldos(){
        for(Empleado emp: empleados){
            System.out.println("\t"+ emp.getCuil() + "  "+ emp.nomYApe() + 
                               "------------------------ $" + emp.sueldoNeto());
        }
    }
    
    public double sueldosAPagar(){
        double total = 0.0;
        
        for(Empleado emp: empleados){
            total += emp.sueldoNeto();
        }
        
        return total;
    }
    
    public void mostrar(){
        System.out.println("\tBanco: " + this.getNombre() + "    Sucursal: " + this.getNroSucursal());
        System.out.println("\tLocalidad: " + this.getLocalidad().getNombre() + "    Provincia: " + this.getLocalidad().getProvincia());
        System.out.println();
        this.listarSueldos();
        System.out.println("\tTotal a Pagar------------------------------------------------ $" + this.sueldosAPagar());
    }
}