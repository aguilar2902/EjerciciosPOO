
/**
 * Implementación de la clase Cargo
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    /**
     * Constructor para Objetos de la Clase Cargo
     * @param p_nombreCargo nombre del cargo
     * @param p_sueldo sueldo basico del cargo
     * @param p_anioIngreso año de ingreso
     */
    public Cargo(String p_nombreCargo, double p_sueldo,int p_anioIngreso){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(10);
    }
    
    /**
     * Constructor para Objetos de la Clase Cargo
     * @param p_nombreCargo nombre del cargo
     * @param p_sueldo sueldo basico del cargo
     * @param p_horas horas de docencia. Puede variar
     * @param p_anioIngreso año de ingreso
    
     */
    
    public Cargo(String p_nombreCargo, double p_sueldo,int p_horas, int p_anioIngreso){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horas);
    }
    
    //Mutadores
    /**
     * Asigna el nombre del cargo
     * @param p_nombreCargo representa el nombre a asignar
     */
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    private void setHorasDeDocencia(int p_horas){
        this.horasDeDocencia = p_horas;
    }
    //Observadores
    /**
     * Obtiene el nombre asignado al cargo
     * @return nombre del cargo
     */
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    } 
    //Otros métodos
    /**
     * Obtiene la antigüedad del cargo
     * @return la cantidad de años ejercidos en el cargo
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        
        return anioActual - this.getAnioIngreso();
    }
    /**
     * Obtiene el adicional que corresponde, de acuerdo a los años de
     * antigüedad en el cargo y el sueldo básico.
     * @return el monto que corresponde al adicional
     */
    private double adicionalXAntiguedad(){ 
        return this.getSueldoBasico() * this.antiguedad() / 100;
    }
    /**
     * Obtiene el sueldo que corresponde por el cargo(adicional incluido)
     * @return valor del sueldo calculado
     */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + adicionalXAntiguedad();
    }
    /**
     * Muestra por pantalla los detalles del cargo
     */
    public void mostrarCargo(){
        System.out.println("\t" +this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() +
        " - Sueldo Cargo: " + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad() + " años.");
        System.out.println("\tHoras Docencia: " + this.getHorasDeDocencia());
    }

}