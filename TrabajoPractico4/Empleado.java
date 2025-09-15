/**
 * Ejercicio 3: Reutilizacion de la Clase Empleado
 * 
 * @author Bengochea Marcelo José De Jesús 
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */

import java.util.*;

public class Empleado
{
  /**
   * Atributos de un empleado
   */
  private long cuil;
  private String apellido;
  private String nombre;
  private double sueldoBasico;
  private Calendar fechaIngreso;
    
  /**
   * Constructor de Empleado
   * @param p_cuil CUIL del empleado
   * @param p_apellido apellido del empleado
   * @param p_nombre nombre del empleado
   * @param p_importe sueldo básico del empleado
   * @param p_anio año en el que el empleado ingresó a la empresa
   */
  public Empleado(long p_cuil, String p_apellido, String p_nombre,
    double p_importe, int p_anio){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setSueldoBasico(p_importe);
    this.setFechaIngreso(Calendar.getInstance());
    this.setAnioIngreso(p_anio);
  }
  /**
   * Nuevo Constructor para el ingreso de fecha completa(Calendar)
   * en lugar de solo año
   * @param p_cuil CUIL del empleado
   * @param p_apellido apellido del empleado
   * @param p_nombre nombre del empleado
   * @param p_importe sueldo básico del empleado
   * @param p_fechaIngreso fecha completa en el que se incorporó a la empresa
   */
   public Empleado(long p_cuil, String p_apellido, String p_nombre,
    double p_importe, Calendar p_fechaIngreso){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setSueldoBasico(p_importe);
    this.setFechaIngreso(p_fechaIngreso);
  }
  //Mutadores
  /**
   * Mutador privado que permite agregar/modificar
   * el CUIL
   * @param p_cuil el CUIL que se asignará al empleado
   */
  private void setCuil(long p_cuil){
    this.cuil = p_cuil;
  }
  private void setApellido(String p_apellido){
    this.apellido = p_apellido;
  }
  private void setNombre(String p_nombre){
    this.nombre = p_nombre;
  }
  private void setSueldoBasico(double p_importe){
    this.sueldoBasico = p_importe;
  }
  private void setAnioIngreso(int p_anio){
    this.getFechaIngreso().set(Calendar.YEAR, p_anio);
  }
  private void setFechaIngreso(Calendar p_fechaIngreso){
    this.fechaIngreso = p_fechaIngreso;
  }
  //Observadores
  /**
   * Observador para el CUIL del empleado
   * @return CUIL del empleado
   */
  public long getCuil(){
    return this.cuil;
  }
  public String getApellido(){
    return this.apellido;
  }
  public String getNombre(){
    return this.nombre;
  }
  public double getSueldoBasico(){
    return this.sueldoBasico;
  }
  public int getAnioIngreso(){
    return this.getFechaIngreso().get(Calendar.YEAR);
  }  
  public Calendar getFechaIngreso(){
      return this.fechaIngreso;
  }
  /**
   * Método que obtiene la antigüedad del empleado
   * en la empresa, realizando la diferencia entre
   * el año actual y el de ingreso a la misma.
   * @return la antigüedad del empleado como un entero
   */
  public int antiguedad(){
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);
    return anioHoy - this.getAnioIngreso();
  }
  /**
   * Método privado que obtiene el descuento a aplicar,
   * tomando en cuenta el 2% del sueldo básico en concepto
   * de obra social, mas $1500 de seguro de vida.
   * @return el descuento calculado que se aplicará
   */
  private double descuento(){
    return (this.getSueldoBasico() / (2 * 100)) + 1500.0;
  }
  /**
   * Método privado que calcula el adicional que le 
   * corresponde al empleado, teniendo en cuenta la
   * antigüedad del mismo:
   * <ul><li>Menor a 2 años: 2% de adicional</li>
   * <li>Entre 2 y 9 años: 4% de adicional</li>
   * <li>10 años o más: 6% de adicional</li></ul>
   * @return el adicional que le corresponde al empleado
   */
  private double adicional(){
    double aux = 0.00;
    if(this.antiguedad() < 2){
      aux = this.getSueldoBasico() * 2 / 100;
    } else if(this.antiguedad() >= 2 && this.antiguedad() < 10){
      aux = this.getSueldoBasico() * 4 / 100;
    } else {
      aux = this.getSueldoBasico() * 6 /100;
    }
    return aux;
  }
  /**
   * Método que obtiene el sueldo neto, calculado a partir
   * de sumar al sueldo básico el adicional y posteriormente 
   * realizar el descuento que corresponde por obra social y 
   * seguro de vida.
   * @return el sueldo neto que le corresponde al empleado
   */
  public double sueldoNeto(){
    return this.getSueldoBasico() + this.adicional() - this.descuento();
  }
  /**
   * Obtiene el nombre y el apellido del empleado con el
   * formato "[nombre] [apellido]"
   * @return el nombre y apellido del empleado como una cadena
   */
  public String nomYApe(){
    return this.getNombre() + " " + this.getApellido();
  }
  /**
   * Obtiene el nombre y el apellido del empleado con el
   * formato "[apellido], [nombre]"
   * @return el apellido y el nombre del empleado como una
   * cadena.
   */
  public String apeYNom(){
    return this.getApellido() + ", " + this.getNombre();
  }
  /**
   * Muestra por pantalla varias cadenas de texto, en el formato
   * "Nombre y Apellido: [nombre] [apellido]
   *  CUIL: [cuil] Antigüedad: [antiguedad()] años de servicio
   *  Sueldo Neto: $[sueldoNeto()]"
   */
  public void mostrar(){
    System.out.println("\tNombre y Apellido: " + this.nomYApe());
    System.out.println("\tCUIL: " + this.getCuil() + " Antigüedad: " +
      this.antiguedad() + " años de servicio");
    System.out.println("\tSueldo Neto: $" + this.sueldoNeto());
  }
  /**
   * Obtiene y formatea datos del empleado como una sola línea 
   * de texto: "[cuil]  [apellido],[nombre] ......[sueldoNeto()]".
   * @return una línea de texto con el CUIL, el nombre y apellido
   * y el sueldo neto del empleado
   */
  public String mostrarLinea(){
    return this.getCuil() + (" \t") + this.apeYNom() + "\t........$" + 
      this.sueldoNeto();
  }
  /**
   * Nuevo método que verifica si se cumple aniversario de ingreso a la empresa
   * @return un booleano que valida si es el día en que se cumple aniversario
   * dentro de la empresa.
   */
  public boolean esAniversario(){
    Calendar hoy = Calendar.getInstance();
    if((this.getFechaIngreso().get(Calendar.DATE) == hoy.get(Calendar.DATE)) &&
       (this.getFechaIngreso().get(Calendar.MONTH) == hoy.get(Calendar.MONTH)) &&
       (this.getAnioIngreso() != hoy.get(Calendar.YEAR))){
         return true;
    } else {
       return false;
    }
  }
}