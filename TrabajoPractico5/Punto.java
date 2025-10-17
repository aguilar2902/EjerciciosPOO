/**
 * Reutilización de la clase Punto
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Punto
{
  /**
   * Atributos de la clase punto
   */
  private double x;
  private double y;
  
  /**
   * Constructor de un punto sin parámetros
   * Asignar el valor predeterminado 0 a las 
   * coordenadas x e y
   */
  public Punto(){
    this.setX(0);
    this.setY(0);
  }
  /**
   * Constructor de un punto con parámetros
   * @param p_x valor de abscisa a asignar
   * @param p_y valor de ordenada a asignar
   */
  public Punto(double p_x, double p_y){
    this.setX(p_x);
    this.setY(p_y);
  }
  //Mutadores 
  /**
   * Mutador privado para asignar un valor a "x"
   * @param p_x coordenada de abscisa para el punto
   */
  private void setX(double p_x){
    this.x = p_x;
  }
  
  /**
   * Mutador privado para la coordenada "y"
   * @param p_y valor de "y" para el punto
   */
  private void setY(double p_y){
    this.y = p_y;
  }
  //Observadores
  /**
   * Observador para obtener el valor de "x"
   * @return el valor de abscisa del punto
   */
  public double getX(){
    return this.x;
  }
  /**
   * Observador para obtener el valor de "y"
   * @return el valor de la ordenada del punto
   */
  public double getY(){
    return this.y;
  }
  //Otros métodos
  /**
   * Obtiene la distancia entre el punto desde el que se llama al método y otro punto enviado como parámetro.
   * @param p_ptoDistante es el punto con el que se desea calcular la distancia respecto al que llama al método.
   * @return la distancia entre los dos puntos
   */
  public double distanciaA(Punto p_ptoDistante){
      return Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()), 2) + Math.pow((p_ptoDistante.getY() - this.getY()), 2));
  }
  
  /**
   * Método para cambiar la posición del punto
   * desde (x, y) a (x + p_dx, y + p_dy).
   * @param p_dx desplazamiento requerido para la abscisa
   * @param p_dy desplazamiento requerido para la ordenada
   */
  public void desplazar(double p_dx, double p_dy){
    this.setX(this.getX() + p_dx);
    this.setY(this.getY() + p_dy);
  }
  /**
   * Imprime en pantalla información sobre el
   * punto en formato: "Punto. X:[valor x], Y:[valor y]"
   */
  public void mostrar(){
    System.out.println("Punto. X:" + this.getX() + ", Y:" + this.getY());
  }
  /**
   * Método que retorna una cadena de texto con información
   * sobre el punto.
   * @return una cadena de texto en formato "([valor x], [valor y])"
   */
  public String coordenadas(){
    return "(" + this.getX() + ", " + getY() + ")";
  }
}