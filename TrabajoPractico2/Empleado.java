/**
 * Ejercicio 5 - Modelado de la clase Empleado
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
  private int anioIngreso;
    
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
    setCuil(p_cuil);
    setApellido(p_apellido);
    setNombre(p_nombre);
    setSueldoBasico(p_importe);
    setAnioIngreso(p_anio);
  }
  //Métodos
  /**
   * Mutador privado que permite agregar/modificar
   * el CUIL
   * @param p_cuil el CUIL que se asignará al empleado
   */
  private void setCuil(long p_cuil){
    cuil = p_cuil;
  }
  /**
   * Mutador privado que permite agregar/modificar
   * el apellido.
   * @param p_apellido el apellido que se asingnará 
   * al empleado
   */
  private void setApellido(String p_apellido){
    apellido = p_apellido;
  }
  /**
   * Mutador privado que permite agregar/modificar
   * el nombre del empleado.
   * @param p_nombre el nombre a asignar al empleado
   */
  private void setNombre(String p_nombre){
    nombre = p_nombre;
  }
  /**
   * Mutador privado que permite agregar/modificar 
   * el sueldo básico.
   * @param p_importe el sueldo básico que será 
   * asignado al empleado
   */
  private void setSueldoBasico(double p_importe){
    sueldoBasico = p_importe;
  }
  /**
   * Mutador privado que permite agregar/modificar 
   * el año de ingreso.
   * @param p_anio año de ingreso del empleado a la
   * empresa
   */
  private void setAnioIngreso(int p_anio){
    anioIngreso = p_anio;
  }
  /**
   * Observador para el CUIL del empleado
   * @return CUIL del empleado
   */
  public long getCuil(){
    return cuil;
  }
  /**
   * Observador para el apellido del empleado
   * @return el apellido como cadena de texto
   */
  public String getApellido(){
    return apellido;
  }
  /**
   * Observador para el nombre del empleado
   * @return el nombre como cadena de texto
   */
  public String getNombre(){
    return nombre;
  }
  /**
   * Observador que obtiene el sueldo básico
   * del empleado.
   * @return el sueldo básico
   */
  public double getSueldoBasico(){
    return sueldoBasico;
  }
  /**
   * Observador que obtiene el año en el
   * que el empleado ingresó a la empresa.
   * @return el año de ingreso como un entero
   */
  public int getAnioIngreso(){
    return anioIngreso;
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
    return anioHoy - getAnioIngreso();
  }
  /**
   * Método privado que obtiene el descuento a aplicar,
   * tomando en cuenta el 2% del sueldo básico en concepto
   * de obra social, mas $1500 de seguro de vida.
   * @return el descuento calculado que se aplicará
   */
  private double descuento(){
    return (getSueldoBasico() / (2 * 100)) + 1500.0;
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
    if(antiguedad() < 2){
      aux = getSueldoBasico() * 2 / 100;
    } else if(antiguedad() >= 2 && antiguedad() < 10){
      aux = getSueldoBasico() * 4 / 100;
    } else {
      aux = getSueldoBasico() * 6 /100;
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
    return getSueldoBasico() + adicional() - descuento();
  }
  /**
   * Obtiene el nombre y el apellido del empleado con el
   * formato "[nombre] [apellido]"
   * @return el nombre y apellido del empleado como una cadena
   */
  public String nomYApe(){
    return getNombre() + " " + getApellido();
  }
  /**
   * Obtiene el nombre y el apellido del empleado con el
   * formato "[apellido], [nombre]"
   * @return el apellido y el nombre del empleado como una
   * cadena.
   */
  public String apeYNom(){
    return getApellido() + ", " + getNombre();
  }
  /**
   * Muestra por pantalla varias cadenas de texto, en el formato
   * "Nombre y Apellido: [nombre] [apellido]
   *  CUIL: [cuil] Antigüedad: [antiguedad()] años de servicio
   *  Sueldo Neto: $[sueldoNeto()]"
   */
  public void mostrar(){
    System.out.println("\tNombre y Apellido: " + nomYApe());
    System.out.println("\tCUIL: " + getCuil() + " Antigüedad: " +
      antiguedad() + " años de servicio");
    System.out.println("\tSueldo Neto: $" + sueldoNeto());
  }
  /**
   * Obtiene y formatea datos del empleado como una sola línea 
   * de texto: "[cuil]  [apellido],[nombre] ......[sueldoNeto()]".
   * @return una línea de texto con el CUIL, el nombre y apellido
   * y el sueldo neto del empleado
   */
  public String mostrarLinea(){
    return getCuil() + ("\t") + apeYNom() + "\t........$" + 
      sueldoNeto();
  }
}