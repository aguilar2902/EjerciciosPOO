
/**
 * Ejercicio 4: Implementación de la clase Rectángulo
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Rectangulo
{
    //Atributos
    private Punto origen;
    private double ancho;
    private double alto;
    
    /**
     * Constructor para un rectángulo con un punto "p" de origen enviado por el usuario
     * @param p_origen el punto que será el origen
     * @param p_ancho el valor correspondiente al ancho del rectángulo
     * @param p_alto el valor que representa la altura del rectángulo
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    /**
     * Constructor para un rectángulo con origen en (0,0)
     * @param p_ancho el valor correspondiente al ancho del rectángulo
     * @param p_alto el valor que representa la altura del rectángulo
     */    
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto(0,0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    //Mutadores
    /**
     * Mutador privado para setear el punto que marca el origen
     * @param p_origen punto requerido como origen del rectángulo
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this. alto = p_alto;
    }
    //Observadores
    /**
     * Observador que obtiene el punto origen del rectángulo
     * @return el punto origen
     */
    public Punto getOrigen(){
        return this.origen;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }
    //Otros métodos
    /**
     * Desplaza el rectángulo teniendo en cuenta la variación de las coordenadas
     * del punto origen del mismo
     * @param p_dx valor de la abscisa 
     * @param p_dy valor de la ordenada
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    /**
     * Muestra las características del rectángulo(Origen, Alto, Ancho, Superficie y Perímetro)
     */
    public void caracteristicas(){
        System.out.println("\n\t****** Rectangulo ******");
        System.out.println("\tOrigen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() +
            " - Ancho: " + this.getAncho());
        System.out.println("\tSuperficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
        System.out.println();
    }
    /**
     * @return el valor correspondiente al perímetro del rectángulo
     */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    /**
     * @return el valor de la superficie del rectángulo
     */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    /**
     * Calcula la distancia entre dos rectángulos a partir de la distancia de 
     * sus respectivos puntos de origen.
     * @param otroRectangulo objeto del tipo rectángulo con el que se desea calcular la distancia
     * @return la distancia entre los rectángulos
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    /**
     * Compara dos rectángulos y obtiene el de mayor superficie
     * @param otroRectangulo rectángulo con el que se realizará la comparación
     * @return el objeto rectángulo con mayor superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
}
