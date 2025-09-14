
/**
 * Ejercicio 2: Reutilizacion de la Clase Cliente
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00 
 */
public class Cliente
{
  /**
   * Atributos de la clase
   */
  private int nroDni;
  private String apellido;
  private String nombre;
  private double saldo;
    
  /**
   * Constructor de la clase Cliente con todos
   * los parámetros
   * @param p_dni DNI del cliente
   * @param p_apellido Apellido del cliente
   * @param p_nombre Nombre del cliente
   * @param p_importe Saldo del cliente
   */
  public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
    setNroDni(p_dni);
    setApellido(p_apellido);
    setNombre(p_nombre);
    setSaldo(p_importe);
  }
  //Mutadores/Setters
  /**
   * Mutador privado para setear el Dni del cliente
   * @param p_dni DNI del cliente
   */
  private void setNroDni(int p_dni){
    nroDni = p_dni;
  }
  /**
   * Mutador privado para el apellido del cliente
   * @param p_apellido Apellido como cadena de texto
   */
  private void setApellido(String p_apellido){
    apellido = p_apellido;
  }
  /**
   * Mutador privado para el nombre del cliente
   * @param p_nombre El/los nombre/s del cliente
   */
  private void setNombre(String p_nombre){
    nombre = p_nombre;
  }
  /**
   * Mutador para setear el saldo del cliente
   * @param p_importe saldo a asignar al cliente
   */
  private void setSaldo(double p_importe){
    saldo = p_importe;
  }
  //Observadores/Getters
  /**
   * Observador para obtener el DNI del cliente
   * @return el DNI del cliente
   */
  public int getNroDni(){
    return nroDni;
  }
  /**
   * Observador para el apellido
   * @return el apellido del cliente 
   */
  public String getApellido(){
    return apellido;
  }
  /**
   * Observador para el nombre
   * @return el/los nombre/s del clientes
   */
  public String getNombre(){
    return nombre;
  }
  /**
   * Observador para el saldo del cliente
   * @return el saldo disponible en la cuenta
   */
  public double getSaldo(){
    return saldo;
  }
  //Otros métodos
  /**
   * Método para mostrar en pantalla datos del cliente
   * en formato <br>"Nombre y Apellido:[nombre] [apellido] ([dni])
   * <br>Saldo: [saldo]"
   */
  public void mostrar(){
    System.out.println("-Cliente-");
    System.out.println("Nombre y Apellido: " + nomYApe() + " (" + getNroDni() + ")");
    System.out.println("Saldo: $" + getSaldo());
  }
  /**
   * Método público para setear el saldo
   * @param p_importe saldo a setear
   */
  public double nuevoSaldo(double p_importe){
    setSaldo(p_importe);
    return getSaldo();
  }
  /**
   * Método público para adicionar saldo extra
   * @param p_importe saldo a adicionar sobre el ya disponible
   * @return el saldo actualizado
   */
  public double agregaSaldo(double p_importe){
    setSaldo(getSaldo() + p_importe);
    return getSaldo();
  }
  /**
   * Método que retorna el apellido y el/los nombre/s del cliente
   * @return "[apellido] [nombre]" como cadena de texto
   */
  public String apeYNom(){
    return getApellido() + " " + getNombre();
  }
  /**
   * Método que retorna el/los nombres y el apellido del cliente
   * @return "[nombre] [apellido]" como cadena de texto
   */
  public String nomYApe(){
    return getNombre() + " " + getApellido();
  }
}