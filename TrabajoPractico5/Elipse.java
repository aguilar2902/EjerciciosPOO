/**
 * Implementación de la Clase Elipse
 * 
 * @author Bengochea Marcelo José De Jesús
 * @author Aguilar Jonathan Alberto
 * @version 1.00
 */
public class Elipse extends FiguraGeometrica
{
    private double sEjeMayor;
    private double sEjeMenor;
    
    /**
     * Constructor para una Elipse con un punto de origen distinto a (0,0)
     * @param p_x coordenada x del punto de origen
     * @param p_y coordenada y del punto de origen
     * @param p_mayor valor del semieje mayor
     * @param p_menor valor del semieje menor
     */
    public Elipse(double p_x, double p_y, double p_mayor, double p_menor){
        super(p_x, p_y);
        this.setSEjeMayor(p_mayor);
        this.setSEjeMenor(p_menor);
    }
    
    /**
     * Constructor para una Elipse con un punto de origen (0,0)
     * @param p_mayor valor del semieje mayor
     * @param p_menor valor del semieje menor
     */
    public Elipse(double p_mayor, double p_menor){
        super(0, 0);
        this.setSEjeMayor(p_mayor);
        this.setSEjeMenor(p_menor);
    }
    //Mutadores
    /**
     * Setea el eje Mayor
     * @param p_mayor valor correspondiente al eje mayor
     */
    private void setSEjeMayor(double p_mayor){
        this.sEjeMayor = p_mayor;
    }
    private void setSEjeMenor(double p_menor){
        this.sEjeMenor = p_menor;
    }
    //Observadores
    /**
     * Obtiene el semieje mayor
     * @return el valor que corresponde al semieje mayor
     */
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    //Otros métodos
    /**
     * Obtiene la leyenda que representa a la figura
     * @return una cadena de texto con Elipse
     */
    public String nombreFigura(){
        return "\t****** Elipse ****** ";
    }
    
    /**
     * Muestra las características de la Elipse
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("\tCentro: " + this.getOrigen().coordenadas() + " - Semieje Mayor: " + this.getSEjeMayor() +
            " - Semieje Menor: " + this.getSEjeMenor());
        System.out.println("\tSuperficie: " + this.superficie());
        System.out.println();
    }
    /**
     * Método para la superficie
     * @return la superficie de la elipse
     */
    public double superficie(){
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }
    /**
     * Desplaza el punto que representa el centro de la figura
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    /**
     * Obtiene la distancia entre 2 Elipses
     * @param otraElipse elipse respecto de la que se desea calcular la distancia
     * @return la distancia entre las elipses
     */
    public double distanciaA(Elipse otraElipse){
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }
    /**
     * Compara dos Elipses
     * @param otraElipse elipse con la que se desea comparar
     * @return la elipse de mayor superficie
     * @throws IllegalArgumentException si las superficies son iguales
     */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        } else if (this.superficie() < otraElipse.superficie()){
            return otraElipse;
        } else {
            //probando excepciones
            throw new IllegalArgumentException("Las superficies son iguales");
        }
    }
}