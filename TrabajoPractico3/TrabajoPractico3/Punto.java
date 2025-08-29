/**
 * Ejercicio número 6
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
   * Asignar el valor predeterminaod 0 a las 
   * coordenadas
   */
  public Punto(){
    setX(0);
    setY(0);
  }
  /**
   * Constructor de un punto con parámetros
   * @param p_x coordenada de abscisa a asignar
   * @param p_y coordenada de ordenada a asignar
   */
  public Punto(double p_x, double p_y){
    setX(p_x);
    setY(p_y);
  }
  //Mutadores 
  /**
   * Mutador privado para asignar un valor a "x"
   * @param p_x coordenada de abscisa 
   */
  private void setX(double p_x){
    x = p_x;
  }
  /**
   * Mutador privado para asignar un valor a "y"
   * @param p_y valor a asignar a la ordenada
   */
  private void setY(double p_y){
    y = p_y;
  }
  //Observadores
  /**
   * Observador para obtener el valor de "x"
   * @return el valor de abscisa
   */
  public double getX(){
    return x;
  }
  /**
   * Observador para obtener el valor de "y"
   * @return el valor de la ordenada
   */
  public double getY(){
    return y;
  }
  //Otros métodos
  public double distanciaA(Punto p_ptoDistante){
      return Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()) ,2) + Math.pow((p_ptoDistante.getY() - this.getY()), 2));
  }
  
  
  /**
   * Método para cambiar la posición del punto
   * desde (x, y) a (x + p_dx, y + p_dy).
   * @param p_dx desplazamiento requerido para la abscisa
   * @param p_dy desplazamiento requerido para la ordenada
   */
  public void desplazar(double p_dx, double p_dy){
    setX(getX() + p_dx);
    setY(getY() + p_dy);
  }
  /**
   * Método para imprimir en pantalla información sobre el
   * punto en formato: "Punto. X:[valor x], Y:[valor y]"
   */
  public void mostrar(){
    System.out.println("Punto. X:" + getX() + ", Y:" + getY());
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