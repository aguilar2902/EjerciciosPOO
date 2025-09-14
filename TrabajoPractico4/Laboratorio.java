/**
 * Ejercicio 2: Reutilizacion de la Clase Laboratorio
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Laboratorio
{
  /**
   * Atributos para la clase Laboratorio
   */
  private String nombre;
  private String domicilio;
  private String telefono;
  private int compraMinima;
  private int diaEntrega;
  
  //Constructores
  /**
   * Método Constructor de la clase Laboratorio (completo)
   * @param p_nombre nombre del laboratorio
   * @param p_domicilio dirección del laboratorio
   * @param p_telefono número de teléfono del laboratorio
   * @param p_compraMinima valor entero de la compra mínima
   * @param p_diaEnt dia de entrega
   */
  public Laboratorio(String p_nombre, String p_domicilio, String p_telefono,
    int p_compraMinima, int p_diaEnt){
    this.setNombre(p_nombre);
    this.setDomicilio(p_domicilio);
    this.setTelefono(p_telefono);
    this.setCompraMinima(p_compraMinima);
    this.setDiaEntrega(p_diaEnt);
  }
  /**
   * Método Constructor para los datos mínimos
   * @param p_nombre nombre del laboratorio
   * @param p_domicilio dirección del laboratorio
   * @param p_telefono número de teléfono del laboratorio
   */
  public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
    this.setNombre(p_nombre);
    this.setDomicilio(p_domicilio);
    this.setTelefono(p_telefono);
  }
  //Mutadores
  /**
   * Mutador privador para el nombre del laboratorio
   * @param p_nombre nombre del laboratorio
   */
  private void setNombre(String p_nombre){
    this.nombre = p_nombre;
  }
  private void setDomicilio(String p_domicilio){
    this.domicilio = p_domicilio;
  }
  private void setTelefono(String p_telefono){
    this.telefono = p_telefono;
  }
  private void setCompraMinima(int p_compraMinima){
    this.compraMinima = p_compraMinima;
  }
  private void setDiaEntrega(int p_diaEnt){
    this.diaEntrega = p_diaEnt;
  }
  //Observadores
  /**
   * Observador para el nombre del lab.
   * @return el nombre del laboratorio 
   */
  public String getNombre(){
    return this.nombre;
  }
  public String getDomicilio(){
    return this.domicilio;
  }
  public String getTelefono(){
    return this.telefono;
  }
  public int getCompraMinima(){
    return this.compraMinima;
  }
  public int getDiaEntrega(){
    return this.diaEntrega;
  }
  
  //Mutadores especiales
  /**
   * Mutador público para asignar una nueva compra mínima
   * @param p_compraMinima compra mínima del laboratorio
   */
  public void nuevaCompraMinima(int p_compraMinima){
    this.setCompraMinima(p_compraMinima);
  }
  /**
   * Mutador público para asignar un nuevo día de entrega
   * @param p_diaEnt día de entrega
   */
  public void nuevoDiaEntrega(int p_diaEnt){
    this.setDiaEntrega(p_diaEnt);
  }
  //Otros métodos
  /**
   * Muestra por pantalla datos básicos del laboratorio
   * @return el nombre, domicilio y teléfono del laboratorio
   */
  public String mostrar(){
    return "\tLaboratorio: " + this.getNombre() + "\n\tDomicilio: " +
      this.getDomicilio() + " - " + "Teléfono: " + this.getTelefono(); 
  }  
}