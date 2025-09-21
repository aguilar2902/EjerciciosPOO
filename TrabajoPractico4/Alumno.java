/**
 * Ejercicio 5: Reutilizacion de la clase Alumno
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto 
 * @version 1.00 18-08-25
 */
public class Alumno
{
  /**
   * Atributos privados de la clase
   */
  private int lu;
  private String nombre;
  private String apellido;
  private double nota1;
  private double nota2;
    
  /**
   * Método Constructor de Alumno (solo 3 parámetros son cargados)
   * @param p_lu Número del libreta universitaria del alumno
   * @param p_nombre Nombre del alumno
   * @param p_apellido Apellido del alumno
   */
  public Alumno(int p_lu, String p_nombre, String p_apellido){
    this.setLu(p_lu);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
  }
  //Mutadores/Setters
  /**
   * Mutador privado para el núm de libreta
   * @param p_lu libreta universitaria del alumno como entero
   */
  private void setLu(int p_lu){
    this.lu = p_lu;
  }
  /**
   * Mutador privado para el nombre del alumno
   * @param p_nombre nombre del alumno
   */
  private void setNombre(String p_nombre){
    this.nombre = p_nombre;
  }
  /**
   * Mutador privado para el apellido del alumno
   * @param p_apellido apellido del alumno
   */
  private void setApellido(String p_apellido){
    this.apellido = p_apellido;
  }
  /**
   * Mutador público para la nota 1
   * @param p_nota nota1 del alumno
   */
  public void setNota1(double p_nota){
    this.nota1 = p_nota;
  }
  /**
   * Mutador público para la nota 2
   * @param p_nota nota2 del alumno
   */
  public void setNota2(double p_nota){
    this.nota2 = p_nota;
  }
  //Observadores/Getters (públicos)
  /**
   * Observador para obtener la LU del alumno
   * @return el número de libreta del alumno
   */
  public int getLu(){
    return this.lu;
  }
  /**
   * Observador para el nombre del alumno
   * @return el nombre del alumno
   */
  public String getNombre(){
    return this.nombre;
  }
  /**
   * Observador para el apellido del alumno
   * @return el apellido del alumno
   */
  public String getApellido(){
    return this.apellido;
  }
  /**
   * Observador para la nota 1 del alumno
   * @return la nota1 del alumno
   */
  public double getNota1(){
    return this.nota1;
  }
  /**
   * Observador para la nota 2 del alumno
   * @return la nota2 del alumno
   */
  public double getNota2(){
    return this.nota2;
  }
  //Otros métodos
  /**
   * Método público para hallar el promedio entre las dos
   * notas del alumno
   * @return el promedio de las notas
   */
  public double promedio(){
    return (this.getNota1() + this.getNota2())/2;
  }
  /**
   * Método privado que evalua si el alumno cumplió
   * con ambas notas obteniendo valores mayores o iguales a 6,
   * además de que el promedio entre ambas sea superior a 7.
   * @return un booleando true/false según el cumplimiento o no
   * de los criterios.
   */
  private boolean aprueba(){
    if((this.getNota1()>= 6.0) && (this.getNota2()>=6.0) && (this.promedio()>7.0)){
      return true;
    }
      return false;
  }
  /**
   * Método privado que expone una cadena de texto
   * que varía según el alumno apruebe o no (hace uso 
   * del método aprueba())
   * @return una cadena de texto con la leyenda "APROBADO"
   * o "DESAPROBADO" según el caso.
   */
  private String leyendaAprueba(){
    if(this.aprueba()){
      return "APROBADO";
    } else {
      return "DESAPROBADO";
    }
  }
  /**
   * Método público para el nombre y apellido del alumno
   * @return una cadena de texto en formato "[nombre] [apellido]"
   */
  public String nomYApe(){
    return this.getNombre() + " " + this.getApellido();
  }
  /**
   * Método público para el apellido y nombre del alumno
   * @return una cadena de texto en formato "[apellido] [nombre]"
   */
  public String apeYNom(){
    return this.getApellido() + " " + this.getNombre();
  }
  /**
   * Método público que imprime en pantalla datos de un alumno
   * en formato:<br>
   * "Nombre y Apellido: [nombre] [apellido]<br>
   * LU: [lu] Notas: [nota1]-[nota2]<br>
   * Promedio: [promedio] - [APROBADO/DESAPROBADO]"
   */
  public void mostrar(){
    System.out.println("\nNombre y Apellido: " + nomYApe());
    System.out.println("LU: " + this.getLu() + "  Notas: " + this.getNota1() + 
      "-" + getNota2());
    System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    System.out.println();
  }
}