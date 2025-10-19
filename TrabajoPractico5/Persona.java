/**
 * Implementación de Persona. 
 * 
 * Nota: Para trabajar con fechas, agregar: import java.util.*;<br>
 * Para saber el año actual usar:<br>
 * Calendar fechaHoy = new GregorianCalendar();<br>
 * int anioHoy = fechaHoy.get(Calendar.YEAR);<br>
 * Para más información sobre la clase Calendar buscar en la 
 * documentación de JAVA http://docs.oracle.com/javase/6/docs/api/).
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
import java.util.*;

public class Persona
{
  /**
   * Atributos de la clase Persona
   */ 
  private int nroDni;
  private String nombre;
  private String apellido;
  private Calendar fechaNacimiento;
   
  /**
   * Constructor para una persona
   * @param p_dni dni de la persona como numero entero
   * @param p_nombre nombre de la persona como una cadena de texto
   * @param p_apellido apellido de la persona como una cadena de texto
   * @param p_anio anio de nacimiento de la persona como un tipo entero
   */
  public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
    this.setDni(p_dni);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    //Creo una fecha de cumpleaños estándar, para evitar el null.
    this.setFechaNacimiento(Calendar.getInstance()) ;
    this.setAnioNacimiento(p_anio);
  }
  /**
   * Nuevo Constructor que recibe en lugar de un año de nacimiento, un objeto Calendar
   * @param p_dni dni de la persona como numero entero
   * @param p_nombre nombre de la persona como una cadena de texto
   * @param p_apellido apellido de la persona como una cadena de texto
   * @param p_fechaNac fecha de cumpleaños como instancia de Calendar
   */
  public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fechaNac){
    this.setDni(p_dni);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setFechaNacimiento(p_fechaNac);
  }
  //Mutadores  
  /**
   * @param p_dni El DNI que se le asignará a la persona
   */
  private void setDni(int p_dni){
    this.nroDni = p_dni;
  }
  /**
   * @param p_nombre El nombre que se le asignará a la persona
   */
  private void setNombre(String p_nombre){
    this.nombre = p_nombre;
  }
  /**
   * @param p_apellido El apellido que se le asignará a la persona
   */
  private void setApellido(String p_apellido){
    this.apellido = p_apellido;
  }
  /**
   * @param p_anio el año de nacimiento de la persona
   */
  private void setAnioNacimiento(int p_anio){
      this.getFechaNacimiento().set(Calendar.YEAR,p_anio);
  }
  /**
   * @param p_fechaNac La fecha de nacimiento de la persona
   */
  private void setFechaNacimiento(Calendar p_fechaNac){
    this.fechaNacimiento = p_fechaNac;
  }
  
  //Observadores
  /**
   * @return El DNI de la persona
   */
  public int getDni(){
    return this.nroDni;
  }
  /**
   * @return El nombre completo de la persona
   */
  public String getNombre(){
    return this.nombre;
  }
  
  /**
   * @return El/los apellido/s de la persona
   */
  public String getApellido(){
    return this.apellido;
  }
   
  /**
   * @return El año de nacimiento de la persona
   */
  public int getAnioNacimiento(){
    return this.getFechaNacimiento().get(Calendar.YEAR);
  }
  /**
   * Método del Ejercicio 9
   * @return la fecha de nacimiento como objeto Calendar
   */
  public Calendar getFechaNacimiento(){
      return this.fechaNacimiento;
  }
  /**
   * Obtiene la edad de la persona calculada teniendo en cuenta 
   * solamente la diferencia entre el año actual y el de nacimiento
   * @return Edad aproximada en años
   */
  public int edad(){
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);
    return anioHoy - this.getAnioNacimiento();
  }
  
  /**
   * @return El nombre y apellido con el formato: "[Nombre/s] [Apellido/s]" 
   */
  public String nomYApe(){
    return this.getNombre() + " " + this.getApellido();
  }
  
  /**
   * @return El nombre y apellido con el formato: "[Apellido/s] [Nombre/s]" 
   */
  public String apeYNom(){
    return this.getApellido() + ", " + this.getNombre();
  }
  
  /**
   * Muestra por pantalla datos básicos de la persona: Nombre y apellido, DNI
   * y edad aproximada en años
   */
  public void mostrar(){
    System.out.println("\tNombre y Apellido: " + this.nomYApe());
    System.out.println("\tDNI:" + this.getDni() + "  Edad: " + this.edad() + " años");
  }   
  /**
   * Nuevo método que informa si es o no el cumpleaños de la persona en el día de hoy
   * @return true/false según sea o no el cumpleaños de la persona.
   */
  public boolean esCumpleanios(){
      Calendar hoy = Calendar.getInstance();
      if((this.getFechaNacimiento().get(Calendar.DATE) == hoy.get(Calendar.DATE)) && 
        (this.getFechaNacimiento().get(Calendar.MONTH) == hoy.get(Calendar.MONTH))){
          return true;    
      } else {
          return false;
      }
  }
}