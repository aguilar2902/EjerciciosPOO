/**
 * Ejercicio 12
 * Implementacion de la clase EmpleadoConJefe
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class EmpleadoConJefe
{
  /**
   * Atributos de un empleado
   */
  private long cuil;
  private String apellido;
  private String nombre;
  private double sueldoBasico;
  private Calendar fechaIngreso;
  private EmpleadoConJefe jefe;
  
  /**
   * Constructor clase EmpleadoConJefe completo
   * 
   * @param p_cuil CUIL del empleado
   * @param p_apellido apellido del empleado
   * @param p_nombre nombre del empleado
   * @param p_importe sueldo básico del empleado
   * @param p_fecha fecha de ingreso
   * @param p_jefe Datos del jefe. Objeto de EmpleadoConJefe
   */
  public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
  
  /**
   * Constructor clase EmpleadoConJefe sin jefe asignado
   * 
   * @param p_cuil CUIL del empleado
   * @param p_apellido apellido del empleado
   * @param p_nombre nombre del empleado
   * @param p_importe sueldo básico del empleado
   * @param p_fecha fecha de ingreso
   */
  
  public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }
    
  /**
   * Constructor clase EmpleadoConJefe sin jefe y solo año de ingreso
   * 
   * @param p_cuil CUIL del empleado
   * @param p_apellido apellido del empleado
   * @param p_nombre nombre del empleado
   * @param p_importe sueldo básico del empleado
   * @param p_anio año de ingreso a la empresa
   */
  public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setSueldoBasico(p_importe);
    this.setFechaIngreso(Calendar.getInstance());
    this.setAnioIngreso(p_anio);
    this.setJefe(null);
  }
    
  /**
   * Mutador privado que permite agregar/modificar el cuil
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
  
  private void setFechaIngreso(Calendar p_fecha){
      this.fechaIngreso = p_fecha;
  }
  
  private void setJefe(EmpleadoConJefe p_jefe){
      this.jefe = p_jefe;
  }
  
  /**
   * Observador para el CUIL del empleado
   * 
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
  
  public EmpleadoConJefe getJefe(){
    return this.jefe;
  }
  
  /**
   * Obtiene la antigüedad del empleado
   * 
   * @return la antigüedad del empleado como un entero
   */
  public int antiguedad(){
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);
    return anioHoy - this.getAnioIngreso();
  }
  
  /**
   * Obtiene el descuento a aplicar, 2% del sueldo básico en concepto de obra social, mas $1500 de seguro de vida.
   *  
   * @return el descuento calculado
   */
  private double descuento(){
    return (this.getSueldoBasico() / (2 * 100)) + 1500.0;
  }
  
  /**
   * Calcula el adicional teniendo en cuenta la antigüedad del empleado:
   * <ul><li>Menor a 2 años: 2% de adicional</li>
   * <li>Entre 2 y 9 años: 4% de adicional</li>
   * <li>10 años o más: 6% de adicional</li></ul>
   * @return el adicional correspondiente
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
   * Obtiene el sueldo neto, sumando el sueldo básico con el adicional y restando el descuento
   * 
   * @return el sueldo neto del empleado
   */
  public double sueldoNeto(){
    return this.getSueldoBasico() + this.adicional() - this.descuento();
  }
  
  /**
   * Obtiene el nombre y el apellido del empleado con el formato "[nombre] [apellido]"
   * 
   * @return nombre y apellido como cadena
   */
  public String nomYApe(){
    return this.getNombre() + " " + this.getApellido();
  }
  
  /**
   * Obtiene el nombre y el apellido del empleado con el formato "[apellido], [nombre]"
   * 
   * @return el apellido y el nombre como una cadena.
   */
  public String apeYNom(){
    return this.getApellido() + ", " + this.getNombre();
  }
  
  /**
   * Muestra por pantalla Nombre y apellido, cuil, años de servicio, sueldo neto y a quien responde
   */
  public void mostrar(){
    String auxiliar;
    
    if(this.getJefe() == null){
        auxiliar = "GERENTE GENERAL";
    }else{
        auxiliar = this.getJefe().nomYApe();
    }
    
    System.out.println("\tNombre y Apellido: " + this.nomYApe());
    System.out.println("\tCUIL: " + this.getCuil() + " Antigüedad: " + this.antiguedad() + " años de servicio");
    System.out.println("\tSueldo Neto: $" + this.sueldoNeto());
    System.out.println("\tResponde a: " + auxiliar);
  }
  
  /**
   * Obtiene y formatea datos del empleado como una sola línea: "[cuil]  [apellido],[nombre] ......[sueldoNeto()]".
   * 
   * @return línea de texto con el CUIL, el nombre y apellido y el sueldo neto
   */
  public String mostrarLinea(){
    return this.getCuil() + ("\t") + this.apeYNom() + "\t........$" + this.sueldoNeto();
  }
  
  /**
   * Muestra si el empleado ha cumplido un año mas en la empresa
   * 
   * @return true o false
   */
  public boolean esAniversario(){
      Calendar fechaHoy = Calendar.getInstance();
      if((this.getFechaIngreso().get(Calendar.DATE) == fechaHoy.get(Calendar.DATE)) &&
          (this.getFechaIngreso().get(Calendar.MONTH) == fechaHoy.get(Calendar.MONTH))){
          return true;
      }else{
          return false;
      }
      
  }
}