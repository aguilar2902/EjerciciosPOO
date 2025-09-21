 
/**
 * Ejercicio 3 y 4: Implementación de la clase Banco
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
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    /**
     * Constructor de Banco con un empleado (sin cuentas bancarias)
     * 
     * @param p_nombre nombre del banco
     * @param p_localidad localidad donde se encuentra (objeto)
     * @param p_nroSucursal numero de sucursal
     * @param p_empleado El empleado a registrar (objeto)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        
        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(p_empleado);
        this.setEmpleados(lista);
    }
    
    /**
     * Constructor de Banco que recibe una lista de empleados
     * 
     * @param p_nombre nombre del banco
     * @param p_localidad localidad donde se encuentra (objeto)
     * @param p_nroSucursal número de sucursal
     * @param p_empleados lista de empleados a registrar (ArrayList)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);        
    }
    
    
    /**
     * Constructor de Banco con varios empleados y varias cuentas bancarias
     * 
     * @param p_nombre nombre del banco
     * @param p_localidad localidad donde se encuentra (objeto)
     * @param p_nroSucursal número de sucursal
     * @param p_empleados lista de empleados a registrar(arraylist del objeto Empleado)
     * @param p_cuentas lista de cuentas bancarias asociadas (arraylist del objeto CuentasBancarias)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        
        if(p_cuentas.isEmpty()){
            this.setCuentasBancarias(new ArrayList<>());
        }else{
            this.setCuentasBancarias(p_cuentas);
        }
    }
    
    //mutadores
    /**
     * Mutador privado para el atributo nombre (agregar/modificar)
     * @param p_nombre nombre del banco
     */
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
    
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentasBancarias = p_cuentas;
    }
    
    //observadores
    /**
     * Observador para el atributo nombre
     * @return nombre del banco
     */
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
    
    public ArrayList<CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    
    //otros metodos
    /**
     * Método para agregar un empleado a la colección
     * @param p_empleado Empleado a agregar (objeto)
     * 
     * @return Verdadero si se añade correctamente; De lo contrario, falso.
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Método para quitar un empleado a la colección
     * @param p_empleado Empleado a quitar (objeto)
     * 
     * @return Verdadero si puede eliminar; De lo contrario, falso.
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() == 1){
            return false;
        }
        return this.getEmpleados().remove(p_empleado);
    }
    
    /**
     * Metodo que lista todos los empleados (cuil - nomYApe - sueldo)
     */
    public void listarSueldos(){
        for(Empleado emp: this.getEmpleados()){
            System.out.println("\t"+ emp.getCuil() + "  "+ emp.nomYApe() + 
                               "------------------------ $" + emp.sueldoNeto());
        }
    }
    
    /**
     * Metódo que suma todos los sueldo a pagar por el banco
     * 
     * @return la sumatoria de los sueldos
     */
    public double sueldosAPagar(){
        double total = 0.0;
        
        for(Empleado emp: this.getEmpleados()){
            total += emp.sueldoNeto();
        }
        
        return total;
    }
    
    /**
     * Metodo que muestra los datos del banco, lista de empleados y el total a pagar de los sueldos.
     */
    public void mostrar(){
        System.out.println("\n\t" + "=".repeat(70));
        System.out.println("\tBanco: " + this.getNombre() + "    Sucursal: " + this.getNroSucursal());
        System.out.println("\tLocalidad: " + this.getLocalidad().getNombre() + "    Provincia: " + this.getLocalidad().getProvincia());
        System.out.println();
        this.listarSueldos();
        System.out.println("\n\tTotal a Pagar------------------------------------------------ $" + this.sueldosAPagar());
        System.out.println("\t" + "=".repeat(70));
        System.out.println();
    }
    
    /**
     * Método para agregar una cuenta bancaria a la colección
     * @param p_cuenta datos de la cuenta bancaria a agregar (objeto)
     * 
     * @return Verdadero si se añade correctamente; De lo contrario, falso.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    
    /**
     * Método para eliminar una cuenta bancaria de la colección
     * @param p_cuenta datos de la cuenta bancaria a eliminar (objeto)
     * 
     * @return Verdadero si lo elimina; De lo contrario, falso.
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this. getCuentasBancarias().remove(p_cuenta);
    }
    
    /**
     * Método que lista las cuentas con saldo en cero
     */
    public void listaCuentasConSaldoCero(){
        System.out.println("\tCuentas sin saldo:");
        System.out.println("\t--- Cuenta ------------- Apellido y Nombre ---------------");
        
        for (CuentaBancaria cuentaBancaria: this.getCuentasBancarias()){
            if(cuentaBancaria.getSaldo() == 0.00){
                System.out.println("\t " + cuentaBancaria.getNroCuenta() + "\t\t\t" + cuentaBancaria.getTitular().apeYNom());
            }
        }
    }
    
    /**
     * Método que lista los titulares de cuentas bancarias 
     * 
     * @return lista de titulares (sin duplicados)
     */
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> lista = new HashSet<>();
        
        for(CuentaBancaria cuentaBancaria : this.getCuentasBancarias()){
            lista.add(cuentaBancaria.getTitular());
        }
        
        return lista;
    }
    
    /**
     * Método que cuenta las cuentas bancarias activas (con saldo)
     * 
     * @return cantidad de cuentas con saldo
     */
    private int cuentasSaldoActivo(){
        int contador = 0;
        
        for (CuentaBancaria cuentaBancaria : this.getCuentasBancarias()){
            if(cuentaBancaria.getSaldo() > 0.00){
                contador++;
            }
        }
    
        return contador;
    }
    
    /**
     * Método que muestra resumen general. 
     * Datos del banco, resumen de cuentas y clientes
     */
    public void mostrarResumen(){
        int cont = 0;
        System.out.println("\n\tBanco: " + this.getNombre() + "    Sucursal: " + this.getNroSucursal());
        System.out.println("\tLocalidad: " + this.getLocalidad().getNombre() + "    Provincia: " + this.getLocalidad().getProvincia());
        System.out.println("\t************************************************************");
        System.out.println("\tRESUMEN DE CUENTAS BANCARIAS");
        System.out.println("\t************************************************************");
        System.out.println("\tNumero total de Cuentas Bancarias: " + this.getCuentasBancarias().size());
        System.out.println("\tCuentas Activas: " + this.cuentasSaldoActivo());
        
        
        for (CuentaBancaria cuentaBancaria : this.getCuentasBancarias()){
            if(cuentaBancaria.getSaldo() == 0.00){
                cont++;
            }
        }
        
        System.out.println("\tCuentas Saldo Cero: " + cont);
        System.out.println("\t------------------------------------------------------------");
        this.listaCuentasConSaldoCero();
        System.out.println("\t------------------------------------------------------------");
        System.out.print("\tListado de clientes: ");
        
        for(Persona p: this.listaDeTitulares()){
            System.out.print(p.nomYApe() + "; ");
        }  
        System.out.println("\n\t------------------------------------------------------------\n");
    }
}