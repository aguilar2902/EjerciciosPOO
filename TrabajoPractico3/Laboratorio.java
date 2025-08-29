/**
 * Ejercicio 1 - tp 3
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00 18-08-25
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
    setNombre(p_nombre);
    setDomicilio(p_domicilio);
    setTelefono(p_telefono);
    setCompraMinima(p_compraMinima);
    setDiaEntrega(p_diaEnt);
  }
  /**
   * Método Constructor para los datos mínimos
   * @param p_nombre nombre del laboratorio
   * @param p_domicilio dirección del laboratorio
   * @param p_telefono número de teléfono del laboratorio
   */
  public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
    setNombre(p_nombre);
    setDomicilio(p_domicilio);
    setTelefono(p_telefono);
  }
  //Mutadores
  /**
   * Mutador privador para el nombre del laboratorio
   * @param p_nombre nombre del laboratorio
   */
  private void setNombre(String p_nombre){
    nombre = p_nombre;
  }
  /**
   * mutador privado para la dirección del laboratorio
   * @param p_domicilio domicilio del laboratorio
   */
  private void setDomicilio(String p_domicilio){
    domicilio = p_domicilio;
  }
  /**
   * Mutador para el teléfono del laboratorio
   * @param p_telefono número de teléfono
   */
  private void setTelefono(String p_telefono){
    telefono = p_telefono;
  }
  /**
   * Mutador para setear la compra mínima del laboratorio
   * @param p_compraMinima compra mínima del laboratorio
   */
  private void setCompraMinima(int p_compraMinima){
    compraMinima = p_compraMinima;
  }
  /**
   * Mutador para agregar/modificar día de entrega
   * @param p_diaEnt día de entrega
   */
  private void setDiaEntrega(int p_diaEnt){
    diaEntrega = p_diaEnt;
  }
  //Observadores
  /**
   * @return nombre del laboratorio
   */
  public String getNombre(){
    return nombre;
  }
  /**
   * @return el domicilio del laboratorio
   */
  public String getDomicilio(){
    return domicilio;
  }
  /**
   * @return el teléfono del laboratorio
   */
  public String getTelefono(){
    return telefono;
  }
  /**
   * @return la compra mínima como entero
   */
  public int getCompraMinima(){
    return compraMinima;
  }
  /**
   * @return el día de entrega
   */
  public int getDiaEntrega(){
    return diaEntrega;
  }
  //Mutadores especiales
  /**
   * Mutador público para asignar una nueva compra mínima
   * @param p_compraMinima compra mínima del laboratorio
   */
  public void nuevaCompraMinima(int p_compraMinima){
    setCompraMinima(p_compraMinima);
  }
  /**
   * Mutador público para asignar un nuevo día de entrega
   * @param p_diaEnt día de entrega
   */
  public void nuevoDiaEntrega(int p_diaEnt){
    setDiaEntrega(p_diaEnt);
  }
  //Otros métodos
  /**
   * Muestra por pantalla datos básicos del laboratorio
   * @return el nombre, domicilio y teléfono del laboratorio
   */
  public String mostrar(){
    return "\tLaboratorio: " + getNombre() + "\n\tDomicilio: " +
      getDomicilio() + " - " + "Teléfono: " + getTelefono(); 
  }  
}