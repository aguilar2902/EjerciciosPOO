/**
 * Creacion de la Clase Triangulo
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    
    /**
     * Constructor de un Triángulo con origen distinto a (0,0)
     * @param p_x coordenada eje x del punto
     * @param p_y coordenada eje y del punto
     * @param p_base valor de la base
     * @param p_altura valor de la altura
     */
    public Triangulo(double p_x, double p_y, double p_base, double p_altura){
        super(p_x, p_y);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    /**
     * Constructor de un Triángulo con origen (0,0)
     * @param p_base valor de la base
     * @param p_altura valor de la altura
     */
    public Triangulo(double p_base, double p_altura){
        super(0, 0);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    //Mutadores
    /**
     * Asigna un valor a la base
     * @param p_base valor para la base
     */
    private void setBase(double p_base){
        this.base = p_base;
    }
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    //Observadores
    /**
     * Obtiene el valor de la base
     * @return valor de la base
     */
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Otros métodos
    /**
     * Obtiene el nombre de la figura
     * @return una cadena de texto con la leyenda Triángulo
     */
    public String nombreFigura(){
        return "\t****** Triángulo ****** ";
    }
    /**
     * @return el valor de la superficie de la figura
     */
    public double superficie(){
        return (this.getBase() * this.getAltura())/ 2;
    }
    
}